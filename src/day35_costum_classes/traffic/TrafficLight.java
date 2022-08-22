package day35_costum_classes.traffic;

public class TrafficLight {

    String color;
String direction;
    public TrafficLight(String inputColor) { //need to be differit that color
        boolean isValid = inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green")||inputColor.equalsIgnoreCase("red");

        if (isValid) {
            color = inputColor;

        }

    }
}
