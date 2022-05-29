package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
    }

    public static int getLargestPrime(int number)
    {
        int largest=-1,flag=0;
        for(int i=2;i<=number;i++)
        {
            flag=0;
            for(int j=2;j<i;j++)
                if(i%j==0&&number!=2)
                    flag++;
            if(flag==0&&number%i==0)
                largest=i;
        }
        return largest;
    }
}
