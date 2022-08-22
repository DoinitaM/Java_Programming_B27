package day18_loops;

import java.util.Scanner;

public class while_practice6 {
    public static void main(String[] args) {
/*
write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
*/
       //String color="";
        int count = 0;
        String selectedColor = "";
        Scanner input = new Scanner(System.in);
        while(count++<3) {
            System.out.println("Select a color");
            String color = input.nextLine();
            if (selectedColor.startsWith(color)) {
                System.out.println("The color is selected, select another color");
               count --;

            }else{

                selectedColor += color+" ";

            }
        }
            System.out.println("Colors selected: " + selectedColor);

    }
}
