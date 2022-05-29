package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        //GCD or HCF logic a= 12 b=30
        //b=30-12=18, a=12
        //b=18-12=6, a=12
        //a=12-6=6, b=6
        while (first != second){
            if (first > second){
                first = first - second;
            }else {
                second = second - first;
            }
        }
        return first;
    }
}
