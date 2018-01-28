package CoreJava;

/**
 * Created by Rabin Shrestha on 1/12/2018.
 */
public class EqualsInJava {
    public static void main(String[] args) {
        System.out.println("======String comparasion========");
        String s1="rabin";
        String s2="rabin";
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true

        String s3=new String("rabin");
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s3);//false

        System.out.println("========Number comparision======");
        Integer num1=10;
        int num2=10;
        System.out.println(num1==num2);//true
        System.out.println(num1.equals(num2));//true

        int num3=10;
        System.out.println(num2==num3);//true

        Integer num4=new Integer(10);
        System.out.println(num1==num4);//false
        System.out.println(num1.equals(num4));//true

    }
}
