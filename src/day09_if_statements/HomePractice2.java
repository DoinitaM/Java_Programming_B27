package day09_if_statements;

import java.util.Scanner;

public class HomePractice2 {
    public static void main(String[] args) {
        /*Create three number variables
Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if ( num1>num2 && num1>num3){
            System.out.println(num1 + " is the biggest");
        }
        if (num2>num1 && num2>num3){
            System.out.println(num2 + " is the biggest");
        }
        if (num3>num1 && num3>num2){
            System.out.println(num3 + " is the biggest");
        }
    }
}
