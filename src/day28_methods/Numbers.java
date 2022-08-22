package day28_methods;

import java.util.Scanner;

public class Numbers {
/*
create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
 */
 public static void checkNum(int n){
    if(n>0){
        System.out.println("Positive");
    } else if (n<0) {
        System.out.println("Negative");
    }else{
        System.out.println("Zero");
    }

 }

    public static void main(String[] args) {
  checkNum(5); //positive
   checkNum(0);//zero
    checkNum(-2); ///negative

        Scanner input = new Scanner(System.in) ;
        checkNum(input.nextInt());
        checkNum(input.nextInt());

        int n = 3;
        checkNum(n); // positive


    }




}
