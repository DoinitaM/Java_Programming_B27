package day24_array;

import java.util.Arrays;

public class StringMothods {
    public static void main(String[] args) {

        String s = "hello world";
       char[] letters =  s.toCharArray();

        System.out.println(letters); // String uses arrayinternally, so it print as String
        System.out.println(Arrays.toString(letters)); //will print as a char
        System.out.println(s.length());//11
        System.out.println(letters.length);//11
        System.out.println(letters[0]);//h


       for (char eachLetter : s.toCharArray()){ // : letters

           System.out.println(eachLetter);
       }
        System.out.println();

       String str  = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";
        System.out.println(Arrays.toString(str.split(",")));


        for (String eachDay : str.split(",")){
            System.out.println(eachDay);
        }

        String str2 = "jan-feb-mar-may-jun-july-augost-seep-oct-nov-dec";
        String[] month = str2.split("-");
         for(String eachMont : month){
             System.out.println(eachMont);
         }

         String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));

String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));// char []
        System.out.println(Arrays.toString(str4.split("")));//String[]

    }
}
