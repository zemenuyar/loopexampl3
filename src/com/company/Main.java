package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //write the program that printing all odd number 1-20.
        //difine the limit
        int num = 20;
        System.out.println("print odd numbers between 1 and" + num);
        for (int i = 1; i <= 20; i++){

            //if the number is not divisible by 2 then it is odd
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

    }
}
