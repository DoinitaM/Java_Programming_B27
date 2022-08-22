package day11_nested;

public class Grade {
    public static void main(String[] args) {


        int score = 45;

        if (score >=75){
            System.out.println("Passed");
            if(score>92){
                System.out.println("you did very well");
            } else if(score>80){
                System.out.println("you did a good job");
            }else{
                System.out.println("not bad");
            }

        }else {
            System.out.println("Failed");
            if(score>50){
                System.out.println("try harder");
            } else{
                System.out.println("study much more" );
            }


        }
    }
}