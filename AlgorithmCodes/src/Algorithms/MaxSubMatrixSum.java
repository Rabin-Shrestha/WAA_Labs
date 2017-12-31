package Algorithms;

import java.util.HashMap;

/**
 * Created by Rabin Shrestha on 12/28/2017.
 * Given the matrix find the maximum sum of subMatrix starting from mat[0][0] value.
 * you should also return related row ans column index.
 */
public class MaxSubMatrixSum {
    public static void main(String[] args) {

        Integer[][] mat= new Integer[][]{{30,-5,-9,2},{-2,-5,-2,7},{3,-2,-10,13},{-8,-3,10,-2}};
     Integer [] maxSubMatrixSumInfo=getMaxSubMatrixSum(mat);
        System.out.println("Row Index "+maxSubMatrixSumInfo[0]);
        System.out.println("Col Index "+maxSubMatrixSumInfo[1]);
        System.out.println("Max Sum "+maxSubMatrixSumInfo[2]);

        maxSubMatrixSumInfo=getMaxSubMatrixSum_Memoized(mat);
        System.out.println("======Optimized=========");
        System.out.println("Row Index "+maxSubMatrixSumInfo[0]);
        System.out.println("Col Index "+maxSubMatrixSumInfo[1]);
        System.out.println("Max Sum "+maxSubMatrixSumInfo[2]);

    }
    static Integer[] getMaxSubMatrixSum_Memoized(Integer[][] mat) {

        Integer globalMaxSum=0;
        Integer globalMaxSumIndex_i=0;
        Integer globalMaxSumIndex_j=0;

        HashMap<Integer,Integer> sumTrackerHm=new HashMap<>();
        sumTrackerHm.put(0,mat[0][0]);

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<4;j++) {
                Integer rectSum_ij=0;
                if(sumTrackerHm.get(i*10+j)!=null) {
                    rectSum_ij=sumTrackerHm.get(i*10+j);
                }else {
                    int prevRectSum=0;
                    if(i==0){
                         prevRectSum=sumTrackerHm.get((i*10+j)-1)+mat[i][j];
                    }
                    else {
                        prevRectSum=sumTrackerHm.get((i*10+j)-10);
                        for(int x=0;x<=j;x++)
                            prevRectSum+=mat[i][x];
                    }

                    rectSum_ij=prevRectSum;
                    sumTrackerHm.put(i*10+j,rectSum_ij);
                }


                if(rectSum_ij>globalMaxSum) {
                    globalMaxSum = rectSum_ij;
                    globalMaxSumIndex_i=i;
                    globalMaxSumIndex_j=j;
                }

            }

        }
        Integer[] result={globalMaxSumIndex_i,globalMaxSumIndex_j,globalMaxSum};
        return result;
    }

    static Integer[] getMaxSubMatrixSum(Integer[][] mat) {

        Integer globalMaxSum=0;
        Integer globalMaxSumIndex_i=0;

        Integer globalMaxSumIndex_j=0;
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<4;j++) {
                Integer rectSum_ij=0;
                for(int x=0;x<=i;x++){
                    for(int y=0;y<=j;y++){
                        rectSum_ij+=mat[x][y];
                    }
                }
                if(rectSum_ij>globalMaxSum) {
                    globalMaxSum = rectSum_ij;
                    globalMaxSumIndex_i=i;
                    globalMaxSumIndex_j=j;
                }

            }

        }
        Integer[] result={globalMaxSumIndex_i,globalMaxSumIndex_j,globalMaxSum};
        return result;
    }
}
