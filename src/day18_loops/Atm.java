package day18_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attemps = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter your Pin");
            userPin = input.nextInt();
            attemps++;
        }while(attemps<3 && userPin != validPin);

         if((attemps<3) && (userPin == validPin)) {
            System.out.println("Logged in");
        }else{
            System.out.println("Locked account, too many attempts");
        }




    }
}
