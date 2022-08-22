package day22_array;

import java.util.Arrays;

public class UseElements {
    public static void main(String[] args) {

     int[] nums = {4, 5, 12, 4} ;
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0] + nums[1]);// 4+5 = 9
        System.out.println(nums[2]* nums[1]); //5*12 = 60
        System.out.println("------------");

        String[] strs = {"hello", "world", "Java", "code"};
        System.out.println(strs.length); //4
        System.out.println(strs[2]); //java
        System.out.println(strs[2] + strs[3]); // javacode
        System.out.println(strs[0].length());//  length of first string hello -> 5
        System.out.println(strs[1].charAt(strs[1].length()-1));  // second string , the last character is 'd';

        System.out.println("----");

        String s = strs[3];
        System.out.println(s);


    }
}
