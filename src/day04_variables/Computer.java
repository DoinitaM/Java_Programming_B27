package day04_variables;

public class Computer {

    public static void main(String[] args) {

        /*declare and assign these variables with the most appropriate datatypes:

        brand, processor, ram memory, storage memory, has monitor, has wifi card, price, number of USB slots, has Bluetooth

        create a summary of the information and print it. Be creative*/
     String brand = "Dell";
     String processor = "Core i5";
     int ramMemory = 16;
     int storageMemory = 256;
     Boolean hasMonitor = true;
     Boolean hasWifiCard = true;
     Double price =  899.00;
     int numberOfUSBslots = 3;
     Boolean hasBluetooth = true;


        System.out.println("\t Information about Computer: ");
        System.out.println("Brand: " +brand);
        System.out.println("Processor: " +processor );
        System.out.println("Ram Memory: " + ramMemory + "GB");
        System.out.println("Storage Memory: "+ storageMemory + "GB");
        System.out.println("Has Monitor: "+hasMonitor );
        System.out.println("Has wifi Card: " + hasWifiCard);
        System.out.println("Price: " + price);
        System.out.println("Number Of USB Slots: "+numberOfUSBslots );
        System.out.println("Has bluetooth: " + hasBluetooth);


    }
}
