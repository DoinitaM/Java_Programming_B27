package day15_string;

public class StringMethods2 {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.startsWith("j"));//true
        System.out.println(word.startsWith("ja"));//true
        System.out.println(word.startsWith("jv")); // false

        System.out.println("-------------");

        System.out.println(word.endsWith("a"));//true
        System.out.println(word.endsWith("A"));//false
        System.out.println(word.endsWith("java"));//true

        boolean b = word.startsWith("hello");


        String s = "hello world today";

        System.out.println("word.startsWith(hello wor) " + s.startsWith("hello wor"));
        System.out.println("---------------");

       String str = "today it is 80 degrees";
        System.out.println(str);
        System.out.println("str.contains(today)) " + str.contains("today"));//true
        System.out.println("str.contains(it is)) " + str.contains("it is"));//true
        System.out.println("str.contains(degrees)) " + str.contains("degrees"));
        System.out.println("str.contains(it 80 )) exact sequence " + str.contains("it 80"));//false
        System.out.println(str.contains("80") && str.contains("today"));//true




    }
}
