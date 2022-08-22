package day30_practice_wrapper;

import java.util.Scanner;

public class HomePractice2 {
    public static void cube() {

        int n = new Scanner(System.in).nextInt();

        //TYPE YOUR CODE BELOW:

        for (int i = 1; i < 3; i++) {
            n *= n;

        }
        System.out.println(n);

    }

    public static void main(String[] args) {
        cube();
    }
}


