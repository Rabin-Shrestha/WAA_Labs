package Algorithms;

/**
 * Created by Rabin Shrestha on 12/28/2017.
 *
 * Given an array of numbers, Find the Maximum SubArraySum with Index
 *  [-2, -3, 4, -1, -2, 1]﻿
 *  max sub array Sum is = 4
 *
 *  solution
 * From kadanes algorithm we know the fact that; The Maximum subsum would be maxSum ending at i-1 pos, or including ith position
 * X= (MaxSum ending at i-1th index)
 * maxSum= Max (X  ,  X+(Value at ith position)
 *
 */
public class MaxSubArray_KadanesAlgo {
    public static void main(String[] args) {


            Integer[] arr={4,-2,4,3,2,-1};

        Integer[] maxSubSetSumDetails=getMaxSubArraySumIndex(arr);
        System.out.println("Left Index "+maxSubSetSumDetails[0]);
        System.out.println("Right Index "+maxSubSetSumDetails[1]);
        System.out.println("Max Sum  "+maxSubSetSumDetails[2]);

    }

    static Integer [] getMaxSubArraySumIndex(Integer[] arr)
    {
        if(arr==null||arr.length<1)return null;
        Integer gLeftIndex=0;
        Integer gRightIndex=0;
        Integer gMaxSum=arr[0];

        Integer currentLeftIndex=0;
        Integer currentRightIndex=0;

        Integer maxCurrentSum=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>=maxCurrentSum+arr[i]) {
                maxCurrentSum = arr[i];
                currentLeftIndex = i;
                currentRightIndex = i;
            }else {
                currentRightIndex=i;
                maxCurrentSum = maxCurrentSum + arr[i];
            }

            if(maxCurrentSum>gMaxSum){
                gMaxSum=maxCurrentSum;
                gLeftIndex=currentLeftIndex;
                gRightIndex=currentRightIndex;

            }

        }


        Integer [] result={gLeftIndex,gRightIndex,gMaxSum};
        return result;
    }

}
