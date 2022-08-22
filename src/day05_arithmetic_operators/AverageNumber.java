package day05_arithmetic_operators;

public class AverageNumber {
    public static void main(String[] args) {
        /*create a class AverageNumber, and write a program that will define 4 scores and find the average of the scores
_____________________________________________*/
        short test = 7;
        int activities = 10;
        float teachers = 8.8F;
        double technology = 5.5;
        double total = test + activities + teachers + technology;
        double schoolaverage  = total / 4;

        System.out.println("Test: " + test);
        System.out.println("Activities: " + activities);
        System.out.println("Teachers: "+ teachers);
        System.out.println("Technology:" + technology);

        System.out.println("School Average: " + schoolaverage);


        }


    }

