package day10_if_statements;

public class IfWhithNoBrackets {
    public static void main(String[] args) {

        if (3<9){
            System.out.println("First");
            System.out.println("Second");

        }
        if (3>9) // it's false but the second line will be is statement because no brqckets
            System.out.println("Third");
            System.out.println("Fourth"); // this is not part of statement, it is a normal statement because no brackets
        System.out.println("------------------");

        if (5%2 == 0 )
            System.out.println("even");
        else
        System.out.println("odd");
        System.out.println("-----------------" );
        char a = 'a';

                if (a == 'a')
                    System.out.println("letter a");
                else if (a == 'b')
                    System.out.println("letter b");
                else

                    System.out.println("other");



    }

}
