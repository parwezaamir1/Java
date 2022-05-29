package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your birth year: ");
//        boolean hasNextInt = scanner.hasNextInt();
//        if(hasNextInt){
//            int birthYear = scanner.nextInt();
//            int age = 2022 - birthYear;
//            scanner.nextLine();
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            if(age >=0 && age <= 100) {
//                System.out.println("Your name is " + name + " and you are " + age + " years old ");
//            }else {
//                System.out.println("Invalid age");
//            }
//        }else {
//            System.out.println("Unable to parse year to birth");
//        }


        ///Reading User input challenge
        int counter = 0;
        int sum = 0;
        while (counter < 10){
            int order = counter + 1;
            System.out.println("Enter your number #"+order+" : ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
