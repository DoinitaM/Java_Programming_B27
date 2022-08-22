package day34_costum_classes;


public class HomePractice_rectangleCalculate {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.base = 6.0;
        rectangle.height = 3.5;
        rectangle.calculatePerimeter();
        rectangle.calculateArea();
        System.out.println(rectangle);
        System.out.println("-------------");


        Rectangle rectangle1 = new Rectangle();
        rectangle1.base = 8.0;
        rectangle1.height = 5.5;
        rectangle1.calculatePerimeter();
        rectangle1.calculateArea();
        System.out.println(rectangle1);
    }
}
