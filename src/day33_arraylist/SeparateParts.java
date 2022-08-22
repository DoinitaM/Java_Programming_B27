package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
   /*
   Separate Parts
Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
Ex:
str = "ABCD123$%#@&456EFG!"
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
    */

      String s = "ABCD123$%#@&456EFG!";

        ArrayList<String>letters = new ArrayList<>(Arrays.asList(s.split("")));
        letters.removeIf(p -> !Character.isLetter(p.charAt(0)));//p is every element, every element each character of the string, but those character were string type, so in order to get the char type we did charAt(0). Character methods needs char type
        System.out.println(letters);
        ArrayList<String>numbers = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(numbers);
        numbers.removeIf(num -> !Character.isDigit(num.charAt(0)));
        System.out.println(numbers);



      /*  ArrayList<String>words = new ArrayList<>(Arrays.asList("Hello", "World", "Friday", "Java"));
        System.out.println(words);
       words.removeIf(word -> !Character.is(word.charAt(0)));
        System.out.println(words); */



        ArrayList<String>special = new ArrayList<>(Arrays.asList(s.split("")));
        special.removeAll(letters);
        special.removeAll(numbers);

        System.out.println(special);

    }
}
