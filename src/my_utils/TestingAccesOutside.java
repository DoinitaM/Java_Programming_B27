package my_utils;

import day38_encapsulation.AccesModifiers;

public class TestingAccesOutside {
    public static void main(String[] args) {
        AccesModifiers obj = new AccesModifiers();
        System.out.println(obj.a);//5 ->it's public
       // System.out.println(obj.b);//is default ->we cant use outside the package only in the same package
     //   System.out.println(obj.c);//error  because we can't use outside the class/file, it's working just in the same class

    }
}
