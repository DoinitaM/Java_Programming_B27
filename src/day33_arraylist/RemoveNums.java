package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveNums {

    public static void main(String[] args) {

        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));

// remove all the numbers that ar less than 5
        for (int i = 0; i< nums.size();i++){
            if(nums.get(i)<5){
                nums.remove(i);
               i--;//if i removed an element, the element will move over which means their index will change, i substract 1 to make sure i don't skip any element
            }

        }//                       [5, 3, 5, 5, 8, 9, 7, 10, 2] -> with out i--
        System.out.println(nums);//[5, 5, 5, 8, 9, 7, 10]

        System.out.println("------------------------------");

        ArrayList<Integer>nums2 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));
  //remove al the numbers what are less than 5 ussing removeIf

         nums2.removeIf(n ->n<5);//n will be every element     -> this is syntax
        System.out.println(nums2);//[5, 5, 5, 8, 9, 7, 10]





    }
}
