package day19_loops;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        /*
Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????
	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            s += s.charAt(s.length()-1);
        }
        System.out.println(s);
    }
}
