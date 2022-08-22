package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class IntoArrayList {
    public static void main(String[] args) {

       int[] a = {4, 2, 1};
        System.out.println("Number of elements: " + a.length);
        System.out.println("Print the whole array: " + Arrays.toString(a));
        System.out.println("Acces the first element: " + a[0]);
        System.out.println("Add elements to the array: CAN NOT change the size of the array after creation");
        System.out.println("Remove elements from the array: CAN NOT  do it");
        System.out.println("Arrays can hold values that are primitive types & object types");

        System.out.println("======================");

        ArrayList<Integer> nums = new ArrayList<>(); // empty arraylist
        System.out.println("Number of elements: " + nums.size());
        System.out.println("Print whole ArrayList: "+ nums);

        System.out.println("adding to ArrayList : .add() method");
        nums.add(5);
        nums.add(10);
        System.out.println("Array list: " + nums);
        System.out.println("Array size: " + nums.size());

    }
}
