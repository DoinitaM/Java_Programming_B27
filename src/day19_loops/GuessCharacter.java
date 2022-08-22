package day19_loops;

public class GuessCharacter {
    public static void main(String[] args) {
        /*
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
         */
       String s = "2juMp41EEkd4s4";
        int uppercase = 0;
        int number = 0;
        int lowecases = 0;


        for (int i = 0; i < s.length(); i++) {

            if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
                lowecases++;
            }
            if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
                uppercase++;
            }
            if ((s.charAt(i) >= '0') && (s.charAt(i) < '9')) {
                number++;
            }
        }
        System.out.println(s);
        System.out.println(" contains: " +lowecases + " lowecases, " + uppercase + " uppercase, " + number + " numbers.");


    }
}
