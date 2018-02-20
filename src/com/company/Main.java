package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    boolean finished =false;
        Random r = new Random();
        int x = 1 + r.nextInt(100);
        System.out.println("the number is " + x);
        int number = 0;
        while (finished!=true) {
            System.out.println("guess a number");
            number = scan.nextInt();

            System.out.print("value of x:" + x);

            System.out.println();

            if (number >x) {
                System.out.println("You guess is too high");
            } else if (number == x) {
                System.out.println("You guess the number");
                finished=true;

            } else {
                System.out.println("You do not even know how to guess");
                System.out.println();
            }
        }
        System.out.println("the Program will exit");


//        for (int i = 1; x < 100; x = x + 1) {
//            n = 1 + r.nextInt(100);
//            System.out.println("value of n " + n);
//            System.out.print("\n");
    }

}
