package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digit 125 is "+sumDigits(125));
    }

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number > 0){
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}
