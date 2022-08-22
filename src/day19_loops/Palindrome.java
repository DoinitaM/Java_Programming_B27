package day19_loops;

public class Palindrome {
    public static void main(String[] args) {


    /*
    given a String determine if it is palindrome
    palindrome means the String is read the same forwards and backwards

    ex:
    anna
    maam
     */
    String s = "racecar";
    String reverse = "";
    //reverse my String , read it back from last index to first, backwards

    for(int i = s.length()-1;i>=0; i-- ) { // it is just a number but using length-1 allowme to find the last index of the string, that means we can use that index to read characters

        reverse += s.charAt(i);
    }
        System.out.println(reverse);

    if (s.equals(reverse)){
        System.out.println("Palindrome");
    }else{
        System.out.println("Non palindrome");
    }
        System.out.println(s.equals(reverse)?"Palindrome":"Non Palindrome");
    }
}
