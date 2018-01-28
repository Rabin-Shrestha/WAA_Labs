package Algorithms;

import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        if (n<1) return null;
        List<String> resultList =new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(0==i%3 && 0==i%5)
                resultList.add("FizzBuzz");
            else if(0==i%3)
                resultList.add("Fizz");
            else if(0==i%5)
                resultList.add("Buzz");
            else
                resultList.add(i+""); 
        }
        return resultList;
        
    }
}