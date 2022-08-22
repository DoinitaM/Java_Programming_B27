package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(6, 1, 5, 1224));
        nums.addAll(other);
        System.out.println(nums);//[4, 6, 1, 5, 1224]

        nums.addAll(Arrays.asList(9, 2, 6, 35));
        System.out.println(nums);//[4, 6, 1, 5, 1224, 9, 2, 6, 35]

nums.addAll(0, Arrays.asList(4, 1, 5, 125));
        System.out.println(nums);//[4, 1, 5, 125, 4, 6, 1, 5, 1224, 9, 2, 6, 35]

nums.removeAll(Arrays.asList(1));//will remove occurence of 1
        System.out.println(nums);//[4, 5, 125, 4, 6, 5, 1224, 9, 2, 6, 35]

     nums.removeAll(Arrays.asList(4, 5, 6));
        System.out.println("removed all 4, 5, 6: " + nums);//removed all 4, 5, 6:-> [125, 1224, 9, 2, 35]

        ArrayList<String> worlds = new ArrayList<>();
        worlds.addAll(Arrays.asList("one", "two", "four", "Four", " three", "four"));
        System.out.println(worlds);//[one, two, four, Four,  three, four]
        worlds.removeAll(Arrays.asList("four"));
        System.out.println(worlds);//[one, two, Four,  three]
    }

}
