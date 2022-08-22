package day19_loops;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Camel Case
Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
Ex:
	Today is SUNDAY

	Output:

	todayIsSunday
         */
      /*  String s = "Today is SUNDAY".toLowerCase();
        String s2 = "";
        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i)==' '){
                s2 += s.substring(i+1, i+2).toUpperCase();
            }else {
                s2 +=s.charAt(i);
            }

            System.out.println(s2.replace(" ", "");

        }*/
        String s = "Today is THURSDAY".toLowerCase();

        String s2= "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                s2 += s.substring(i+1,i+2).toUpperCase();
i++;
            } else {
               s2 += s.charAt(i);
            }
        }
        System.out.println(s2.replace(" ", ""));

        }
    }

