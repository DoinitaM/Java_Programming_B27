package day18_loops;

import java.util.Scanner;

public class while_practice7 {
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
        Scanner input = new Scanner(System.in);

        int count = 0;
        int limit = 5;
         int num = 30;
         while (count++<=5){
             System.out.println("Select a number between 1-50");
             int selectedNum = input.nextInt();
             if(selectedNum ==num){
                 System.out.println("You guessed the secret number");
                 count =6;
             }else if(selectedNum>num){
                 System.out.println("Number is smaller");
             }else if(selectedNum<num){
                 System.out.println("Number is bigger");
             }

         }
        System.out.println("The secret number is: " + num);
    }
}
