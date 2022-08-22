package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        /*
        Persoin information
        0->id
        1->first name
        2->last name
        3->batch num
         */

        // Have all th einformation :
        String[] studentOne = { "04", "Kristina", " Gaidamociv", "27"};
        System.out.println(Arrays.toString(studentOne));
        //Know the number of elements, but not the values yet

        String[] stundentTwo = new String[4];
        stundentTwo[0] = "10";
        stundentTwo[1] = "Olena";
        stundentTwo[2] = "Kravetska";
        stundentTwo[3] = "27";
        System.out.println(Arrays.toString(stundentTwo));
        // know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your ID");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));
        System.out.println("-------------------------");
   // most dynamic :
        String[] studentFour = new String[4];
        String[] questions = {"id", " first name", "last name", "batch number"};
        for(int i = 0; i<studentFour.length; i++){
            System.out.println("Enter your: " + questions[i]);
            studentFour[i] = input.next();
        }


    }
}
