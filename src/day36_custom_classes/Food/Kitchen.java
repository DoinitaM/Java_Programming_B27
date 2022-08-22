package day36_custom_classes.Food;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {
/*
 Create a separate class to create and test the Food objects
 try making an Array of food objects
 find all food objects what starts with a and print the whole element
 finf food objects what total price is over 20 and print them all

 */
   Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food apples = new Food("Apples");
        allFood[0] = apples; // storing the food objects, aplles into food array
        allFood[1] = new Food("Sushi", 10);
        allFood[2] = new Food("Cajun Pasta", 2, 3.99);
        allFood[3] = new Food("Kebab", 5, 2.5);
        allFood[4] = new Food("Plov", 4, 2.99);

        System.out.println(Arrays.toString(allFood));

         // print each Food object in a separate line
        System.out.println();

        for(Food each : allFood){
            System.out.println(each);
        }
/*
find all food objects what starts with 'a', 'C'  and print the whole element
 */
        System.out.println("Food that starts with A or C:");
        for(Food each : allFood){
            if(each.name.startsWith("A") ||each.name.startsWith("C")){
                System.out.println(each);
            }

        }
        System.out.println("Food thas is over 9 $: ");

        for(Food each : allFood){
            if(each.totalPrice >=9){
                System.out.println(each.name);
            }
        }



    }
}
