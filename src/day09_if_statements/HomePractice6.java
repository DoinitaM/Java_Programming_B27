package day09_if_statements;

public class HomePractice6 {
    public static void main(String[] args) {
        /*create a number to represent the day. (1 being Monday and 7 being Sunday)
Print the day related to the number

	Ex:
		2
		Tuesday

	Ex:
		5
		Friday
__________________*/
        int day = 4;
if(day ==1){
    System.out.println(day + " \nMonday");
}
        if(day ==2) {
            System.out.println(day + "\n Tuesday");
        }
        if(day ==3) {
            System.out.println(day + "\n Wednesday");
        }
        if(day ==4) {
            System.out.println(day + "\n Thursday");
        }
        if(day ==5) {
            System.out.println(day + "\n Friday");
        }
        if(day ==6) {
            System.out.println(day + "\n Saturday");
        }
        if(day ==7) {
            System.out.println(day +  "\n Sunday");
        }
    }
}
