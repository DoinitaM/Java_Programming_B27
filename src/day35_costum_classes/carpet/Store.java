package day35_costum_classes.carpet;

public class Store {
    public static void main(String[] args) {
        Carpet kover = new Carpet(12.5, 12.99, 35, false);
        System.out.println(kover);

        Carpet kover1 = new Carpet(12.5, 12.99, 35, true);
        System.out.println(kover1);


        Carpet persian = new Carpet(12.5, 12.99, 35, true);
        System.out.println(persian);

        persian.width = 16.5;
        persian.calculatePrice();
        System.out.println(persian);


    }
}
