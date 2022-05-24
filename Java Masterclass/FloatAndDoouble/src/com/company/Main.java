package com.company;

public class Main {

    public static void main(String[] args) {
        // For Float data type
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        // For Double data type
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myFloat = (float) 5 / 2;   //we need to cast or use f in case of float
        double myDoubleValue = (double) 5 / 3;  //by Default double
        double myDoubleValue1 =  5.0 / 3.0;  //by Default double
        System.out.println("Integer = " + myIntValue);
        System.out.println("Floating point number = " + myFloatValue);
        System.out.println("Double = " + myDoubleValue1);

        //challenges
        double numberOfPounds = 200d;
        double numberOfKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + numberOfKilograms);


    }
}
