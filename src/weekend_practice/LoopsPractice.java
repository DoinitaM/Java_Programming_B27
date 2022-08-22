package weekend_practice;

import java.util.Scanner;

public class LoopsPractice {
    /*
   write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
     */
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int i =0;
        int positive = 0;
        int negative = 0;


 while(i<5) {
     int num = input.nextInt();

     if (num > 0) {

         positive++;
     } else if (num < 0) {

         negative++;

     }
     i++;
 }
     System.out.println("Positive numbers: " + positive);
     System.out.println("Negative numbers: " + negative);

    }
}
