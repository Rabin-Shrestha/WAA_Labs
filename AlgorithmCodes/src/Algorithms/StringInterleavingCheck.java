package Algorithms;

import java.util.Arrays;

/**
 * Created by Rabin Shrestha on 12/12/2017.
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

 Example,
 Given:

 s1 = "aabcc",
 s2 = "dbbca",
 When s3 = "aadbbcbcac", return true.
 When s3 = "aadbbbaccc", return false.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class StringInterleavingCheck {
    public int isInterleave(String a, String b, String c) {
        String res = a + b;
        String[] arrofS = res.split("");
        String [] ResC = c.split("");
        Arrays.sort(arrofS);
        Arrays.sort(ResC);
        if(arrofS.length != ResC.length){
            return 0;
        }else
        {

            for (int i=0; i<arrofS.length;i++){
                if( !ResC[i].equalsIgnoreCase(arrofS[i])){
                    return 0;
                }
            }

        }
        return 1;
    }
}
