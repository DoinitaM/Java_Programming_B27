package day17_string;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello world");
      //    while(true){  // this is an infinite loop what doesn't stop
      //      System.out.println("Hello World");
      //  }

        //print 50 times
        int counter = 1; // we can start from 0 and 50 times will be <50

        while (counter<=50){
            System.out.println("Hello world " + counter);
            counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point

        }

    }
}
