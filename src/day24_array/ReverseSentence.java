package day24_array;

import day19_loops.reverse;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = " Today is Friday. Have a good weekend";

        //reverse: weekend! good a  Have Friday. is Today

        String[] words = str.split(" ");
        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        System.out.println(reverse.trim());

        System.out.println("------------");
        // reverse each word

       /* String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";

        for(String each: words){
            System.out.println(each);

            String eachReverse = "";
            for(int i = each.length()-1; i>=0; i--){
                eachReverse +=each.charAt(i);
            }
            reverse+=eachReverse + " ";

        }

        System.out.println(reverse);

*/



    }
}
