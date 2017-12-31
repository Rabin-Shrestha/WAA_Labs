package Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created by Rabin Shrestha on 12/13/2017.
 *
 Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

 Example :

 Input :

 A : [1 5 3]
 k : 2
 Output :

 1
 as 3 - 1 = 2

 Return 0 / 1 for this problem.
 Clarify the Question
 Notes

 */
public class MakeIntegerSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Set s= hm.keySet();

    }
    public int diffPossible(final List<Integer> a, int b) {

        // step 1: initial validation
        // step 2: HashMap<Integer,Integer> hm : add all value form a
        // step 3: check hm if there exist any partial value making sum to b

        if(a.size()<2)return 0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<a.size();i++){
            hm.put(a.get(i),i);
        }

        for(int i=0;i<a.size();i++)
        {
            int target=a.get(i)-b;
            if(hm.containsKey(target))
            {
                if(hm.get(target)!=i)
                    return 1;
            }
        }
        return 0;




    }
}
