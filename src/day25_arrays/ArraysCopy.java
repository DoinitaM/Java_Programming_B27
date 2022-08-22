package day25_arrays;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] other = nums; // tis is not creating a new array, is the same array as line 8

        System.out.println("BEFORE");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));

        nums[0] =10;//reassign  1 to 10
        other[2] =25; //reassign 3 to 25
        System.out.println("AFTER");
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(other));

int [] arr = {3, 4, 6, 7, -3, 12};

      Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // copyOf

        int[] a ={5, 10, 12};
        int[] b = Arrays.copyOf(a, 3);
        System.out.println("BEFORE");

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[1] = 100;
        System.out.println("After");
        System.out.println(Arrays.toString(a));//will change only the middle of the 'a' array
        System.out.println(Arrays.toString(b));
         b = Arrays.copyOf(a, 5);
        System.out.println("AFTER CHANGING b");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
