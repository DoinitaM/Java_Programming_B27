package day11_nested.home_practice;

public class Movie {
    public static void main(String[] args) {

        /*The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes
duration of less than or equal to 0:
Movies cannot be less than 0 minutes
duration of more than 4:
Movies cannot be more than 4 hours
for all other duration uses the following values to display the
price of the tickets
duration --> price
1.0 --> 8.99
1.5 --> 10.50
2.0 --> 12.99
2.5 --> 14.50
3, 3.5 or 4 --> 15.99*/

        double lenghtMovie = 1.22;
        System.out.println("Enter a lenght time  for the movie: " + lenghtMovie);

        if(lenghtMovie> 0 && lenghtMovie<= 4){

            if(lenghtMovie<1.5){
                System.out.println("The price of the tickets is: 8.99");
            }else if(lenghtMovie<2){
                System.out.println("The price of the tickets is: 10.50");
            }else if(lenghtMovie<2.5){
                System.out.println("The price of the tickets is: 12.99");
            }else if (lenghtMovie<3){
                System.out.println("The price of the tickets is: 14.50");
            }else{
                System.out.println("The price of the tickets is: 15.99");
            }

        }else{

            if(lenghtMovie<= 0){
                System.out.println("Movies cannot be less than 0 minutes");
            }else{
                System.out.println("Movies cannot be more than 4 hours");
            }
        }






    }
}
