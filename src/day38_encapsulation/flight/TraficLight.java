package day38_encapsulation.flight;

public class TraficLight {

   private  String color;

   public TraficLight(String color){
       setColor(color);
   }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if(color.equals("green") ||color.equals("red") || color.equals("yellow")){

    this.color = color;
            }

        }// id this boolean is false(not a valid color) then nothing is assigned to the color variable


    }

