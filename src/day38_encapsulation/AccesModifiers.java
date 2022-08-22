package day38_encapsulation;

public class AccesModifiers {

    public int a =5;
    int b = 10; // this has default acces decause i didn't use any other modifier
    private int c = 20;

    public static void main(String[] args) {
        AccesModifiers obj = new AccesModifiers();
        System.out.println(obj.a);//5 ->it's public
        System.out.println(obj.b);//10-> use in the same package
        System.out.println(obj.c);//20 -> it's goo because we use in the same class/file

    }




}
