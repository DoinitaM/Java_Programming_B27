package day07_scanner;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true*/
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
       boolean divisible1 = num % 2 == 0;
       boolean divisible2 = num % 3 == 0;
        boolean divisible3 = num % 5 == 0;
        System.out.println("Enter a number: " + num);
        System.out.println( num + "is divisible by 2: "+ divisible1);
        System.out.println( num + "is divisible by 3: "+ divisible2);
        System.out.println( num + "is divisible by 5: "+ divisible3);
    }

}
