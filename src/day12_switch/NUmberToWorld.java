package day12_switch;

public class NUmberToWorld {
    public static void main(String[] args) {
        /* number 1-5
        convert the number to number world
        1->onw
        2->two
        ...
        5->five
        defaul case
         */

        int num = 6;

        switch (num){

            case 5:
                System.out.println("5");
                break;
            case 4:
                System.out.println("4");
                break;
            case 3:
                System.out.println("3");
                break;
            case 2:
                System.out.println("2");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("NUmber should be between 1 and 5");
        }





    }



}
