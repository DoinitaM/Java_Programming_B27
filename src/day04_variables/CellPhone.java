package day04_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 1000.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';
//1
        System.out.println("\t\tPhone information:\n\tBrand: " + brand);
        System.out.println( model + " in " + color);
        System.out.println( "With " + size+ "gb the price is $" + price);
        System.out.println("sim tipe: " + sim + " and have camera " + hasCamera);

        System.out.println("-------------------");
//2
        // alternative solution:
        String report = "\tPhone information:\nBrand: " + brand +
                "\n"+ model + "in" + color +
                "\nWith " + size+ "gb the price is $" + price +
                "\nsim tipe: " + sim + " and have camera " + hasCamera;

        //String report we will can use after if some information  change
        //we will use just report for next use like a value.
        System.out.println(report);
    }
}
