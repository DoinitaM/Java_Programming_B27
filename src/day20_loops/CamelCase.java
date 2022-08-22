package day20_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
   Today is SUNDAY
 Output:
	todayIsSunday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter multiple word");
        String str = input.nextLine().toLowerCase();
        String camelCase = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {

                camelCase += str.substring(i + 1, i + 2).toUpperCase(); //gives the one cgaracter after space
                //str.charAt(i+1).to.upperCase() or str.toUpperCase().charAt(i+1);

                i++; // we need to add because we already used the start of the word and to not repeat /// be hello and no Hhello // avoid doublecated

            } else {
                camelCase += str.charAt(i);

            }
            }
            System.out.println(camelCase);

    }
}
