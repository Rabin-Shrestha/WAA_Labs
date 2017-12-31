package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/11/2017.
 * N light bulbs are connected by a wire. Each bulb has a switch associated with it,
 * however due to faulty wiring, a switch also changes the state of all the bulbs to
 * the right of current bulb. Given an initial state of all bulbs, find the minimum number
 * of switches you have to press to turn on all the bulbs.
 * You can press the same switch multiple times.

 Note : 0 represents the bulb is off and 1 represents the bulb is on.

 Example:

 Input : [0 1 0 1]
 Return : 4

 Explanation :
 press switch 0 : [1 0 1 0]
 press switch 1 : [1 1 0 1]
 press switch 2 : [1 1 1 0]
 press switch 3 : [1 1 1 1]
 */
public class Bulp {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 0, 1, 1);
        int result = bulbs(list);
        System.out.println(result);
        System.out.println("hello rabin");
    }

    public static int bulbs(List<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                count = count + 1;
                for (int j = i + 1; j < arr.size(); j++) {
                    arr.set(j,  arr.get(j) == 1 ? 0 : 1);
                }
            }
        }
        return count;
    }
    // More Efficient
    public int bulbs(ArrayList<Integer> a) {
        int ans = 0;
        for(int i = 0 ; i < a.size(); i++) {
            if((ans % 2 + a.get(i)) %2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
