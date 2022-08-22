package day09_if_statements;

import java.util.Scanner;

public class HomePractice1 {
    public static void main(String[] args) {


    /*Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
______________________*/
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if ( num1 >num2){
            System.out.println(num1 + " is bigger");
        }else{
            System.out.println(num2 + " is bigger");
        }



    }
}
