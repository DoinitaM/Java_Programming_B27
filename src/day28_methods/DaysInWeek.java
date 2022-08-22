package day28_methods;

public class DaysInWeek {

    public static void main(String[] args) {
        System.out.println(daysInWeek(4));
        System.out.println(daysInWeek(7));

       switch (daysInWeek(6)){
           case "mon":
               System.out.println("Full day of java ");
               break;
           case"tues":
               System.out.println("Half day of java. half of soft skills");
               break;
           case "wed":
               System.out.println("Office hours ");
               break;
           case"thur":
               System.out.println("Half day of java, half of soft skills");
               break;
           case "fri":
               System.out.println("Full day of java ");
               break;
           case"sat":
               System.out.println("day off");
               break;
           case "sun":
               System.out.println("off ");
               break;

       }


    }
// day 1 is monday
 //day 7 is sunday




    public static String daysInWeek(int day){
        String[] days = {"mon", " tues", " wed", " thur", "fri", "sat", "sun"};
        return days[day-1];//convert the number to index

    }






}
