package day19_loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        /*
        write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
         */
        int secretNumber = 87;
        int inputNumber ;
        int attemps = 0;
        Scanner input = new Scanner(System.in);


        do{
            System.out.println("Guess a number");
            inputNumber = input.nextInt();

            if(inputNumber<secretNumber){
                System.out.println("Number is bigger");
            }else if(inputNumber>secretNumber){
                System.out.println("Number is smaller");
            }
            attemps ++;
        }while(secretNumber!=inputNumber);

        System.out.println("You guessed the number in " + attemps+ " attemps");





    }
}
