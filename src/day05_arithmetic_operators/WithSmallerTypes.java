package day05_arithmetic_operators;

public class WithSmallerTypes {
    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;
        System.out.println(b1 +b2);
        // byte b3 = b1+b2; // during the calculation the values are turned to int so the rezult is int ( no byte)
        byte b3 = (byte)(b1 +b2); // this will be the correct one if we want to convert to smaller one

    }

}
