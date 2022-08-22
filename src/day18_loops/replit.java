package day18_loops;

import java.util.Scanner;

public class replit {

    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        // WRITE YOUR CODE HERE
        if (word.startsWith("x") || word.startsWith("X")) {
            word = word.substring(1);
        }
        ;
        if (word.endsWith("x") || word.endsWith("X")) {
            word = word.substring(0, word.length() - 1);
        }
        ;
        System.out.println(word);
    }
}
