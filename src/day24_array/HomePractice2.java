package day24_array;

import java.util.Arrays;

public class HomePractice2 {
    public static void main(String[] args) {
        /*
        Multiple Words
Given a String of words that are separate by comma and spaces. Find
and print any words that have more than one word
Example
Input:
knife, wooden spoons, plates, cups, forks,
pan, pot, trash can, fridge, dish washer
Output:
wooden spoons
trash can
dish washer
         */
        String s = "knife, wooden spoons, plates, cups, forks, \n" +
                "pan, pot, trash can, fridge, dish washer";
        String[] s2 = s.split(", ");
        System.out.println(Arrays.toString(s2));



     //   for(int i =0; i < s2.length; i ++){

            for(String each : s2){

                if(each.contains(" ")){
                    System.out.println(each);


            }
        }
    }
}
