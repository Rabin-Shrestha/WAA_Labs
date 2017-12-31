package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/23/2017.
 */
public class PermutationFinder {
    public static void main(String[] args) {

        //getPermutation("ABC");
        System.out.println(getPermutationList("ABC"));

    }

    static List<String> getPermutationList(String str) {
        if (str == null || str.length() == 0) return null;
        return getPermutationListHelper("", str);

    }

    private static List<String> getPermutationListHelper(String permutationStr, String str) {
        List<String> permutationList = new ArrayList<>();
        if (str.isEmpty() || str.length() == 0) {
            permutationList.add(permutationStr);
            System.out.println(permutationStr);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permutationList.addAll(getPermutationListHelper(permutationStr + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length())));
            }
        }
        return permutationList;


    }

}
