package day19_loops;

import java.util.Scanner;

public class IQ {
    public static void main(String[] args) {


    /*
    [IQ] Prime number
Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
Ex:
	Input:
		11
	Output:
		prime
Ex:
	Input:
		10
	Output:
		not prime
     */


        int num = new Scanner(System.in).nextInt();

        String s = "";

        for (int i = num; i % 2 == 1; i++) {
            s = "prime";
        }
        for(int i = num; i %2 ==0; i++){
            s = "not prime";
        }
        System.out.println(s);
    }
}