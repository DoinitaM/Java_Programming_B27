package my_utils;

public class StringUtil {
   /*
   This class will be used to creat String utility methods

    */

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
// palindrome means the String in the same forward and backwards

    public static boolean isPaldinrome(String str) {
        return reverse(str).equalsIgnoreCase(str);

    }

    /*
    Fix format
    create a method will accept a String and return a String
    in proper format
     */
    public static String fixFormat(String str) {

        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

/*
CamelCase
create a method that will accept  A String of word separated by sapece, and return a camel case
 */

    public static String camelCase(String str) {

        String[] allWorlds = str.split(" ");//str. "Java will ruLE thee World"
        //allWorld["Java", "will", " ruLE",..]
        String camelCase = allWorlds[0].toLowerCase();//javaWillRuleTheWorld

        for (int i = 1; i < allWorlds.length; i++) {//we start from index 1 because we alseady used first inedx
            camelCase += fixFormat(allWorlds[i]);

        }
        return camelCase;
    }

    public static int frequencyOfChar(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;


    }
}