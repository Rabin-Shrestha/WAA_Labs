package CoreJava;

import java.math.BigInteger;

/**
 * Created by Rabin Shrestha on 11/11/2017.
 */
public class RecursionVsIteration {
    public static void main(String[] args) {
        final long start, end;
        start = System.currentTimeMillis();
        BigInteger result= bigIterativeFactorial(5);
        end = System.currentTimeMillis();
        System.out.println("Total Exec time :"+(end - start));
        System.out.println("Factorial Value is :"+result);
    }

    static long smallFactorial_Recursion(int n) {
        if (n < 2) return 1;
        return n * smallFactorial_Recursion(n-1);
    }

     static BigInteger bigIterativeFactorial(int x) {
        BigInteger result = BigInteger.ONE;
         if(x<2)return result;

         for(int i=x; i>1;i--)
            result =result.multiply(BigInteger.valueOf(i));
        return result;

    }

    static BigInteger getBigFactorial_Recursion(int x) {
        if(x<2)return BigInteger.ONE;
        return getBigFactorial_Recursion(x-1).multiply(BigInteger.valueOf(x));
    }


}
