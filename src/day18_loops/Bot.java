package day18_loops;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        System.out.println("Bot is a awake");

        while(run){

            System.out.println("Enter your messege");
            String msg = input.nextLine().toLowerCase();

            switch(msg){
                case "hello":
                    System.out.println("how are you?");
                    break;
                case "what is your age?":
                    System.out.println("I was programmed in July");
                    break;
                case "what do you like?" :
                    System.out.println("I like Java");
                    break;
                default:
                    System.out.println("Sorry I didn't get that");
                    break;
                case "shutdown":
                    System.out.println("SHUTTING DOWN");
                    run = false;

            }

        }




    }
}
