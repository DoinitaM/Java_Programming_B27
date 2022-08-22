package day10_if_statements;

public class NumberToDay {
    /*create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday*/

    public static void main(String[] args) {

        int num = 3;

        if(num == 1){
            System.out.println("Day is monday");
        } else if(num ==2) {
            System.out.println("Day is tuesday");
        } else if(num ==3) {
            System.out.println("Day is wednesday");
        } else if(num ==4) {
            System.out.println("Day is thursday");
        } else if(num ==5) {
            System.out.println("Day is friday");
        } else if(num ==6) {
            System.out.println("Day is saturday");
        } else if(num ==7) {
            System.out.println("Day is sunday");
        } else{
            System.out.println( num + " is not a valid day number");



            }

    }
}
