package day14_stringMetods1;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Use scanner to read a String from the console
Remove extra spaces in the beginning or end
Print in all lowercase
Print the number of characters*/

        String words = input.nextLine();


        System.out.println(words.trim());
        System.out.println(words.toLowerCase());
        System.out.println(words.toUpperCase());
        System.out.println(words.length());



    }


}
