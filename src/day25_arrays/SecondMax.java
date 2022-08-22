package day25_arrays;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        /*
        [IQ] Second Biggest Number
Given an Array of numbers. Find and print the 2nd biggest number.
Note the 2nd biggest should be unique meaning it should be different from
the max number
Example:
Input:
[4,3,1,4,5,2,4,8,4,8]
Output:
5
         */

        int[] nums = {4,3,1,4,5,2,4,9,4,8};
        Arrays.sort(nums);

        System.out.println("Max number: " + nums[nums.length-1]);
      //  System.out.println("Second max: " +  nums[nums.length-2]);// this doesn't work because 8 is dublicate, so it gives wrong second max

        int max = nums[nums.length -1];

        for(int i =nums.length-1; i>=0; i--){
            if (nums[i] != max){
                System.out.println("Second max: " + nums[i]);
           break;
            }
        }
    }
}
