package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        double avg = 0;
        double counter = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                avg = sum/counter;
            } else {
                System.out.println("SUM = "+sum+" AVG = "+((long)Math.round(avg)));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
