package day17_string;

public class MoreMethods {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.isEmpty()); // isEmpty() -> check if s is empty or not and returns to boolean(true/false);

        String s2 = " "; // space is a character
        System.out.println(s2.isEmpty()); // false

        String s3 = ""; // empty space, String but no character
        System.out.println(s3.isEmpty()); // true

        // isBlank();

        String a = "    ";
        System.out.println(a.isEmpty());// false // check for characters
        System.out.println(a.isBlank());//true // check for non space characters

       String c = "";
        System.out.println(c.isEmpty());// true
        System.out.println(c.isBlank());// true

        // replace
        String str = "java";
        str.replace('a', 'z');
        System.out.println(str); // no replace because string are immutable

        String str2 = "an apple path";
        System.out.println(str2.replace("a", "(a)")); // this is  replace a was replaced with (a);

        // common use case : delete spaces
        String str3 = " multiple     words  here   ";
        str3 = str3.replace(" ", "");
        System.out.println(str3); // this will remove the spaces (all spaces)

        //remove only first
        String z = "wooden spoon";
        System.out.println(z.replace("o", "-")); // replace o with -
        System.out.println(z.replaceFirst("o", "-")); // this just added - before first o

        //how to replace/remove middle character only

        String ex = "wooden spoon";
        int firstO = ex.indexOf('o');
        int secondO = ex.indexOf('o', firstO + 1);

        System.out.println(ex.substring(0, secondO));
        System.out.println(ex.substring(secondO).replaceFirst("o", "-"));
        System.out.println(ex.substring(0,secondO) + ex.substring(secondO).replace("o", "-"));

    }
}
