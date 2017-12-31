package Algorithms;

import java.util.*;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target
 * with these additional constraints:
 * all multiples of 5 in the array must be included in the group.
 * If the value immediately following a multiple of 5 is 1, it must not be chosen.
 * (No loops needed.)
 * <p>
 * <p>
 * groupSum5(0, [2, 5, 10, 4], 19) → true
 * groupSum5(0, [2, 5, 10, 4], 17) → true
 * groupSum5(0, [2, 5, 10, 4], 12) → false
 */
public class GroupIntegers {

    public static void main(String[] args) {
        int[] arr1 = {5,10,2,1};
        List<Integer> arr= Arrays.asList(5,10,2,1);
      TreeSet<Integer> map=new TreeSet<>();
      map.add(4);
      map.add(4);
      map.add(5);
      map.add(5);
        System.out.println(map);
        map.toArray();

       //System.out.println(performOps(arr));

       /* System.out.println(groupSum5(0, arr1, 19));
        System.out.println(groupSum5(0, arr1, 17));
        System.out.println(groupSum5(0, arr1, 12));*/
    }



    static ArrayList<Integer> performOps(List<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            System.out.println((A.size() - i) % A.size());
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }
    public static boolean groupSum5(int start, int[] nums, int target) {
        if (nums == null) return false;
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] % 5 == 0 && start < nums.length - 1 && nums[start + 1] == 1)
            nums[start + 1] = 0;
        if (groupSum5(start + 1, nums, target - nums[start]))
            return true;
        if (nums[start] % 5 != 0 ){
            return groupSum5(start + 1, nums, target);
        }
        else
            return false;

    }

}
