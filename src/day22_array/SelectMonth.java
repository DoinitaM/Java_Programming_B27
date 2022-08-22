package day22_array;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        /*ask the user to type a number
        number is for the month
        print the month
        >1
        january
        >12 december

         */
        Scanner input = new Scanner(System.in);
        String[] months = {"January", "February", " March", "April", "May", "June", "July", "August","September", "October", "November", "December"};

        System.out.println("Enter the month number");

        int num = input.nextInt();

        if(num>=1 && num<13){
            System.out.println(months[num -1]); // to convert the input number to a month index we can substract by 1 which means 1 -->1-1= 0 wich means index of 0wich in our case  is january
        }else{
            System.out.println("Invalid month number. Should be 1-12");
        }
    }
}
