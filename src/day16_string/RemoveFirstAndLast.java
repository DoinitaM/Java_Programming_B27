package day16_string;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        /*[Remove first and last]

Given two words. Print the first word without its first character then print the second word without its last character.
    Input:
        apple
        banana
    Output:
        pple
        banan
*/
        String s1 = "apple";
        String s2 = "banana";
        System.out.println(s1.substring(1));
        System.out.println(s2.substring(0,5));



    }
}
