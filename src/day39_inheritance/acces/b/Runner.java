package day39_inheritance.acces.b;



public class Runner {
    public static void main(String[] args) {
        //What does TownHouse inherit from House?
        //in different package
        TownHouse house = new TownHouse();
        house.adress = "1223 road";
      //  house.city = "Virginia"; //
        // -> not accesible outside the pachage
    // house.state; -> state is default, so only accesible in the same package
    // house.zipcode; -> is private , so only accesible in the same class
        //public static void main(String[] args) {

            // Q: What does TownHouse inherit from House?

            // in different packages


    }
}

