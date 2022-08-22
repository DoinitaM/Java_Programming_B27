package day38_encapsulation.drivinf;

import day38_encapsulation.flight.TraficLight;

public class Driving {
    public static void main(String[] args) {
        TraficLight road1 = new TraficLight("red");
        System.out.println(road1.getColor()); // road1.color is not valid anymore


       road1.setColor("blue");//is false so will repeat the statement what was before
        System.out.println(road1.getColor());


        road1.setColor("green");
        System.out.println(road1.getColor());


        road1.setColor("pink");//is false so will repeat the statement what was before
        System.out.println(road1.getColor());
    }
}
