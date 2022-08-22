package day17_string;

public class PrintLetters {
    public static void main(String[] args) {

        char first = 'A';
        while(first <= 'Z') {
            System.out.println(first++);

        }

/*
interation 1:
    first = 'A'
    'A' <'Z' ->true
    loop runs
    prints(first) -> A
    the increments because of post increment
    first ++ -> B

interation 2:
    fist 'B'
    'B' <'Z' -> true
    loop runs
    prints(first) -> B
    the increments because of post increment
    first ++ -> C

 */
// PRINTING z - a
        char backwards = 'z';
        while(backwards>= 'a'){
            System.out.print(backwards--); // if we use print () will be printed in one line/ println in separated line
        }


    }
}
