package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        /*
        Given a 2D int array merge the elements into one 1D array
Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };
       Output:
              [ 10, 20, 30, 5, 10, 15 ]
         */
        int [][] nums = {
                {10, 20, 30},
                {5, 10, 15},
                {1, 2, 3, 4}
        };
        // nums.length ==2
        //nums[0].length + nums[1].length -->better then 6, but still not dynamic
        // to count the total number of elements i will need a loop

        int size = 0; // count how many element are total in the array

        for(int[] eachArray : nums){
           size += eachArray.length;
        }
       //propose of this loop was to count the total elements wich should be the size of the merged array

        int [] merged = new int[size];
        System.out.println(size); //10 -> element in the array

        int indexToStore = 0;

        for (int[] eachArray : nums){
            for( int eachNum : eachArray){

                merged[indexToStore++] = eachNum; // assign the eachNum to the merged array
             //   System.out.println(Arrays.toString(merged));
            }
        }

        System.out.println(Arrays.toString(merged)); //[10, 20, 30, 5, 10, 15, 1, 2, 3, 4]



    }
}
/*
int[] a = new int[4]
a[0] = 5;
a[i] = value
 */