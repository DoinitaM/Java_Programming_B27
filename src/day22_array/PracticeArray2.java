package day22_array;

import java.util.Scanner;

public class PracticeArray2 {
    public static void main(String[] args) {
        /*
        Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:
    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday
Use array, not if statement or switch
         */
        Scanner input = new Scanner(System.in);
        String[] weekDay= {" ", "Monday", "Tuesday", " Wednesday", "Thursday", " Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number");
        int num = input.nextInt();

        System.out.println(weekDay[num]);

    }
}
