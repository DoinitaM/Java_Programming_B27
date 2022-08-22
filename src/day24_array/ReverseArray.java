package day24_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        Reverse Array
	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
         */

        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];//if we put legth more than 5 the array will continue with 0, 0 , ...(1,2,3,4,5,0,0..)

        for(int i = arr.length - 1, y =0; i>=0; i--, y++){ // i goes backwords
            reverse[y] = arr[i];
            //or System.out.println(arr[i]);
           // use i variable that is going backwords to read from the original array
           //  use i variable that is going forwards to store into the reverse array


        }

        System.out.println(Arrays.toString(reverse));

        /*
        int i = last index
        int y = 0
        while( i>=0)
        i++
        y++
         */



    }
}
