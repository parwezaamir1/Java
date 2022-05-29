package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDigitCount(0));
        reverse(1212);
        System.out.println(numberToWords(123));


    }
    public static boolean numberToWords(int number){

        while(number != 0) {
            int temp = number % 10;

            switch(temp) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
            }
            number /= 10;

        }

        return false;
    }

    public static int reverse(int num){
        int remainder;
        int newNum = 0;

        while(num != 0) {
            remainder = num % 10;
            newNum = newNum+remainder;

            newNum *= 10;
            num /= 10;
        }

        newNum /= 10;
        System.out.println(newNum);
        return newNum;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 1;
        while (number > 9) {
            number /= 10;
            count++;
        }
        return count;
    }
}
