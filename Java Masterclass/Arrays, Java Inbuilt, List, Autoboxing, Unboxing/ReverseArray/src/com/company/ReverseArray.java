package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scanner;
    public static void main(String[] args){
        int[] returnedInteger = readInteger(5);
        System.out.println("Array = "+ Arrays.toString(returnedInteger));

        reverse(returnedInteger);
        System.out.println("Reverse array = "+Arrays.toString(returnedInteger));
    }
    public static int[] readInteger(int capacity){
        scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter capacity: "+ capacity);
        for (int i=0; i< array.length; i++){
            int value = scanner.nextInt();
            scanner.nextLine();
            array[i] = value;
        }
        return array;
    }
    private static void reverse(int[] array){
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

    }
}
