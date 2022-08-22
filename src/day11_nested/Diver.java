package day11_nested;

public class Diver {
    /*create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50% */
    public static void main(String[] args) {
        int tank = 90;
        String messege = " ";

        if(tank >90){
            messege = "your tank is full";
        }else if(tank>80){
            messege = "Still okay";
        }else if(tank>70){
            messege ="Don't go too far";
        }else if(tank>60){
            messege ="Start to head back" ;
        }else if(tank > 50){
            messege= "Be careful now you at at 50%";
        }
        System.out.println(messege);

    }
}
