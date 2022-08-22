package day29_methods;

import my_utils.StringUtil;

public class CallingStringMothods {
    public static void main(String[] args) {

       // StringUtil.reverse("hello world");

        System.out.println( StringUtil.reverse("hello world")); // we will print from the other package  ->dlrow olleh

        System.out.println(StringUtil.isPaldinrome("rececar"));
        System.out.println(StringUtil.fixFormat("james"));

        System.out.println(StringUtil.camelCase("JAVA will Rule the worLd"));
    }
}
