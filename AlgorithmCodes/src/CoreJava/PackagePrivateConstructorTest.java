package CoreJava;

import Algorithms.LonelyInteger;

/**
 * Created by Rabin Shrestha on 11/11/2017.
 */
public class PackagePrivateConstructorTest {

    PackagePrivateConstructorTest()
    {

    }

    public static void main(String[] args) {
        //LonelyInteger lonelyInteger=new LonelyInteger();
        // here LonelyInteger is a class inside Algorithm package, which Has default constructor so we cant access outside that Algorithm package.
    }
}
