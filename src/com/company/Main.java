package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*
       Fizzbuzz - Take User input of 1 - 100
       if it is a multiple of 3 output "fizz"
       if it is a multiple of 5 output "buz"
       if it is a multiple of both output "fizzbuzz"
    */
        Scanner userI = new Scanner(System.in);
       /* System.out.println("Welcome to fizz buzz pick a number");

        int userGuess = userI.nextInt();

        if (userGuess == 0 % 3) {
            System.out.println("Fizz");
        } else if (userGuess == 0 % 5) {
            System.out.print("Buzz");
        } else if (userGuess == 0 % 3 && userGuess == 0 % 5)
            System.out.println("FizzBuzz");
    }*/
        System.out.println("What score did you get?");
        int userGuess = userI.nextInt();
        if (userGuess > 80) {
            System.out.println("You Got an A");
        } else if (userGuess >= 60 && userGuess <= 80) {
            System.out.println("You got a B");
        } else if (userGuess >= 50 && userGuess <= 59) {
            System.out.println("You got a C");
        }  else if (userGuess >= 45 && userGuess <= 49) {
            System.out.println("You got a D");
        }  else if (userGuess <= 45){
            System.out.println("You got a F,You have failed");
        }


    }
}
