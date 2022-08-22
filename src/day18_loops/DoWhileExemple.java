package day18_loops;

public class DoWhileExemple {
    public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println(i);
        }while(false); // if the wile is false wil run at least one time then stop, not repeat
       //the do block is executer first, then the boolean is checked
        System.out.println("=-----------------------=");
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
