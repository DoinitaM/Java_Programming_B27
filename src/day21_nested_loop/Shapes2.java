package day21_nested_loop;

public class Shapes2 {
    public static void main(String[] args) {
        int n = 7;


         for(int i = 0; i<n; i++) {
         // System.out.print(" * ");

             for (int j = n; j > i; j--) {
                 System.out.print(" * ");


                 }
             System.out.println();
         }
       /* for (int i = 0; i <10 ; i++) {
            for (int j = 10; j >i ; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }*/
    }
}
