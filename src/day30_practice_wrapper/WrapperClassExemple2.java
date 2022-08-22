package day30_practice_wrapper;

public class WrapperClassExemple2 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Byte min: " + Byte.MIN_VALUE);
        System.out.println("Byte max: " + Byte.MAX_VALUE);

        System.out.println("Integer min: " + Integer.MIN_VALUE);
        System.out.println("Integer max: " + Integer.MAX_VALUE);

        System.out.println(Character.isDigit('4')); //true
        System.out.println(Character.isUpperCase('e')); //false
        System.out.println(Character.isLetter('r'));//true

String s = "123";
        System.out.println(s + 5);// concatenation ->1235

        int i = Integer.parseInt(s);
        System.out.println(i);//123
        System.out.println(i+5); // will be addition -> 128



    }
}
