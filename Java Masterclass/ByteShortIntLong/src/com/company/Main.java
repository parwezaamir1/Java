package com.company;

public class Main {

    public static void main(String[] args) {

        // For Integer data type
        int myMinIntValue = Integer.MIN_VALUE;
        int myIntMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myIntMaxValue);
        System.out.println("Busted MAx value = " +(myIntMaxValue + 1)); //Overflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1)); //Underflow

        //For Byte data type
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        //For Short data type
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+ myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        //For Long data type
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+ myMinLongValue);
        System.out.println("Long Maximum Value = "+ myMaxLongValue);

        //Casting
        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue /2);

    }
}
