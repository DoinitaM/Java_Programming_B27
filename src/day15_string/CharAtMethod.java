package day15_string;

public class CharAtMethod {
    public static void main(String[] args) {

      String s = "Java" ;
       //         0123
        System.out.println("First char " + s.charAt(0));
        System.out.println("Second char " + s.charAt(1));
        System.out.println("Third char " + s.charAt(2));
        System.out.println("Fourth char " + s.charAt(3));//s.charAt(s.length()-1)
       // System.out.println("Invalid char " + s.charAt(10)) 10 is not a valid index in our String

        System.out.println("Length " + s.length());
        System.out.println("Last index: " + 3); // length - 1 -->4 -1 = 3

// revers my String, hardCoded//from the end to beginning -> avaj
        System.out.print(s.charAt(3));
        System.out.print(s.charAt(2));
        System.out.print(s.charAt(1));
        System.out.print(s.charAt(0));
        System.out.println();

        System.out.println(""+s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0));
    }

}
