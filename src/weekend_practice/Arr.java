package weekend_practice;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {


        int[] intArr = {15, 30, 45, 60, 75};
        intArr[4] = intArr[2];
        intArr[2] = 90;
        System.out.println(Arrays.toString(intArr));
    }
}