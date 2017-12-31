package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/25/2017.
 */
public class BinaryOperation {
    public static void main(String[] args) {
            Double val= Math.pow(3,8);
        System.out.println(val);
        System.out.println("\n Total 1 in number : "+getOnceCount(val.intValue()));
        System.out.println("\n Binary digit : "+getBinaryValue(val.intValue()));

    }
   static Integer getOnceCount(Integer x)
    {
        int count =0;
        while(x>0)
        {
            if((x&1)==1)count++;
            x=x>>1;
        }
        return count;
    }
    static List<Integer> getBinaryValue(Integer x)
    {
        List <Integer> bits= new ArrayList<>();
        while(x>0)
        {
            bits.add((x&1)); // AND operation with 1 to check very first bit from right
            x=x>>1; // right shift by 1 bit to delete first bit
        }
        return bits;
    }

}
