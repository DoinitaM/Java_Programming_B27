package day10_if_statements;

public class TernaryExemple {
    public static void main(String[] args) {
        int score = 50;

        if (score > 70){
            System.out.println("Passing");
        }else {
            System.out.println("Failing");

        }
        System.out.println("------------");//or / other option ->

        int score2 = 50;
        String results;
        if( score2>70){
            results = "passing";
        }else{
            results = "failing";
        }
        System.out.println(results);

        System.out.println("------------");
        int score3 = 80;
       String result2  = score3 > 70 ?  "passing" : "failing"; // storing a result to a String  variable
        System.out.println(result2);
        System.out.println(score3 > 70? "passing" : "failing"); // printing the result right away

        System.out.println("----------");
        int n = 9;
        System.out.println(n % 2 ==0 ? "even" : "odd");
        System.out.println("--------------");
        boolean isGreen = false;
        System.out.println(isGreen? " drive " : "stop");

        /* if(isGreen){
        System.out.println("drive")
        }else{
        System.out.println("Stop")

         */
        int num = 10;
        System.out.println(num> 0 ? "positive" : n < 0 ? "negative" : "zero" );

    }
}
