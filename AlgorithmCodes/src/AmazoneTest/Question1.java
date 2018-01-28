package AmazoneTest;

import java.util.*;

/**
 * Created by Rabin Shrestha on 1/10/2018.
 */
public class Question1 {
    public static void main(String[] args) {

        System.out.println(subStringLessKDist("awagkawwgkawgkkawagkggawk", 4));
    }

    public static List<String> subStringLessKDist(String inputString, int num) {
        List<String> resultSubString = new ArrayList<>();
        int n = inputString.length();
        for (int i = 0; i <= n - num; i++) {

            String subString = inputString.substring(i, i + num);
            Set<Character> uniquesWithOneCharSet = new HashSet<>();
            for (int j = 0; j < subString.length(); j++) {
                uniquesWithOneCharSet.add(subString.charAt(j));
            }
            if (uniquesWithOneCharSet.size() == num - 1) {
                resultSubString.add(subString);
            }
        }
        return resultSubString;
    }
}
