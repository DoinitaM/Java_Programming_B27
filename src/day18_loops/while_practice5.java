package day18_loops;

import java.util.Scanner;

public class while_practice5 {
    public static void main(String[] args) {
       /* Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
*/
        Scanner input = new Scanner(System.in);

        int num = 1;
        int num2 = 5;
        int result = 0;

         while(num++ <=num2){
             System.out.println("Enter a number");
             int num3 = input.nextInt();
             if(num3>=0){
                 result +=num3;
                 System.out.println("Result: " + result);

             }else{
                 System.out.println("The number should be positive");
             }


         }
       // System.out.println("Result: " + result);

    }
}
