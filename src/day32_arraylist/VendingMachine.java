package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

      //  ArrayList<String> drinks = new ArrayList<>();

     //   drinks.add("coffe");
     //   drinks.add("tea");
     //   drinks.add("soda");

        Scanner input = new Scanner(System.in);

        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("coffee", "tea", "juice"));
//String selection = input.next();
        System.out.println("Hello. Wich drink would you like?");
        String selection = input.next();


        if(drinks.contains(selection)){
            System.out.println(selection + " is vending");
        }else{
            System.out.println(selection+ " is not in the veding machine");
        }



    }
}
