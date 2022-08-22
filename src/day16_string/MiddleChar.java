package day16_string;

public class MiddleChar {
    public static void main(String[] args) {
        /*
        [Middle char]
Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.
    Input:
        elephant
    Output:
        The middle characters: ph
         */
        String s = "elephant";
        int i = s.length();
        int i1 = i/2;
        int i2 = i/2+1;
        if (i % 2==0 ){
            System.out.println(s.substring(i1-1, i2) );

        }else{
            System.out.println(s.charAt(i1));
        }
    }
}
