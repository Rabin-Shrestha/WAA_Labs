package Algorithms;

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
        List<Integer> arr= Arrays.asList(723, 256, 668, 723, 140, 360, 597, 233, 128, 845, 737, 804, 986, 701, 906, 512, 845, 510, 510, 227, 430, 701, 366, 946, 464, 619, 946, 627, 209, 771, 424, 555, 959, 711, 530, 937, 716, 261, 505, 658, 706, 140, 511, 277, 396, 233, 819, 196, 475, 906, 583, 261, 147, 658, 517, 197, 196, 702, 944, 711, 128, 555, 149, 483, 530, 291, 716, 258, 430, 464, 601, 749, 149, 415, 802, 573, 627, 771, 660, 601, 360, 986, 291, 51, 415, 51, 227, 258, 937, 366, 923, 669, 33, 517, 417, 702, 475, 706, 110, 417, 275, 804, 500, 473, 746, 973, 669, 275, 973, 147, 817, 657, 277, 923, 144, 660, 197, 511, 793, 893, 944, 505, 322, 817, 586, 512, 322, 668, 33, 424, 962, 597, 144, 746, 345, 753, 345, 269, 819, 483, 368, 802, 573, 962, 583, 615, 208, 209, 269, 749, 256, 657, 619, 893, 959, 473, 753, 299, 396, 299, 500, 368, 586, 110, 793, 737, 615 );
        System.out.println(arr.toString());
        System.out.println("The Lonely integer is :"+ getLonelyInteger(arr));
        Integer[] arr1={1,1,2,2,3,3,4,5,5,4,7};
        //System.out.println("The Lonely integer is :"+ getLonelyUsingBitOperator(arr1));

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
