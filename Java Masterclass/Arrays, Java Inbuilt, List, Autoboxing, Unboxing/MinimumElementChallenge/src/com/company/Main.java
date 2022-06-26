package com.company;
//Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//        -Finally, print the minimum element in the array.
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int returnedReadInteger = readInteger();
        int[] returnedReadElements = readElements(returnedReadInteger);
        int returnedMin = findMin(returnedReadElements);
        System.out.println("min= "+returnedMin);

    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter capacity:");
        int capacity = scanner.nextInt();
        return capacity;
    }
    private static int[] readElements(int values){
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[values];
        for(int i=0; i<elements.length; i++){
            System.out.println("Enter a number");
            int totalElementEntered = scanner.nextInt();
            scanner.nextLine();
            elements[i] = totalElementEntered;

        }
        return elements;
    }
    private static int findMin(int[] count){
        int min = Integer.MAX_VALUE;
        for(int i=0; i< count.length; i++) {
            int minVal = count[i];
            if (minVal < min) {
                min = minVal;
            }
        }
        return min;
    }
}
