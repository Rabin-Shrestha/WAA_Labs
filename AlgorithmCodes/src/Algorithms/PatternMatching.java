package Algorithms;

/**
 * Created by Rabin Shrestha on 12/29/2017.
 */
public class PatternMatching {
    public static void main(String[] args) {
        String mainString="abcdefghjlksdhflkahl";
        String pattern="dhf";
        System.out.println(findPattern(mainString,pattern));

    }
    static Integer findPattern(String inputString,String pattern)
    {
        if(inputString==null|| inputString.isEmpty()|| pattern==null|| pattern.isEmpty())return -1;

        Integer pSize=pattern.length();
        Integer sSize=inputString.length();
        if(pSize>sSize)return -1;
        for(int i=0;i<sSize-pSize;i++)
        {
            String temp=inputString.substring(i,i+pSize);
            if(temp.equals(pattern))return i;
        }
        return -1;
    }
    static Integer findPattern_RabinCarpAlgorithm(String inputString,String pattern) {
        if(inputString==null|| inputString.isEmpty()|| pattern==null|| pattern.isEmpty())return -1;

        for(int i=0;i<inputString.length();i++){

        }

        return -1;
    }
    static Integer getHasCode(String str) {
        Integer prime=3;
        Double hashCode=0.0;
        for(int i=0;i<str.length();i++)
            hashCode+=str.charAt(i)*Math.pow(prime,i);
        hashCode=hashCode/prime;
        return Integer.valueOf(hashCode.toString());

    }
    static Integer reHashing(String str,int removeCharIndex, int addCharIndex) {



        return null;
    }
}
