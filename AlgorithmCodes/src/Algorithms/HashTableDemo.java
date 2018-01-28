package Algorithms;

import java.util.Hashtable;

/**
 * Created by Rabin Shrestha on 1/9/2018.
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"Sunday");
        ht.put(2,"Monday");
        ht.put(6,"Friday");
        ht.put(7,"Saturday");
        ht.put(3,"Tuesday");
        ht.put(4,"Wednesday");
        ht.put(5,"Thursday");
        //ht.put(null,"NULL Entry");// HashTable Dont support Null Key
        //ht.put(100,null);// HashTable Dont support Null value
        // And Hash Table sort data Automatically
        //ht.entrySet().stream().forEach(es-> System.out.println(es.getKey()+"==> "+es.getValue()));





    }
}
