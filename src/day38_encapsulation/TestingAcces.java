package day38_encapsulation;

public class TestingAcces {
    public static void main(String[] args) {
        AccesModifiers obj = new AccesModifiers();
        System.out.println(obj.a);//5 ->it's public
        System.out.println(obj.b);//10-> use in the same package
      //  System.out.println(obj.c);//error because is private and can't use outside the class

    }
}
