package day05_arithmetic_operators;

public class KgToPounds {
    public static void main(String[] args) {
        /*create a class called KgTopounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
*/
        int kg = 5;
        double lb = kg * 2.20462;
        System.out.println("Hint: 1kg = 2.20462 pounds");
        System.out.println(kg + " kg egual to " + lb + " pounds");

        kg = 10;
        lb = kg * 2.20462;
        System.out.println(kg + " kg egual to " + lb + " pounds");


    }
}
