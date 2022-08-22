package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValue {
    public static void main(String[] args) {

        //covert array to ArrayList

        int[] arr= {3, 5, 1, 1};


        Arrays.asList(arr); // converts the array to ArrayList



        //Creating an ArrayList with initial values

        Integer[] arr2 = {3, 4, 5, 6};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr2));//arr is not valid because it is int primitive types
        System.out.println(nums);//[3, 4, 5, 6]
        //the way we will usually create an ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 5, 1, 4));
        System.out.println(list);//[5, 2, 4, 5, 1, 4]


        ArrayList<String> names = new ArrayList<>(
         Arrays.asList("james", "adam", "ana", "jane")
        );
        System.out.println(names);
















    }
}
