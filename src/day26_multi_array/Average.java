package day26_multi_array;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        /*
        1) see the average of each array
        2) see the total average of all numbers in the array
        average = sum of numbers/number of element
         */
        int totalSum = 0;
        int totalElements = 0;

       int[][] nums = {
               {3, 5, 1, 2},
               {3, 1, 5, 10, 8},
               {3, 1, 5, 12}
       };

       for(int[] eachInner : nums) { //looping through the 2D array nums, wich means going through each inner array(int[])

           int sum = 0; // resets for the next aray

           for (int eachNum : eachInner) {
               sum += eachNum;
           }
           System.out.println(Arrays.toString(eachInner));
           System.out.println("Average: " + (double)sum/eachInner. length);
           totalSum +=sum;//11
           totalElements += eachInner.length;//4

       }

        System.out.println("Total average of nums: " + (double)totalSum/totalElements);






    }
}
