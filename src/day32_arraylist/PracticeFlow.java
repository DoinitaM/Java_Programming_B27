package day32_arraylist;

import java.util.ArrayList;

public class PracticeFlow {
    /*
    ArrayList Practice
----------------------------------------------------------

Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made
    */
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        System.out.println(words);//[Hat]
        words.add("Shoes");
        System.out.println(words);//[Hat, Shoes]
        words.add(1, "Jacket");
        System.out.println(words);//[Hat, Jacket, Shoes]
        words.add(0, "Towel");
        System.out.println(words);//[Towel, Hat, Jacket, Shoes]
        words.add(1, "Car");
        System.out.println(words);//[Towel, Car, Hat, Jacket, Shoes]

/*
Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made
 */
        System.out.println("-----------------------------------------------------------------");
        ArrayList<String> average = new ArrayList<>();
           average.add("Iron Man");
        System.out.println(average);//[Hat]
        average.add("Shoes");
        System.out.println(average);//[Hat, Shoes]
        average.add(1, "Spider Man");
        System.out.println(average);//[Hat, Jacket, Shoes]
        average.add("Thor");
        System.out.println(average);//[Towel, Hat, Jacket, Shoes]

        //print each initial. if there is only one world, then print just the first letter
        for(String each : average){

            if(each.contains(" ")){
                int space = each.indexOf(" ") + 1;
                System.out.println(each.substring(0, 1) +each.substring(space, space +1));
            }else{
                System.out.println(each.charAt(0));
            }
        }

        System.out.println("------------------------------------------------------------------------");

        System.out.println(average);

     int indexOfThor = average.indexOf("Thor");
        System.out.println(indexOfThor); //3
        average.remove(indexOfThor);//remove second
        System.out.println(average);//[Iron Man, Spider Man, Shoes]

      average.remove("Iron Man");
        System.out.println(average);//[Spider Man, Shoes]
        average.remove(0);
        System.out.println(average);//[Shoes]


        //remove the Integer List

        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);//[800, 300, 400, 300]


       // nums.remove(300); the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer)300);//300 is being cast to Integer, so it will remove the element
        System.out.println(nums);//[800, 400, 300]

//Name in ArrayList
        ArrayList<Character> name = new ArrayList<>();
        name.add('S');
        name.add('a');
        name.add('i');
        name.add('m');
        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
    }
}