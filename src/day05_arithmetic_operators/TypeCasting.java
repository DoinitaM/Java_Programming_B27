package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 14;
        int i = b; // int is bigger, si is ok "( will make automatically )

        long l = 40; // by default 40 is int type, int can automatically be stored into a long because int is smaller than long
        long l2 = 3000000000L; // 3000000000 is int by default, but it is too big for int type, so we need to tell the copiler it is a long type with L

        float f = 10; // 10 is int by default, int is smaller than float, so it will automatically be cast
        System.out.println(f);
        double d = 19.99;
        int i2 =  (int)d; // double is bigger than int so i will need to cast
        System.out.println(i2);

        int i3 = 500;
        byte b2 = (byte) i3; // int is bigger than byte, so i will need to cast to byte
        System.out.println(b2);

        short s = 60;
        double d3 = s;
        System.out.println(d3);// automatically
        float f2 = 100.50F; //or  we can use = (float)100.50;
        long l3 =(long) f2;
        System.out.println(l3);
        double d4 = l3;
        System.out.println(d4);


    }
}
