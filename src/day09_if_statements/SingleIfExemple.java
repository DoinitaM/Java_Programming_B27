package day09_if_statements;

public class SingleIfExemple {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello");//when the boolean is true will run
        }
        System.out.println("break"); // normal print statement, not part of any statements if
        if(false) {
            System.out.println("Bye"); // the boolean is false, this will not run
        }
        System.out.println("_______________________");
            int year = 2020;
            if (year == 2020 || year == 2021){
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("social distance");
        }

        System.out.println("---------------------");
     double price = 39.99;
     if ( price >= 20){
         System.out.println("Free shipping");
        }
        System.out.println("-----------------" );



    }



}
