package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // result is 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1; //3-1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2*10 = " +result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("the remainder of (4 % 3) = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println(" 1 + 1 = " + result);

        result--; // result = result - 1
        System.out.println("2 - 1 = " + result);
         // result = result + 2
        result += 2;
        System.out.println("1 + 2 = "+ result);

        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = "+result);

        //result = result / 10
        result /= 10;
        System.out.println("30 / 10 = "+result);

        //result = result - 10
        result -= 2;
        System.out.println("3 - 2 = "+result);

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("I am not an Alien!");
            System.out.println("And I am scared of Aliens");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("greater than secondTopScore and less than 100");
        }

        if (topScore < secondTopScore || topScore < 100){
            System.out.println("Printing the output");
        }

        //operator chalenges
        double myFirstvalue = 20d;
        double mySecondValue = 80d;
        double myValuesTotal = (myFirstvalue + mySecondValue) * 100d;
        System.out.println("My Values Total = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40d;
        System.out.println("the Remainder = "+ theRemainder);


    }
}
