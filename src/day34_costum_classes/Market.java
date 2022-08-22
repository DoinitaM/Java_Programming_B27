package day34_costum_classes;

public class Market {
    public static void main(String[] args) {

        House house1 = new House();
        System.out.println(house1);

        house1.type = "TownHouse";
        house1.squareFeet = 1300;
        house1.numberOfBathrooms = 2;
        house1.numberOfBedrooms = 2;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1);  //don't need call toString because is automaticaly called

        System.out.println(house1.calculateMorgage());



    }
}
