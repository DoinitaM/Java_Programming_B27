package day26_multi_array;

import java.util.Arrays;

public class Goups {
    public static void main(String[] args) {

        String[][] cydeo ={ {"Alen", "Tina", "Alina", "Nargiza"},
                {"Adam", "Baz", "Busra", "Ostap"},
                {"Rabia", "Shahad"},
                {"Ketino", "Eylul", "Nadia"} // after last array we don't put coma
        };


        System.out.println(Arrays.deepToString(cydeo));// prints the whole 2D array ->[ [], [], [] ]
        System.out.println(cydeo.length); // 4->how many inner. 1d array is there

        System.out.println(cydeo[2].length); //->2  how many array at index 2

        System.out.println(cydeo[0][3]);//Nargiza -.one specific element from inner array at index 0
        System.out.println(Arrays.toString(cydeo[1]));//[Adam, Baz, ...] printinf the whole inner elements at index 1

        // how to loop through each inner array
        System.out.println("---------------");
     for(String[] eachInner : cydeo){ //to loop through a 2d array the elements type is a 1d array

         System.out.println(Arrays.toString(eachInner));
     }
        System.out.println("---------");
     //how to through each name

        for(String[] eachInner :cydeo){
            for(String eachName :eachInner){
               // System.out.println(eachName);
                System.out.println(eachName.substring(eachName.length()-1).toUpperCase());
            }
        }



    }
}
