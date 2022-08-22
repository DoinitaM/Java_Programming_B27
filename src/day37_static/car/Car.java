package day37_static.car;

import java.util.Scanner;

public class Car {

    String model;
    Driver driver;
  //  Scanner input;
    public Car(String model, String name, long licenceNumber, char licenseType ){
        this.model = model;
       driver =  new Driver(name, licenceNumber, licenseType);
//input = new Scanner(System.in);
    }

  public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;

  }


}
