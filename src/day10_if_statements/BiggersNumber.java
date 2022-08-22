package day10_if_statements;

public class BiggersNumber {
    public static void main(String[] args) {
        int first = 1;
        int second = 10;
        int third = 5;
      //int biggest = 0; // second option
        if (first> second && first>third ){
            System.out.println( first + " is the biggers");
           // biggest = first; // second option
        }else if ( second > first && second > third){
            System.out.println(second + " is the biggest");
           // biggest = second; // second option
        }else{
            System.out.println(third + " is the biggest");
           // biggest = third; // second option
        }
       // System.out.println(biggest + " is the biggest"); // second option

    }
}
