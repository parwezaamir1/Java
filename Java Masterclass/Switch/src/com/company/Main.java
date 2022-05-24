package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;

        if (value == 1){
            System.out.println("Value was 1");
        }else if(value == 2){
            System.out.println("Value was 2");
        }else {
            System.out.println("Value was not 1 or 2");
        }

        // Testing using Switch
        // In switch we can test only one condition

        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        ///Switch challenges
        char charValue = 'B';
        switch(charValue){
            case 'A':
                System.out.println("Char A was found");
                break;
            case 'B':
                System.out.println("Char B was found");
                break;
            case 'C':
                System.out.println("Char C was found");
                break;
            case 'D':
                System.out.println("Char D was found");
                break;
            case 'E':
                System.out.println("Char E was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
