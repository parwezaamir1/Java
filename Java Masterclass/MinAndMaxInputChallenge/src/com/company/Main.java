package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int min= 0;
//        int max =0;
////        boolean first = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true){
            System.out.println("Enter the number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine();//handle input
        }
        System.out.println("min= "+min+", max= "+max);
        scanner.close();
    }
}
