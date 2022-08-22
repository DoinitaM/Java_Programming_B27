package day07_scanner;
    import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
/*Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity */

        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        double quantity = in.nextDouble();
        double revenue = price + quantity;

        System.out.println("Inter the price: $" + price + " and quantity: " + quantity+ "lb");
        System.out.println("The revenue is: " + revenue);

    }
}
