package day16_string;

public class LongestA {
    public static void main(String[] args) {


    /*
    create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */
        String word1 = "java";
        String word2 = "appless";
        String word3 = "computer";

        String longest = "";



        if (word1.contains("a") &&  word1.length() > longest.length()) {
            longest = word1;
        }
         if(word2.contains("a") &&  word2.length()> longest.length()) {
            longest = word2;
        }
         if  (word3.contains("a") &&  word3.length() > longest.length()) {
            longest = word3;

        }

        System.out.println(longest + " is the longest");
    }
} // we have to use if statement to check everyone... the if else will get wrong results

