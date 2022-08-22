package day09_if_statements;

public class HomePractice5 {
    public static void main(String[] args) {
        /*create a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number

	ex:
		$
		speical character*/
        char letter = '#';
        System.out.println("Enter a letter");
        System.out.println(letter);
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println("This is a letter ");
        } else if (letter >= 0 && letter <= 0) {
            System.out.println("This is a number");
        } else {
            System.out.println("This is a special caracter");
        }
    }
}
