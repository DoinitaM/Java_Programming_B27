package day06_operators;

public class BuyHouse {
    public static void main(String[] args) {
        /*create a class BuyHouse

    declare and assign a credit score variable
    declare and assign a salary

    determine if you can get a loan to buy a house
    there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above*/
        int creditScore = 720;
        double salary = 100_000.00;

        boolean loan1 = 720>=720 && 100_000>=100_000;

        boolean loan2 = 720>=740 && 90_000 >=80_000;

        System.out.println("Can we get a loan to buy a house with a credit score of  " +creditScore + " and a salary of $" + salary + " : " +loan1);

        System.out.println("Can we get a loan to buy a house with a credit score of  " +creditScore + " and a salary of $" + salary + " : " +loan2);

    }
}
