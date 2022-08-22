package day10_if_statements;

import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time from 0-23 in 24 H format, where 0 is midnight");
        int time = input.nextInt();
String  message = " "; // declare and assigning a String with value empty space " ". Default starting value
        if(time >= 6 && time <= 11){
            message = "good morning";
        }else if(time>= 12 && time<= 16){
            message="Good evening";
        }else if(time>= 17 && time<= 23  ||time>= 0 && time<= 5) {
            message = "Good night";
        }else {
           message = "Not in 24 h range";
        }
        System.out.println(message);
    }

}
