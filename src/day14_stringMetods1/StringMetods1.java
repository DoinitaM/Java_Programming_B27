package day14_stringMetods1;

import java.util.Scanner;

public class StringMetods1 {

    public static void main(String[] args) {
        String item = "pen"; // in String pool
        String item2 = new String("pen"); // directly in heap

        System.out.println(( item == item2)); // false // checks if the object item is the same object as item2

        String item3 = new String("pen");
        System.out.println(item2 ==item3); //false // compare the two objects. They are both in the heap

        //.equals(): compare the value of the String, wich checks if the characters are the same
        System.out.println(item.equals(item2));//true//check the caracters
        System.out.println(item2.equals(item3));//true
        System.out.println(item3.equals("pen"));//true
        System.out.println(item.equals("Pen"));//false because p is uppercase
        System.out.println(item.equalsIgnoreCase("Pen"));//true// check only for matching characters and ignores all the cases

        System.out.println("---------------------");

String userName = "jamesbond";
String password = "BOND007";
        System.out.println(userName.equals("JAMESBOND"));//false
        System.out.println(userName.equalsIgnoreCase("JAMESBOND"));//true
        System.out.println(password.equals("bond007"));//false

        System.out.println("---------------------" );

        String day = "Tuesday";
        System.out.println(day.length()); // counts how many character there is
        String day2 = "Friday";
        int len = day2.length();//length() methods gives back int type, so we can use it however we want
        System.out.println(len);

        String str = " hello ";// the character 'hello' are 5 long but spaces are also character, so the space in the beginning and the end are included, wich means the total length is 7
        System.out.println(str.length()); // prints how many characters in the String has, not the String // print 7
        System.out.println(str);

        System.out.println("----------------------");

        String word = "Summer";
        word.toUpperCase(); // the upercase method makes all charactes uppercase, but we didn't do anything with this value

        //nextInt();
        System.out.println(word); // Summer
      //  word.toLowerCase();
       // System.out.println(word); //Summer
word =word.toUpperCase(); // this time we make all the characters uppercase, then the String it gives us back(all uppercase), was reassigned into the variable
        System.out.println(word);//SUMMER

word = word.toLowerCase();
        System.out.println(word);//summer

        System.out.println("-------------------");

        String sentence = " hello My NAME is";
        System.out.println(sentence.toLowerCase());//hello my name is // make a new Strig that was all lowercase, and then printed it
        System.out.println(sentence);// print the original String because String is immunible it can not change
String lowerVer = sentence.toLowerCase();
// optionm 3: reassign
        // sentence = sentence.toLowerCase();
        System.out.println("-------------------------------");

        String s = "   java    ";
        System.out.println(s);
        System.out.println(s.length());
  s = s.trim(); // trim() method gets rid of all the extra spaces in the beginning and the end of the String

        System.out.println(s);
        System.out.println(s.length());
        String s2 = "   multiple words here   ";
        System.out.println(s2.trim()); // trim() will remove from beginning and end, middle spaces will not be touched



    }


}
