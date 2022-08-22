package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems+  " in the store");// combines the value of the numberOfItems variable with the caracters ' in the store'

      numberOfItems = 700; //reassigned 700 into the variable
        System.out.println(numberOfItems+  " after the sale");

        int totalAfterShipment = numberOfItems + 5000;

        System.out.println("totalAfterShipment = " + totalAfterShipment);// soutv

        double totalCost = 1_000_000.99;// 1,000,000.99 -> how we might want to whire it, but commas are not valid java syntax,so we can use underscore in numbers, to improve readability

        System.out.println(totalCost);

        float f = (float) 19.99F; // Adding the letter F/f will tell the compiler this is a float number not a double number

        float f2 = 100; //100 is in type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

      //int f2 = 100; valid if i vanted
        // float f2 = 100 F
        // float f2 = 100.99F;

        long population = 8_000_000_000L;// adding l/L to the number will change the type from int(the default) to a long types, because 8 billions was too big to be held in an int type
        System.out.println(population);
        long pop2 = 1_000_000; // Lis not needed because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type
        System.out.println(pop2);

    }


}
