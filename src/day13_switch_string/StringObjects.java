package day13_switch_string;

public class StringObjects {
    public static void main(String[] args) {

        String s = "first"; //String literal,in String pool
        String s2 = new String("second");// object in the heap

        System.out.println(s ==s2); // compares two different objects // false

       String s3 = new String("first");
        System.out.println(s ==s3);// false
        System.out.println(s2==s3);// false

        String s4 ="second";
        System.out.println(s==s4); // false

        String s5 = "first";
        System.out.println(s==s5); // true -> it is in  a string pool

    }
}
