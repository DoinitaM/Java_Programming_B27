package day09_if_statements;

public class Letters {
    public static void main(String[] args) {
        char letter = 'B';

        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is an uppercase letter"); // LETTER 'B' 66
        }

/*if(letter >= 65 && letter <= 90) {
 System.out.println(letter + "is an uppercase letter");
 }
 */
        if (letter >= 'a' && letter <= 'z') { // letter 'B' 66
            System.out.println(letter + "is an lowercase letter");
     /* if(letter>= 97 && letter<=122){
     System.out.println(letter + "is a number");
     }
     */
        }
    }
}

