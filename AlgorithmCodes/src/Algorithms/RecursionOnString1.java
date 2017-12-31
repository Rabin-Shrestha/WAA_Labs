package Algorithms;

/**
 * Created by Rabin Shrestha on 11/21/2017.
 * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.


 changeXY("codex") → "codey"
 changeXY("xxhixx") → "yyhiyy"
 changeXY("xhixhix") → "yhiyhiy"
 */
public class RecursionOnString1 {
    public static void main(String[] args) {
        System.out.println(changeXY("codey"));
        System.out.println(changeXY("yyhiyy"));
        System.out.println(changeXY("yhiyhiy"));
        System.out.println(changeXY("x"));
        System.out.println(changeXY("a"));
        System.out.println(changeXY(""));
    }

    public static String changeXY(String str) {
        if (str == null)return "";
        if(str.length()<1)
            return "";
         if(str.charAt(0)=='x')
             return  'y'+changeXY(str.substring(1));
         else
         return str.charAt(0)+changeXY(str.substring(1));
    }

}
