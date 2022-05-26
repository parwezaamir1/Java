package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int palin = number;
        while (number != 0){
            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return  (palin == reverse);
    }
}
