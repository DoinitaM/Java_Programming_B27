package day21_nested_loop;

public class BiggestSubstring {
    public static void main(String[] args) {
        /*
        Biggest substring of matching characters

Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
         */

        String str = "aaabbbcccccddddee";
        String longest = ""; //aaa
        String each = "";//bbb

        for (int i = 0; i < str.length() - 1; i++) {

            each += str.charAt(i);//add characters at index i so the Sring each

            /*if (i ==str.length()-1 ||str.charAt(i) != str.charAt(i + 1)) {//check if the current character is not equal to the next character

                if ( each.length() > longest.length()) {
                    longest = each; /// if you find the longest substring, assing it to the longest variable
                }
                each = ""; // ressetting fot the next part
            }
*/
            if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                each += str.charAt(i + 1);
                if (each.length() > longest.length()) {
                    longest = each;
                }
            }
            if (str.charAt(i) != str.charAt(i + 1)) {//check if the current character is not equal to the next character

                if (each.length() > longest.length()) {
                    longest = each; /// if you find the longest substring, assing it to the longest variable
                }
                each = ""; // ressetting fot the next part
            }
        }
        System.out.println(longest);

    }
}


