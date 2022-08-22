package day22_array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 ="Miami";
        String city4 ="New York";
        String city5 ="Toronto";
        String city6 ="Houston";
        // create a separate String variable
        // make an array to store the cities
      //
        // String[] cities1 = {city1,     city2,     city3,   city4,     city5,    city6};
        String[] cities = {"Chicago", "West Palm", "Miami", "NewYork", "Toronto", "Houston"};

// access each city one at the time
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println(cities[5]);
        System.out.println("-----------------");
        // trint the whole array
        System.out.println(cities); // will give us nothing we need -> [Ljava.lang.String;@2752f6e2

        Arrays.toString(cities); // Arrays.toString(cities);-> return your array object as in a String

        System.out.println(Arrays.toString(cities)); //  Arrays.toString(cities); --> return your array object as is a String format
    }
}
