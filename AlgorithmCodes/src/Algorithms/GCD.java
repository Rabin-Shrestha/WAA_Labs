package Algorithms;

/**
 * Created by Rabin Shrestha on 12/11/2017.
 */
public class GCD {
    public static void main(String[] args) {

        System.out.println(gcd_recursive(3,9));
        System.out.println(gcd_recursive(15,45));
        System.out.println(gcd_recursive(30,15));

    }

    public static int gcd_recursive(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd_recursive(q, p % q);
    }
    public static int gcd_brutforce(int a, int b) {
        if(a==0||b==0)return a+b;
        if(a==b)return a;
        int min=1,max=1;
        int result=1;
        if(a<b){ min=a;max=b;}
        if(max%min==0)return min;

        for(int i=2; i<= min/2;i++)
        {
            if(min%i==0&&max%i==0)
                result=i;
        }
        return result;

    }

}
