package day08_scanner;

import java.util.Scanner;

public class PersonInfo {
    /*ask for first name
    ask for
    ask for
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name ");
        String firstName = input.next();
        System.out.println("Please enter your last name " );
        String lasttName = input.next();

        input.nextLine(); //for the enter input

        // ***ussing nextLine() after any other Scanner methods causes the enter input to not store out data properly, so we need to add an extra nextLine() between the two parts

        // nextLine()-> permited us to write multiple worlds, not just one(address, ..)and accepts the enter input

        // next() permited us to write just one word

        System.out.println("Please enter your address");
        String address = input.nextLine();
        System.out.println(firstName);
        System.out.println(lasttName);
        System.out.println(address);

    }

}
