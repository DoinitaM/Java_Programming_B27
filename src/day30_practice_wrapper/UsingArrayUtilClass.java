package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtilClass {
    public static void main(String[] args) {

        int num = ArrayUtil.min(4, 2, 1, 5, 1, -1, 2, 5, 2, -1, 5);//-1
        System.out.println(num);
        System.out.println(ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));//2

        System.out.println(ArrayUtil.max(5, 3, 4, 5, 2, 5, 8));//8

       int[] a = {45, 2, 6, 2, 6, 23, 83, 12};
        System.out.println(ArrayUtil.max(a));//83
        System.out.println(ArrayUtil.min(a));//2
        System.out.println(ArrayUtil.max(new int[]{4, 5, 2, 5, 3})); //5
        System.out.println(ArrayUtil.min(new int[]{4, 5, 2, 5, 3})); //2

   int[]b = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.contains(b, 13));//false
        System.out.println(ArrayUtil.contains(b, 5));
//true
int []c = {4, 2, 5, 1, 6};
        System.out.println("IndexOf 5: " + ArrayUtil.indexOf(c, 5));//which position is 5, here is in 2(because starts from 0)
        System.out.println("IndexOd 7: " + ArrayUtil.indexOf(c, 7));//-1 because there is no 7 in arr and  return -1

        System.out.println("overloaded ude: ");
        int[] d = {4, 5, 1, 5, 6, 8, 6, 9, 1};
        System.out.println("index of first  6: " + ArrayUtil.indexOf(d, 6));//will check the first index of number if in the string are more//4
        System.out.println("index of second 6: " + ArrayUtil.indexOf(d, 6, 5));//6

        int firstIndex = ArrayUtil.indexOf(d, 6);
        int secondINdex = ArrayUtil.indexOf(d, 6, firstIndex+1);
        System.out.println(firstIndex);
        System.out.println(secondINdex);//same as line 31

        System.out.println("==============");

        String[] words = { "java", "is", " the", "best"};
        // i want to add : language into the array
        String [] allWords = ArrayUtil.addElements(words, "language");
        System.out.println(Arrays.toString(allWords));
        System.out.println("===========");

        String[] strs = {"today", "is", " monday"};
        String[] other = {"no", " softslills", " today"};
        String[] multipleAdded = ArrayUtil.addElement(strs, other );
        System.out.println(Arrays.toString(multipleAdded));




    }



}
