package Algorithms;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Rabin Shrestha on 12/25/2017.
 * /**
 * Write a program that outputs all possibilities to put + or - or nothing
 * between the numbers 1,2,3,4,5....9(in this order) such that the result
 * is always GivenSum ( eg:100) . For example : 1+2+34-5+67-8+9=100
 *
 */
public class Sum100 {
    public static void main(String[] args)throws Exception {

         //the total inner place to put sign are : 8
        // possible sign are : 3
        // total combination : 3^8
        System.out.println(Math.pow(3,8));

        List<Character> signs= Arrays.asList('+','-','&');
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Integer sum=100;
        Integer numberInnerLength=numbers.size()-1;
        Double cLength=Math.pow(signs.size(),numberInnerLength);
        List<HashMap<Integer,String>> combination=new ArrayList<>();


        // pushing digit 1-9 in appropriate place leaving space for posisble sign
        for(Integer i=0;i<cLength;i++) {
            HashMap<Integer,String> vals=new HashMap<>();
            for(int j=0;j<numberInnerLength;j++) {
                vals.put(j * 2, numbers.get(j) + "");
            }
            vals.put(numberInnerLength*2,"9");
            combination.add(vals);
        }

        //Pushing the signs ( +, - or & ) in 8 possible place
        for (int k = 0; k < numberInnerLength; k++) {
            Double periodLength = cLength /( Math.pow(signs.size(), k+1));
            int signIndex = 0;
            for (int i = 0; i < cLength; i+=periodLength) {
                for (int j = 0; j < periodLength && i+j < cLength; j++) {
                    combination.get(i+j).put((k*2)+1,signs.get(signIndex)+"");
                }
                signIndex = (signIndex+1)%signs.size();
            }
        }

        // THis is the all possible combination we can have
        System.out.println(combination);
        //now check each combination for it it make up to 100 or not
        for(HashMap<Integer,String> h : combination)
        {
            Integer total=0;
            Integer prevDigit=1;
            StringBuilder exp=new StringBuilder("");
             h.values().forEach(s->exp.append(s));
             String expTemp=exp.toString().replace("&","");

            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Integer result = (Integer)engine.eval(expTemp);
            if(result==sum)
                System.out.println(expTemp);

        }

    }
    }
