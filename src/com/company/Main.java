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
        System.out.println("Welcome to fizz buzz pick a number");
        int userGuess = userI.nextInt();

        if (userGuess == 0 % 3) {

            System.out.println("Fizz");
        } else if (userGuess == 0 % 5)

            System.out.print("Buzz");
        else if (userGuess == 0 % 3 && userGuess == 0 % 5) ;
        System.out.println("FizzBuzz");
    }
}


