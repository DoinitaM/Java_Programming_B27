package day13_switch_string;

public class StringEquals {
    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";
        //both of these are String literal, so they are both in the String Pool

        System.out.println(s ==s2); // check if they are the same object, the same
        System.out.println((s.equals(s2))); // check if the value of the String is the same
        String s3 = new String("java"); // in the heap
        System.out.println("bs == s3 " + s ==s3); // comparing 2 different objects
        System.out.println("s.equals(s3)" + s.equals(s3)); // check if the value(character) of the string are the same

        System.out.println(s.equals("java"));


    }
}
