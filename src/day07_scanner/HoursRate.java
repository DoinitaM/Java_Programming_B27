package day07_scanner;
import java.util.Scanner;
public class HoursRate {
    public static void main(String[] args) {
        /*Create a program that will ask the user to enter a salary(double) and number of hours(int). Calculate the hourly rate.
    hourly rate = salary / (hours weekly * 52)*/
        Scanner in = new Scanner(System.in);
        double salary = in.nextDouble();
        int hours = in.nextInt();
        double rate = salary / (hours  * 52);
        System.out.println("The hourly rate is : " + rate);

    }
}
