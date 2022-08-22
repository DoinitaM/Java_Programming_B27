package day04_variables;

import java.util.TooManyListenersException;

public class CarDriver {
    private static String Tom;

    public static void main(String[] args) {

        /*
    declare and assign these variables with the most appropriate datatypes:
        driver name, car model, license number, license class, speed, is automatic

    create a summary of the information and print it. Be creative

         */
       String driverName = "Tom";
       String carModel = "Ford_Escape";
       String licenseNumber = "BN222";
       char licenseClass = 'B';
       int speed = 120;
       Boolean isAutomatic = true;

        System.out.println("Information about Uber driver:");
        System.out.println("Driver's name: " +driverName );
        System.out.println("Car model: " + carModel);
        System.out.println("License number: " +licenseNumber);
        System.out.println("License Class: " + licenseClass);
        System.out.println("Speed: " +speed );
        System.out.println("Is Automatic: " + isAutomatic);

    }
}
