package day18_loops;

public class while_practice3 {
    public static void main(String[] args) {
        /*
        write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120

         */

       int i = 1;
       int i1  = 5;
       int factorial = 1;

       while(i1>=i){
           factorial *=i1;
           i1--;

       }

        System.out.println("Factorial:" + factorial);

    }
}
