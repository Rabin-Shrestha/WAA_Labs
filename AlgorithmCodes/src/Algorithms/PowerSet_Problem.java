package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/12/2017.
 * Finding all subsets of a given set in Java
 * 2.3
 * Problem: Find all the subsets of a given set.
 * <p>
 * Input:
 * S = {a, b, c, d}
 * Output:
 * {}, {a} , {b}, {c}, {d}, {a,b}, {a,c},
 * {a,d}, {b,c}, {b,d}, {c,d}, {a,b,c},
 * {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
 * <p>
 * /* Simple Example
 * arr=> {a,b }
 * if array Size= 2 ==> total subset size => 2^2=4== I.e {},{a},{b},{a,b}
 * lets replace value of bit form a number
 * 0=00 ==> 0
 * 1=01  ==> a
 * 2=10==> b
 * 3=11==> a,b
 */

public class PowerSet_Problem {
    public static void main(String[] args) {

        Character[] arr = {'a', 'b', 'c'};
        List<ArrayList<Character>> result = getPowerSet(arr);

        System.out.println(result);

    }

    public static List<ArrayList<Character>> getPowerSet(Character[] arr) {
        // Total no of element in powerSet = 2^arr.size
        List<ArrayList<Character>> resultPowerset = new ArrayList<ArrayList<Character>>();
        // Task 1 : Find SubSet
        for (Integer i = 0; i < Math.pow(2, arr.length); i++) {
            // Lets move inside each bit of value i
            ArrayList<Character> temp = new ArrayList<>();
            for (Integer j = 0; j < arr.length; j++) {
                // to check if Jth bit of value I is 1 or not : if 1==> put value at index j from arr in sub array
                if ((i & (1 << j)) > 0)
                    temp.add(arr[j]);
            }
            //Task2 : Merge
            resultPowerset.add(temp);
        }

        return resultPowerset;

    }
}
