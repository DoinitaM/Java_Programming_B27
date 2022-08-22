package day29_methods;

public class Picture {
    public static void main(String[] args) {
        draw();
    draw("red");
    draw(10);
    draw("red", "word");
    draw("red", 15);



    }


    public static void draw(){
        System.out.println("Drawing circle");
    }

    public static void draw(String color){
        System.out.println("Drawing with " + color);
    }
    public static void draw(int size){
        System.out.println("making picture of " + size);
    }
    public static void draw(String s1, String s2){
        System.out.println("Drawing with two strings " + s1 + s2);
    }
    public static void draw(String s, int a){
        System.out.println("Drawing with " + s + " size " + a);
    }


}
