package day24_array;

public class HomePractice4 {
    public static void main(String[] args) {
        /* IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your
array.
Ex:
Input:
["java", "longer word", "civic", "apple",
"racecar", "mom", "anna"]
Output: racecar
Ex:
Input: ["abc", "dna", "kevin", "joe", "lamp"]
Output: No palindrome
         */
        String[] s = {"java", "longer word", "civic", "apple",
                "racecar", "mom", "anna"};


        for (String each : s) {
            System.out.println(each);

            String eachreverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                eachreverse += each.charAt(i);


            }
            if(eachreverse.equals(each)){
                System.out.println(eachreverse);

            }

        }

    }
}

