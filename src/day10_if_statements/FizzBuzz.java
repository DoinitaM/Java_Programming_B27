package day10_if_statements;

public class FizzBuzz {
    public static void main(String[] args) {
/*[IQ] ( interviu question) Given a number n, print the output on the following condition:
        the number if divisible by 3 print Fizz
        the number if divisible by 5 print buz
        the number if divisible by 3 and 5 print FizzBizz
        if number is not divisible by any the print just the number
         */

    int n = 15;
        System.out.println("Enter a number" );
    if ( n % 3 == 0 ){
        System.out.println("Fizz");
    }else if ( n % 5 ==0) {
        System.out.println("Buzz");
    }else if ( n % 3 ==0 && n % 5 == 0 ) {
            System.out.println("FizzBuzz");
        }else {
        System.out.println(n);
    }


    }


}
