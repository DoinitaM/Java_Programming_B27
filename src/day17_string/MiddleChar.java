package day17_string;

public class MiddleChar {
    public static void main(String[] args) {
/*
Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
 */

     String str = "waters";
               //  01234
      // length 5/2 -> 2
       // elevators
      //  012345678   -> 9/2 = 4

     if(str.length()%2 ==1){   // str has odd number of character, so 1 middle char

        int midIndex = str.length()/2;
         System.out.println("The middle character: " + str.charAt(midIndex));

     }else { //str has an even number of character, so 2 middle char
         //elephant length -> 8/2 =4 ;
         int startMid = str.length()/2 -1;
         int secondMid = str.length()/2;

         System.out.println("The middler characters: " + str.charAt(startMid) + str.charAt(secondMid ));

       // or the can use second metod
         System.out.println("The middler characters: " + str. substring(startMid, secondMid + 1));
     }

    }
}
