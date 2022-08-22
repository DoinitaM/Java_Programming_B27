package day34_costum_classes;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Mercedes";
        car1.year = 2020;
        car1.color = "Red";
        car1.fuelLevel = 75.0;
        System.out.println(car1);
        car1.drive();
        car1.fillTank();
        car1.isLow();
        System.out.println("------");
        Car car2 = new Car();
        car2.model = "Honda";
        car2.year = 2022;
        car2.color = "Black";
        car2.fuelLevel = 20.0;
        System.out.println(car2);
        car2.drive();
        car2.fillTank();
        car2.isLow();
    }
}
