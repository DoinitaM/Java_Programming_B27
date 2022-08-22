package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {





    public static ArrayList<String> getDaysOfWeek(){

        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", " wednesday", "Thoursday", "Friday", "Saturday", "Sunday"));
    }


    public static ArrayList<Integer> getRandomNumbers(int limit) {

        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(random.nextInt(1000));//0 to 1000


        }

        return list;
    }
}
