package day19_loops;

public class reverse {
    public static void main(String[] args) {
        /*
        Reverse only second word
Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	I love java

	Ouput:
	I evol java

         */
        String word = "I love you";
        String secoond = word.substring(word.indexOf(" "),word.lastIndexOf(" "));
        String first = word.substring(0,word.indexOf(" "));
        String third = word.substring(word.lastIndexOf(" "));
        String reverse = "";
        System.out.println(secoond);

        for (int i = secoond.length()-1; i >= 0; i--) {
       reverse +=secoond.charAt(i);
        }
        System.out.println(first +" " + reverse + ""+third);
    }

}
