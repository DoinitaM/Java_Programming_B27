package day04_variables;

public class MyName {
    public static void main(String[] args) {
        char first  = 'D';
        char second = 'o';
        char third = 'i';
        char fourth = 'n';
        char fifth = 't';
        char sixth = 'a';
    //1
        System.out.print(first);//we use just 'print' not 'println' if we want all in one line
        System.out.print(second);
        System.out.print(third);
        System.out.print(fourth);
        System.out.print(third);
        System.out.print(fifth);
        System.out.println(sixth);
    //2
        System.out.println("My names is " + first + second + third + fourth + third + fifth + sixth);
        //concatenate a String in the beginning, this will concatenate all the chars together
    //3
        System.out.println(" " + first + second + third + fourth + third + fifth + sixth); // we can put just space and will be the same positive results
        //todo:it's 3 ways to write the name
        //todo: 2nd hour of class review
        System.out.println(first + second+ third + fourth+third + fifth + sixth );// this is not a correct results, it will show just numbers (712 in this case)
    }
}
