package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/27/2017.
 */
public class MaxPopulationAlgorithm {
    public static void main(String[] args) {

        List<Integer[]> censusInfo=new ArrayList<>();
        Integer[] record={2000,2006};
        censusInfo.add(record);
        Integer[] record1={2000,2006};
        censusInfo.add(record1);
        Integer[] record2={2003,2008};
        censusInfo.add(record2);
        Integer[] record3={2004,2008};
        censusInfo.add(record3);

        System.out.println(maxPopulationYear(censusInfo));


    }
    static Integer maxPopulationYear(List<Integer[]> dateInfoList)
    {
        // Step 1: Creating hm for saving each person count in a particulat year
        // Step 2: go through each information and update hm
        // Step 3: find year with max value
        // step 4: return
        if( dateInfoList==null|| dateInfoList.size()==0)return 0;

        HashMap<Integer,Integer> hm_yearPop= new HashMap<>();

        for (Integer[] record: dateInfoList) {

            for(Integer year=record[0];year<=record[1]; year++ )
            {
                if(hm_yearPop.get(year)==null)
                {
                    hm_yearPop.put(year,1);
                }
                else
                {
                    hm_yearPop.put(year, hm_yearPop.get(year)+1);
                }
            }
        }

      return hm_yearPop.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
        
    }
}
