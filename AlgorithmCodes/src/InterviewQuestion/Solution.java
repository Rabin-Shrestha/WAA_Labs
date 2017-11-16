package InterviewQuestion;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Rabin Shrestha on 11/15/2017.
 */

class Record implements Comparable<Record> {
    private Long phoneNo;
    private Integer callLengthSecond;

    @Override
    public int compareTo(Record o) {
        if (!this.callLengthSecond.equals(o.callLengthSecond)) {
            return this.callLengthSecond.compareTo(o.callLengthSecond); // Call Length increasing order
        } else
            return o.phoneNo.compareTo(this.phoneNo);// phone number decreasing order
    }

    boolean isLessThanMinute(Integer n) {
        return this.callLengthSecond < (n * 60);
    }

    public Integer getCallCost() {

        if (isLessThanMinute(5))
            return callLengthSecond * 3;
        else {
            Double min = Math.ceil(this.callLengthSecond / 60);

            return getCallLengthMinute()*150;
        }
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Integer getCallLengthSecond() {
        return callLengthSecond;
    }
 public Integer getCallLengthMinute() {
    Integer val=callLengthSecond/60;
    if(callLengthSecond%60>0)val++;
        return val;
    }

    public void setCallLengthSecond(Integer callLengthSecond) {
        this.callLengthSecond = callLengthSecond;
    }

    @Override
    public String toString() {
        return "Record{" +
                "phoneNo=" + phoneNo +
                ", callLengthSecond=" + getCallLengthSecond() +
                ", callLengthMinute=" + getCallLengthMinute() +
                ", isLessThan5=" + isLessThanMinute(5) +
                '}';
    }


}


public class Solution {
    public Solution(String str) {


        /****************************************
        * Extracting the data from string parameter
        * *************************************/
        List<String> level1Records = Arrays.asList(str.split("\\r\\n|\\n|\\r"));
        Map<Long, List<Integer>> phoneNumberAndCallDurationListMap = new HashMap<>();

        /****************************************
         * Creating hashmap using phone as key and other callDuration Seconds as in  list
         * *************************************/
        for (String r1 : level1Records) {
            String[] callPhoneRec = r1.split(",");// Phone no and call Duration string
            String[] callDurationStrings = callPhoneRec[0].split(":"); // call duration string
            Integer callDuration = (Integer.parseInt(callDurationStrings[0]) * 60 * 60) + (Integer.parseInt(callDurationStrings[1]) * 60) + Integer.parseInt(callDurationStrings[2]); // total call duration in Integer
            System.out.println("Duration="+callPhoneRec[0]+" Phone="+ callPhoneRec[1]);
            Long phoneno = Long.parseUnsignedLong(callPhoneRec[1].replace("-", "")); // Phone number
            if (phoneNumberAndCallDurationListMap.containsKey(phoneno)) {
                phoneNumberAndCallDurationListMap.get(phoneno).add(callDuration);
            } else {
                List<Integer> cd = new ArrayList<>();
                cd.add(callDuration);
                phoneNumberAndCallDurationListMap.put(phoneno, cd);
            }
        }

        /****************************************
         * Creating list of Records from above hashMap
         * *************************************/
        List<Record> callRecordList = new ArrayList<>();
        for (Long phoneNo : phoneNumberAndCallDurationListMap.keySet()) {

            Record r = new Record();
            r.setPhoneNo(phoneNo);
            // Calculatiing total sum of call duration in Each key
            Integer durationSum = phoneNumberAndCallDurationListMap.get(phoneNo).stream().collect(Collectors.summingInt(Integer::intValue));
            r.setCallLengthSecond(durationSum);
            callRecordList.add(r);

        }

        System.out.println(" Record List is :");
        System.out.println(callRecordList);
        /****************************************
         * Sorting the list of records : Ascending order ( Total CallDuration ) Descending : phone Number
         * *************************************/
        System.out.println(" Sorted Record list");
        Collections.sort(callRecordList);

        System.out.println(callRecordList);
        /****************************************
         * According to the question it says maxm duration of call will be discounted on bill cost
         * *************************************/
        System.out.println("Record to eliminate " + callRecordList.remove(callRecordList.size() - 1));

        System.out.println("After Elimination of Maximum value of Record " + callRecordList);


        /****************************************
         * Calculating the total Bill amount
         * *************************************/
        Integer totalBillAmount = callRecordList.stream().map(r -> r.getCallCost()).collect(Collectors.summingInt(Integer::intValue));

        System.out.println("The total cost is " + totalBillAmount);

    }

    public static void main(String[] args) {

        //String data="00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
        String data = "00:01:07,400-234-090\n" +
                "00:05:01,701-080-080\n" +
                "00:05:00,400-234-090";
        new Solution(data);

        }


}
