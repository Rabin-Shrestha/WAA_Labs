package Algorithms;

import java.util.Arrays;
public class MergeSortedArray {
   public static void main(String[] args) {
      int[] arr1 = { 1, 18, 22, 100, 105, 1002 };
      int[] arr2 = { 16, 17, 19, 21, 1001 };

   }
   static int[] mergeAndSort(int[] arr1, int[] arr2)
   {
       int[] resultArray = new int[arr1.length + arr2.length];
       int i = 0, j = 0, k = 0;
       while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               resultArray[k] = arr1[i];
               i++;
           } else {
               resultArray[k] = arr2[j];
               j++;
           }
           k++;
       }

       // Copy the remaining elements in array 1 to array 3
       if (i < arr1.length) {
           // arraycopy(source, sourcepos, dest, destpos, numOfElements)
           System.arraycopy(arr1, i, resultArray, k, (arr1.length - i));
       }

       // Copy the remaining elements in array 2 to array 3
       if (j < arr2.length) {
           // arraycopy(source, sourcepos, dest, destpos, numOfElements)
           System.arraycopy(arr2, j, resultArray, k, (arr2.length - j));
       }
       System.out.println("Merged Sorted Array" + Arrays.toString(resultArray));
       return  resultArray;
   }
}