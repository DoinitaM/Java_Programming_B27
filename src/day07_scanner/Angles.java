package day07_scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
        /*
Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 anles numbers: ");
        float num1 = input.nextFloat(), num2 =input.nextFloat(), num3 = input.nextFloat();
        boolean isTriangle = num1+num2+num3 ==180.0;
        boolean isCircle = num1+num2+num3 ==360.0;
        System.out.println("Angles make a triangle: " + isTriangle);
        System.out.println("Angles make a circle: " + isCircle );





    }
}
