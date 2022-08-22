package day09_if_statements;

public class Outside {
    public static void main(String[] args) {

        double degrees = 80;
        if (degrees >=72){
            System.out.println("Its nice to go outside");
        }
        if (degrees <72){
            System.out.println("Stay inside, code some java");


//else // we can use both

            if (degrees >=72){
                System.out.println("Its nice to go outside");

        }else {
            System.out.println("Stay inside, code some java");
        }
        }

    }
}
