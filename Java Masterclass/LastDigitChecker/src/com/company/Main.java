package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,42,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if (((number1 < 10) || (number1 > 1000)) || ((number2 < 10) || (number2 > 1000)) || ((number3 < 10) || (number3 > 1000))){
            return false;
        }
        int lastDigitNumber1, lastDigitNumber2, lastDigitNumber3;
        lastDigitNumber1 = number1 % 10;
        lastDigitNumber2 = number2 % 10;
        lastDigitNumber3 = number3 % 10;
        if ((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber1 == lastDigitNumber3) || (lastDigitNumber2 == lastDigitNumber3)){
            return true;
        }else
            return false;
    }

    public static boolean isValid(int number){
        if ((number < 10) || (number > 1000)){
            return false;
        }
        else {
            return true;
        }
    }
}
