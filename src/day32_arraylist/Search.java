package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer",  "codding", "java", "codding",  "reading", "java"));
        System.out.println(searchInList(list, "java")); //3
        System.out.println(searchInList(list, "codding"));//2
        System.out.println(searchInList(list, "friday"));//1

        //testing the EasyData

        // ArrayList<String> test = new ArrayLyst<>




        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);

    }

    public static  int searchInList(ArrayList<String> list, String target){

        int count = 0;
        for(String each : list){
            if(each.equalsIgnoreCase(target)){
                count++;

            }
        }
        return count;




    }



}
