package day22_array;

public class PracticeArray4 {
    public static void main(String[] args) {
        /*
        Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]
        JB
        HP
        TS
No loop yet
         */
        String[] s  = {"James Bonds", "Harry Potter", "Tony Stark"};
         String s1 = s[0];
         String s2 = s[1];
         String s3 = s[2];

        System.out.println(s1.substring(0,1) +s1.charAt(s1.indexOf(" " )+1) );
        System.out.println(s2.substring(0,1) +s2.charAt(s2.indexOf(" " )+1) );
        System.out.println(s3.substring(0,1) +s3.charAt(s3.indexOf(" " )+1) );

    }
}
