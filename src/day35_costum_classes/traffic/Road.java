package day35_costum_classes.traffic;

public class Road {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("red");
       // light.color = "red";
        System.out.println(light.color);

// invalid case:
        TrafficLight light2 = new TrafficLight("green");
       //light2.color = "green"
        System.out.println(light2.color);

        TrafficLight light3 = new TrafficLight("blue");
        //light3.color = "blue"
        System.out.println(light3.color);

    }
}
