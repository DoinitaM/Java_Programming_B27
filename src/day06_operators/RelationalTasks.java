package day06_operators;

public class RelationalTasks {
     public static void main(String[] args) {



        /*declare a spead variable
        speed limit is 50
        find upt if you are speeding
        true false
.....declare a number variable
find out if the number is positive, negative or 0

         */
        int speed  = 50;
        int mySpeed = 56;
        boolean isSpeeding = mySpeed>speed;

         System.out.println("Is speeding: " + isSpeeding);

        int number = 32;
        boolean isPositive = number > 0;
        boolean isNegatibe = number < 0;
        boolean isZero = number == 0;

        System.out.println("Is the number positive: " + isPositive);
        System.out.println("Is the mumber negative : " + isNegatibe);
        System.out.println("Is equal zero: " + isZero);

        int num = 5;
        //boolean isZaNumber = num != number;
        boolean isEven = num % 2 ==0;
        boolean isOdd = num % 2 != 0; // num % 2 ==1 // isEven !=true
        System.out.println(isEven);
        System.out.println(isOdd);



    }



}
