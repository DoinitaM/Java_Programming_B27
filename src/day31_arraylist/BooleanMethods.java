package day31_arraylist;

import java.util.ArrayList;

public class BooleanMethods {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);

        System.out.println(list);
        System.out.println(list.isEmpty());

        System.out.println("contains: (41) " + list.contains(41));//true
        System.out.println("contains: (500) " + list.contains(500));//false
        System.out.println();

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);


        System.out.println("equals: " + list.equals(list2)); //true
list2.remove(0);
        System.out.println("equals: " + list.equals(list2));//false



        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer>list4 = new ArrayList<>();
        list4.add(3);
        list4.add(2);
        list4.add(1);
        System.out.println("list 3: " + list3);
        System.out.println("list 4: " + list4);
        System.out.println(list3.equals(list4));//false-> the element should be in the same position



    }
}
