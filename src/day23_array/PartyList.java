package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to the party?");
        int size = input.nextInt();
        String[] names = new String[size]; // new String[input.nextInt];
        System.out.println(Arrays.toString(names));// [nul, nul, nul]
        for(int i = 0; i< names.length; i ++) { // ask for the name ans store to the array
            System.out.println("Enter the name of person " + (i +1));
            //if you dont habe the paranteses the line will be concatenate left to right, but we want to addition i+1
       String guest = input.next();
       names[i] = guest; // names[i] = input.next();
        }
        System.out.println("Final list coming to the party");
        System.out.println(Arrays.toString(names));
    }
}
