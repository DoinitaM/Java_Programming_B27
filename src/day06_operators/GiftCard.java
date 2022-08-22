package day06_operators;

public class GiftCard {
    public static void main(String[] args) {
        /*create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end */
        int giftCard = 500;
        int timesUsed = 3;
        int balance1 = giftCard - 150;
        int balance2 = balance1 - 99;
        System.out.println("Gift card balance: " + giftCard);
        System.out.println("Total using times : " + timesUsed);
        System.out.println("Gift card balance is : $" + balance1 +", after using " + -- timesUsed);
        System.out.println("Gift card balance is : $" + balance2 +", after using " + -- timesUsed);
    }

}
