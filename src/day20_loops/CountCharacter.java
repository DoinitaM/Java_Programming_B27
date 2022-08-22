package day20_loops;

public class CountCharacter {
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
        int lower = 0;
        int upper = 0;
        int num = 0;

        for (int i = 0; i <s.length() ; i++) {

            char eachLatter = s.charAt(i);

            if (eachLatter >= 'A' && eachLatter <= 'Z') {
                upper++;
            } else if (eachLatter >= 'a' && eachLatter <= 'z') {
                lower++;
            } else if (eachLatter >= '0' && eachLatter <= '9') {
                num++;
            }
        }
            System.out.println(upper + " uppercase");
            System.out.println(lower + " lowercase");
            System.out.println(num + " number");

    }
}
