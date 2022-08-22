package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    /*
    All Palindrome

Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
Ignore case sensitivity

Ex:
Input:
     "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
Output:
    Anna, Racecar, Level, Eye
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "carac", "today"));
        System.out.println(list);
        System.out.println(PalindromeStrings(list));
    }

    public static ArrayList<String>PalindromeStrings(ArrayList<String>list){
        ArrayList<String> result = new ArrayList<>();
        for(String each:list) {
            String reverse ="";
            for (int i = each.length()-1; i >= 0 ; i--){
                reverse +=each.charAt(i);
            }
if(each.equalsIgnoreCase(reverse)){
    result.add(each);
}
        }
return result;
    }
}
