package day16_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        ask user to enter their first name
        ask user to enter their last name

        print names in proper format
        uppercase first letter + everuthing lowecase
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toLowerCase();

        //first name = firstName.toLowerCase();
        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
