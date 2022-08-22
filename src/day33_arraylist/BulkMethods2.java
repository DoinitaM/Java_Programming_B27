package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 3, 4, 5, 1, 4, 14, 4, 5, 123));
        System.out.println("contains 4: " + nums.contains(4));//true
        System.out.println("contains 4 & 5: " + (nums.contains(4) && nums.contains(5)));//true
        System.out.println("checking with containsAll " + nums.containsAll(Arrays.asList(4, 3, 5, 1))); // true
        System.out.println("checking with containsAll " + nums.containsAll(Arrays.asList(4, 3, 5, 6))); //false


nums.retainAll(Arrays.asList(123, 4, 14));
        System.out.println(nums);//[4, 4, 4, 14, 4, 123]
        nums.retainAll(Arrays.asList(123, 6, 9));//
        System.out.println(nums);//[ 123]//will kip just what it's need or that it has

        ArrayList<Character>letters = new ArrayList<>(Arrays.asList('c', 'a', 'c', 'e', 'a', 'z'));
        letters.retainAll(Arrays.asList('a', 'z'));
        System.out.println(letters);
        //Given a String determine how many vowels it has

        String s = "implimentation";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));//convert the String to an ArrayList where each character a different element
        System.out.println(list);//[i, m, p, l, i, m, e, n, t, a, t, i, o, n]

        list.retainAll(Arrays.asList("a", "e", "i", "o", "u")); // keeps all defined elements, but deleted all the others
        System.out.println(list.size());//6
        System.out.println(list);//[i, i, e, a, i, o]
    }
}
