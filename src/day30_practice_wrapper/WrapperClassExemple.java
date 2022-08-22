package day30_practice_wrapper;

public class WrapperClassExemple {
    public static void main(String[] args) {

    byte b = 9;
    Byte b2 = 23;


    Character c = 'j';
        System.out.println(c); //j

    int i = 4;
    Integer i2 = i; // primitive -> wrapper class : autoboxing

        System.out.println(i2);//4

    Integer i3 = 32;
    int i4 = i3; //wrapper class -> primitive :unboxing
        System.out.println(i4);//32
    Integer i5 = new Integer(10);
    Integer i6 = 10;
        System.out.println(i5);//10
        System.out.println(i6);//10

    }
}
