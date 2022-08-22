package day05_arithmetic_operators;

public class GalonsToLiters {
    public static void main(String[] args) {
        /*create a class called GalonsToLiters, and write a program that can convert the gallons to litters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters*/
        int gallon = 15;
        double liters = gallon * 3.78541 ;
        System.out.println("Gallon = " + gallon);
        System.out.println(gallon+ " gallons egual to " + liters + " liters");
        gallon = 20;
        double liters1 = gallon * 3.78541;
        System.out.println("Gallon = " + gallon);
        System.out.println(gallon+ " gallons egual to " + liters1 + " liters");

    }
}
