package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*Hide passwords

    Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
    Ex:
    Input:
    {"one", "hi", "hold}

        Output:
[ ***, **, **** ]
*/

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(hidePassword(list));//[***, ***, *****]
        System.out.println(numOfStars(4));// ****
    }






    public static ArrayList<String>hidePassword(ArrayList<String>list){

        ArrayList<String>hidden = new ArrayList<>();

        for(String each: list){

            String stars = "";

            for(int i = 0; i<each.length(); i++){
                stars +="*";
            }

            hidden.add(stars);

        }
       return hidden;
    }

    public static String numOfStars(int length){
        String stars = "";
        for (int i = 0; i < length; i++) {
            stars += "*";
        }
        return  stars;

    }



    }
  /*  the original version

   public static ArrayList<String>hidePassword(ArrayList<String>list){

        ArrayList<String>hidden = new ArrayList<>()

        for(String each: list){

            String stars = "";

            for(int i = 0; i<each.length(); i++){
                stars +="*";
            }

            hidden.add(stars);

        }
        return hidden;
    }
*/