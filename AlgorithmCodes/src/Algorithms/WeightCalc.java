package Algorithms;

import java.util.Scanner;

class WeightCalc {

    WeightCalc(String scannedInput) {
        try {
            int intInput = Integer.parseInt(scannedInput);
            String answer = calculateWeights(intInput);        //here is the call to your method
            System.out.println(answer);
        } catch (NumberFormatException nfe) {
            System.err.println("This array element is not an Integer: " + scannedInput);
            return;
        }
    }

    // TODO write the calculateWedights method to accept an integer and return a String
    public static String calculateWeights(Integer st) {
        if (st == null) return "";
        String targetVariables = "";
        Integer numberOfFive = st / 5;
        Integer numberOfOne = st % 5;
        targetVariables = "To make " + st + "kg, we would need \"" + numberOfFive + " " + numberOfOne + "\"";
        return targetVariables;

    }

    public static void main(String[] args) { //grab input from STDIN
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) new WeightCalc(scan.nextLine());
        scan.close();
    }
}