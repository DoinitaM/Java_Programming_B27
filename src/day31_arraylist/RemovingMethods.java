package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethods {
    public static void main(String[] args) {


        ArrayList<String>words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);//[today, raining, java, flying]


        words.remove(2);

        System.out.println(words);//[today, raining, flying]

        System.out.println(words.remove(0));//taday -> it shows the word what will be removed
        System.out.println(words);//[raining, flying]

        words.clear(); // emptys the whole ArrayList
        System.out.println(words);

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");

        System.out.println(words);//[jumping, barn, chicken, cow]

words.remove("barn");

        System.out.println(words);//[jumping, chicken, cow]

        System.out.println(words.remove("cow")); //true ->return boolean
        System.out.println(words.remove("bread")); //false ->// because we don't have bread in the array
        System.out.println(words);//[jumping, chicken]

        System.out.println("-----------------------------");

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0);// 0 is int so it removes by index
        System.out.println(nums);//[5, 0, 2, 4]

        Integer a = 0;//a is Integer, so it removed by elelment, the element it removes  element 2, not the index 2
        nums.remove(a);//remove index or element
        System.out.println(nums);//[5, 2, 4]


        nums.remove((Integer) 2);
        System.out.println(nums);//[5, 4]



        nums.add(0, 4);
        System.out.println(nums);
        nums.remove((Integer) 4);//wil remove th e first 4
        System.out.println(nums);

    }
}
/*
String s = "hello
s.charAt(0)
 */