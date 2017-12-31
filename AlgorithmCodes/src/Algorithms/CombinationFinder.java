package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/10/2017.
 * A function that returns all the possible combination of characters on th given String
 */
public class CombinationFinder{
    public static void main(String[] args) {

        List<String> resultCombination = new ArrayList<>();
        System.out.println("a".substring(1));
        //System.out.println("a".substring(1));
        //System.out.println(getWordCombinationHelper("ABC", 2, "", resultCombination));
        getWordCombinationHelper("ABCD",2,"");

    }

    public static void getWordCombinationHelper(String inputString, int length, String tempStr) {
        // Step: Will do Recursion
        // ABCD==> AB, AC, AD,BC,BD,CD
        // ABCDE==> ABC, ABD, ABE,BCD,BCE,CDE
        List<String> combinationListUnit=new ArrayList<>();

        if (inputString.length()==0 ||tempStr.length() == length) {
           if (tempStr.length() == length) {
               combinationListUnit.add(tempStr);
                System.out.println(tempStr);
            }
        }
        else {
            getWordCombinationHelper(inputString.substring(1), length, tempStr+inputString.charAt(0));
            getWordCombinationHelper(inputString.substring(1), length, tempStr);
        }
    }


    private static void printCombinations(String soFar, int[] array, int r) {
        if (array.length == 0 || soFar.length() == r) {
            if (soFar.length() == r) System.out.println(soFar);
        } else {
            printCombinations(soFar + array[0], Arrays.copyOfRange(array, 1, array.length), r);
            printCombinations(soFar, Arrays.copyOfRange(array, 1, array.length), r);
        }
    }



}





