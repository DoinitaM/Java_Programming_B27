package day18_loops;

public class while_practice4 {
    public static void main(String[] args) {
/*
write a program that will check all the numbers from 1 - 50 and apply fizzbuzz logic to it (see previous task from class if you are not sure)
    1.  For numbers which are divisible by 3, print "Fizz" instead of the number.
    2.  For numbers which are divisible by 5, print "Buzz" instead of the number
    3.  For numbers which are a divisible by both 3 and 5, print "FizzBuzz" instead of the number
 */
        int limit = 50;
        int num = 1;

        while(num<=50){
            if (num %3 ==0) {
                System.out.println(num+" Frizz");
            }
            if(num %5 ==0){
                System.out.println(num + " Buzz");
            }
            if(num%3==0 && num%5 ==0){
                System.out.println(num +" FrizzBuzz");
            }
            num++;
        }
    }
}
