package day21_nested_loop;

public class Shapes {
    public static void main(String[] args) {


        char a = '*';
        //char a1 = a;
        int i1 = 3;
        for (int i = 0; i <= i1; i++) {

            System.out.print(" * ");
            for (int j = 0; j <= i1-1; j++) {

                System.out.print(" * ");
            }
           System.out.println();

        }

    }

}