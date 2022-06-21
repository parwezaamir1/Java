package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Learning basics of arrays
//        int[] myIntArray = new int[10];   //{1,2,3,4,5,6,7,8,9,10}  It is going to store 10 elements. Counting from 0 to 9
////        myIntArray[0] = 45;
////        myIntArray[1] = 67;
////        myIntArray[5] = 56;
////        myIntArray[10] = 456;
////        System.out.println(myIntArray[0]);
////        System.out.println(myIntArray[1]);
////        System.out.println(myIntArray[5]);
////        System.out.println(myIntArray[10]);   // ArrayIndexOutOfBoundException
//
////        for (int i=0; i<10; i++){
////            myIntArray[i] = i*10;
////            System.out.println("Element "+i+", value is "+myIntArray[i]);
////        }
////        for (int i=0; i< myIntArray.length; i++){
////            myIntArray[i] = i*10;
////              System.out.println("Element "+ i + ", value is "+array[i]);
////        }
//        printArrays(myIntArray);
//    }
//
//    public static void printArrays(int[] array){
//        for (int i=0; i< array.length; i++){
//            array[i] = i*10;
//            System.out.println("Element "+ i + ", value is "+array[i]);
//        }

        //main use case of array
        int[] myInteger = getInteger(5);
        for (int i=0; i< myInteger.length; i++){
            System.out.println("Element "+i+ " typed value was "+myInteger[i]);
        }
        System.out.println("Average is "+getAverage(myInteger));
    }
    public static int[] getInteger(int number){
        System.out.println("Enter number "+number+ " integer values.\r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0; i< array.length; i++){
            sum += array[i];
        }
        return (double)(sum / array.length);
    }
}
