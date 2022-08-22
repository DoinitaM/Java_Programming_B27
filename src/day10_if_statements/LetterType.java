package day10_if_statements;

public class LetterType {
    /*create a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number

	ex:
		$
		speical character*/
    public static void main(String[] args) {
        char caracter = 'p';
        boolean isLetter = (caracter>='A'&& caracter<='Z')|| (caracter>='a'&& caracter <='z');
        boolean isNumber =  caracter>='0' && caracter<='9';
        if(isLetter){
            System.out.println(caracter + " is a letter");
        }
        if(isNumber){
            System.out.println(caracter+ " is a number");
            if(!isLetter && !isNumber){
                System.out.println(caracter + " is a special caracter");

            }
        }
    }
}
