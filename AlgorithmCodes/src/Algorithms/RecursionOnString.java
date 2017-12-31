package Algorithms;

/**
 * Created by Rabin Shrestha on 11/21/2017.
 * Type Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */
public class RecursionOnString {
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhixxhixhix"));
        System.out.println(countHi("hi"));

    }

    private static int countHi(String str) {
        if (str != null)return 0;
        if(str.length() < 2)
            return 0;
        if (str.substring(str.length() - 2, str.length()).equals("hi"))
            return 1 + countHi(str.substring(0, str.length() - 1));
        return countHi(str.substring(0, str.length() - 1));
    }

}
