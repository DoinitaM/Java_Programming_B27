package day16_string;

public class MoveFirstWord {
    public static void main(String[] args) {
        /*
[Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.

    Input:
        Java is a fun language
    Output:
        is a fun language Java
         */
        String s = "Java is a fun language";
               //   0123456789012345678901
        String s1 = s.substring(4,22) +" " + s.substring(0,4) ;
        System.out.println(s1);
    }
}
