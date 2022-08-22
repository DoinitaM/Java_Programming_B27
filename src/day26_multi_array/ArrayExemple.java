package day26_multi_array;

import java.util.Arrays;

public class ArrayExemple {
    public static void main(String[] args) {

        char [] upper = {'R', 'J', 'A'};
        char [] lower = {'p', 'z', 'q', 'e'};
        char [] other = {'4', '#', '*', '$', '&'};

        char[][] chars = new char[3][]; //or {upper,lower, other};
        chars[0]= upper; // storing the upper char as the first element of the 2d array
        chars[1] = lower;
        chars[2] = other;

        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        System.out.println(Arrays.deepToString(chars)); //this method used to print multi dimensional arrays
    }
}
