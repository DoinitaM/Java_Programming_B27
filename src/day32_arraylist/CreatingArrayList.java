package day32_arraylist;

import java.util.ArrayList;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("friday");
        list1.add("java");
        list1.add("moviea");
        list1.add("sports");

        System.out.println(list1);//[friday, java, movie, sports]

        ArrayList<String> list2 = list1;

        list2.add("soft skills");

        System.out.println(list1);//[friday, java, moviea, sports, soft skills]
        System.out.println(list2);//[friday, java, moviea, sports, soft skills]

        ArrayList<String> list3 = new ArrayList<>(list1);//creating a new ArrayList object with the same value as the list1
        list3.remove(0);
        System.out.println("list 1: " + list1);//list 1 [friday, java, moviea, sports, soft skills]
        System.out.println("list 2: " + list2);//list 2 [friday, java, moviea, sports, soft skills]
        System.out.println("list 3: " + list3);//list 3 [java, moviea, sports, soft skills]

    }
}
