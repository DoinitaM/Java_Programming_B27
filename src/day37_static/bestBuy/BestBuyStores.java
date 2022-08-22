package day37_static.bestBuy;

import day37_static.bestBuy.BestBuy;

public class BestBuyStores {
    public static void main(String[] args) {

     //   BestBuy.location = "Fairfax"; -> location is an instrance variable, so we need an object in order to access
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);//Fairfax

      //  BestBuy.headquarters;
        System.out.println( BestBuy.headquarters); //Richfield, Minnesota -->this is a static variable, wich means we can use the class name to access
        System.out.println(store1.headquarters);//Richfield, Minnesota -->instatnces(objects) come from a class & static members belong to class///this is valid syntax, but you should use the class name to access, but instance references

// other static members
        System.out.println(Math.PI);//PI is static
        System.out.println(Integer.MIN_VALUE);
       // Arrays.sort(); accesing static method from Arrays class

    }
}
