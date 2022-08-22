package day18_loops;

import java.util.Scanner;

public class while_practice2 {
    public static void main(String[] args) {
        /*
        write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative

         */
        Scanner input = new Scanner(System.in);

        int num = 0;
       int max = -90000000;
       int min = 90000000;

       while (num ++ < 5){
           System.out.println("Enter a number");
           int num1 = input.nextInt();

           if(num1 > max){
               max = num1;
           }

           if(num1 < min){
               min = num1;
           }

           System.out.println("Max: "+ max);
           System.out.println("Min: " + min);

       }
       /* while(num++<5){ // this loop will run 5 times || start from 1 go until <=5
            System.out.println("Enter a number");
            int inputNum = input.nextInt();

            if (inputNum>max){
                max = inputNum; //if the number from the console is bigger than

            }

            if(inputNum<min){
                min = inputNum;
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        }
       */




    }
}
