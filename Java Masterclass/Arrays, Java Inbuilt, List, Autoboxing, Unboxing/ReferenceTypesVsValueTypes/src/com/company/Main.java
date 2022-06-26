package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Values types
        // It holds different memory location for each variable
        int myIntvalue=10;
        int myAnotherIntValue = myIntvalue;

        System.out.println("MyIntValue "+myIntvalue);
        System.out.println("MyAnotherIntValue "+myAnotherIntValue);

        myAnotherIntValue++;
        System.out.println("MyIntValue "+myIntvalue);
        System.out.println("MyAnotherIntValue "+myAnotherIntValue);

        //Reference types: new keyword is going to create new memory location and all the reference variable has sa
        //same memory location. All the references pointing to same location

        int[] myIntArray = new int[6];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray= "+ Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= "+ Arrays.toString(anotherArray));

        //Array can be modify. meance it can mutable
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= "+ Arrays.toString(anotherArray));
    }
    public static void modifyArray(int[] array){
        array[0] = 2;
    }
}
