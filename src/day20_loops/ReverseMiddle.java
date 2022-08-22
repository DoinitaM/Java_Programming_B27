package day20_loops;

public class ReverseMiddle {
    public static void main(String[] args) {
        /*
        Given a String with three words separated by spaces. Reverse only the second word and return the modified String
	Ex:
	"I love java"
	Ouput:
	I evol java
         */
        String s = "I love java";
        String reverse = "";
       int start = s.indexOf(' ')+1; // will give me the first character of the word
       int end = s.lastIndexOf(' ');
       String midlleword = s.substring(start,end);

        for (int i = midlleword.length()-1; i >=0 ; i--) { //loop start from the last index of the middle word until first index
            reverse += midlleword.charAt(i);

        }
        System.out.println(reverse);
                                         //first word    +   reverse from middle +  last word
        System.out.println(s.substring(0,s.indexOf(' ')) + " " + reverse + " " + s.substring(end + 1));
        //  or we can use: s.substring ( 0, s.start-1 )  +                    + s.lastIndexOf(' ') +1
    }
}
/* alternative
String s = "I love java";
        String reverse = "";
        for( int i = s.lastIndexOf(' ')-1; i > s.indexOf(' '); i--){
        reverse +=s.charAt(i);
 */
