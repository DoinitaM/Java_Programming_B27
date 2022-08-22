package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);
        //System.out.println(5/0); // 5/0 -> it will not work, we can not devide by 0
        //System.out.println(true && 5/0 == 0);
        System.out.println(false && 5/0 == 0);// second part will not run because from first part it knows the rezult  will be false
       // System.out.println(false & 5/0 == 0); will not work
        System.out.println(true || false); // after first expesion doesn't metter that is after because in this situation we know the rezults
       int count = 0;
        System.out.println(true || count ++ == 1);
        System.out.println(count);


    }


}
