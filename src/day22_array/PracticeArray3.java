package day22_array;

import java.util.Scanner;

public class PracticeArray3 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message
    Ex:
> 1
        one
> 10
        ten
         */
        Scanner input = new Scanner(System.in);
        String[] word = {"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};

        System.out.println("Enter a number");
        int num = input.nextInt();

        if(num>0 &&num<=15){
            System.out.println(word[num]);
        }else{
            System.out.println("Invalid number message");
        }
    }
}
