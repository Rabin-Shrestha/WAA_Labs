package Algorithms;

/**
 * Created by Rabin Shrestha on 12/23/2017.
 */
public class RecursionReverseString {
    public static void main(String[] args) {
        System.out.println(getReverseString("","ABCDE"));
    }
    static String getReverseString(String reverseStr,String str) {
        if (str.isEmpty() || str.length() == 0) {
            return reverseStr;
        } else {
            getReverseString(reverseStr + str.charAt(str.length() - 1), str.substring(0, str.length() - 1));
            return getReverseString(reverseStr + str.charAt(str.length() - 1), str.substring(0, str.length() - 1));

        }

    }
}
