package day39_inheritance.acces.b;

import day39_inheritance.acces.a.House;

public class TownHouse extends House {



    public static void main(String[] args) {
        TownHouse house = new TownHouse();
        house.adress = "1223 road";
        house.city = "Virginia";
      // did i inheritnthe city variable? yes
      // house.state; state is default, so only accesible in the same package
        // house.zipcode; -> is private , so only accesible in the same class


    }
}
