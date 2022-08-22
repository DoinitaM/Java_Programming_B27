package day06_operators;

public class CharIncreament {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter ++);// netx line will be the next letter (+1)
        System.out.println(letter);
        System.out.println(letter++);
        System.out.println(letter);

        char letter2 = 'a';
        System.out.println(++letter2); // the letter will star with the next
        //pre increment, so the 1 is added first ,then the expression finished

        char digits = '9';// this is the caracter 9, the digits, not the number 9
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits); // this is preinting the caracter
        System.out.println((int)digits); // cast the caracter to an int, wivh mean that is prints the ascii number for that caracter


        System.out.println(65);
        System.out.println((char)65);

    }

}
