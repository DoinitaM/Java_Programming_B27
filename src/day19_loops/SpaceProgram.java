package day19_loops;

import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        /*
        Space program
Given a String return a version of with spaces between all of the letters.
If there is already a space in the String put an underscore

	Ex: java	-> j a v a
		space 	-> s p a c e
		more words -> m o r e _ w o r d s
         */
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
      /*  String s = "java";
        String s2 = "";
        String a = "space";
        String a2 = "";
        String b = "more words";
        String b2 = "";


        for (int i = 0; i < s.length(); i++) {

            System.out.print(s.charAt(i));
            System.out.print(' ');
        }
        System.out.println();
        for (int i = 0; i < a.length(); i++) {

            System.out.print(a.charAt(i));
            System.out.print(' ');
        }
        System.out.println();               */
        for (int i = 0; i < s.length(); i++) {

            if (s.contains(" ")) {
                s = s.replace(" ", "_");
           /* System.out.print(s.charAt(i));
            System.out.print(' ');*/
            }
            System.out.print(s.charAt(i));
            System.out.print(' ');
        }
    }
}