package day06_operators;

public class LogicalExemple {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isGoodTemperature = true;
        boolean doBbq = isWeekend && isGoodTemperature;
        boolean playOutside = isWeekend ||isGoodTemperature;
        /* isWeekend ==true  && isGoodTemperature == true;

         */
        System.out.println("Do Bbq : " + doBbq);
        System.out.println("PLay Outside: " + playOutside);

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter; // || -> or only one of the boolean need to be true, for the results to be true

        System.out.println("get discount: "  + getDiscount);

// goal: 5 < number < 10;
        int number = 8;
        System.out.println(number >5 && number < 10); // true && true ->true
        System.out.println(number> 0 && number < 5); // true && false -> false

 int age = 40;
 boolean inValidAge = age < 0 || age > 120;  // false || false -> false
        boolean validAge = age <20 ||age>25; // false || true -> true



    }
}
