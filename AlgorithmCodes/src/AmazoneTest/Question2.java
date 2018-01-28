package AmazoneTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rabin Shrestha on 1/10/2018.
 */
public class Question2 {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static List<Integer> subSequenceTags(List<String> targetList, List<String> availableTagList) {
        // WRITE YOUR CODE HERE
        List<Integer> indexList = new ArrayList<>();
        if (targetList == null || targetList.isEmpty() || availableTagList == null || availableTagList.isEmpty()) {
            indexList.add(0);
            return indexList;
        }
        int tListSize = targetList.size();
        int aListSize = availableTagList.size();

        int maxIndexDiff = Integer.MAX_VALUE;
        int minIndex = Integer.MIN_VALUE;
        int maxIndex = Integer.MAX_VALUE;
        for (int i = 0; i <=aListSize - tListSize; i++) {

            for (int j = tListSize; i+j <= aListSize; j++) {

                String[] tempArr = new String[j];
                System.arraycopy(availableTagList.toArray(), i, tempArr, 0, j);
                System.out.println(Arrays.toString(tempArr));
                List<String> tempList = Arrays.asList(tempArr);
                if(tempList.containsAll(targetList))
                {
                    int diff=j<0?-j: j;
                    if(maxIndexDiff>diff)
                    {
                        //  System.out.println(i+" "+j+"==>"+Arrays.asList(tempArr).toString());
                        maxIndexDiff=j;
                        minIndex=i;
                        maxIndex=i+j-1;
                    }

                }

            }
        }

        if(minIndex==Integer.MIN_VALUE && maxIndex==Integer.MAX_VALUE)
            indexList.add(0);
        else
        {
            indexList.add(minIndex);
            indexList.add(maxIndex);
        }
        return indexList;
    }


    public static void main(String args[]) {
        List<Integer> output = subSequenceTags(Arrays.asList("made", "in", "spain"),
                Arrays.asList("a", "made", "in", "spain", "a", "b", "c", "d", "made", "a", "in", "b"));
        System.out.println(output);

    }
}
