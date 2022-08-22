package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {
    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'f', 'r', 'x', 's', 'a', 'c', 'c' ));

        System.out.println(Collections.frequency(letters, 'e'));//0
        System.out.println(Collections.frequency(letters, 'a'));//2
        System.out.println(Collections.frequency(letters, 'b'));//1
        System.out.println(Collections.frequency(letters, 'c'));//3
        System.out.println(Collections.frequency(letters, 'C'));//0


//given a String determine how many times the letter 'a' is in the String

        String s = "aahuehdidlsba";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        /*
       Arrays.asList(s.split(" ")));->converts the String[] to ArrayList
        asList(s.split(" ") --->converts the String to a String[]
        new ArrayList<>(Arrays.asList(s.split(" ")));->Create an ArrayList of each Character as its own element
         */


        System.out.println(list);
        System.out.println(Collections.frequency(list, 'a'));







    }
}
