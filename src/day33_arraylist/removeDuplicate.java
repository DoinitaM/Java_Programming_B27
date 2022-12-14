package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicate {
    /*
    Remove Duplicates
Create a method that will take an ArrayList of numbers and remove any duplicates values.
The method will return an ArrayList of unique elements.
@param nums - The given ArrayList of numbers
@return - ArrayList of numbers
Ex:
Input: {1, 3, 5, 1, 4, 5, 9};
Output: {3, 4, 9};
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(numbers);
        System.out.println(uniqueNumbers(numbers));
    }


    public static ArrayList<Integer> uniqueNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result.add(numbers.get(i));
            }
        }
        return result;

    }
}
