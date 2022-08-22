package day32_arraylist;

import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        //get(0) get(1) get(3)

        for (int i = 0; i < nums.size(); i++) {

            System.out.print(nums.get(i)+" ");//array[i]-->4 8 7 3 4

        }

        System.out.println();

        for(int each : nums){
            System.out.print(each+" ");//4 8 7 3 4 -> is the same like upper, same result
        }



    }
}
