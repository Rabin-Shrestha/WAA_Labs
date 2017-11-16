package Algorithms;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 11/11/2017.
 * =====================================================
 * Consider an array of  integers, , where all but one
 * of the integers occur in pairs. In other words, every
 * element in  occurs exactly twice except for one unique element.
 *
 *  Given , find and print the unique element.

 * ==========================================================
URL : https://www.hackerrank.com/challenges/ctci-lonely-integer/problem
 */
public class LonelyInteger {

    LonelyInteger()
    {
        System.out.println(" Created Lonely Integer Object");
    }
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(1,1,2,2,3,3,4,5,5,4,7);
        System.out.println(arr.toString());
        System.out.println("The Lonely integer is :"+ getLonelyInteger(arr));
        Integer[] arr1={1,1,2,2,3,3,4,5,5,4,7};
        System.out.println("The Lonely integer is :"+ getLonelyUsingBitOperator(arr1));

    }
    static Integer getLonelyInteger(List<Integer> arr) {
        return arr.stream().filter(x -> arr.indexOf(x) == arr.lastIndexOf(x)).findFirst().orElse(0);
    }
    static Integer getLonelyUsingBitOperator(Integer[] arr)
    {
        Integer result=0;
        for(Integer x: arr)
        {
         result^=x;
        }
        return result;
    }
}
