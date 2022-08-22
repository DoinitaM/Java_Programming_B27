package day16_string;

public class EmailCydeo {
    public static void main(String[] args) {
        /*
        [Creating an email]
Ask user to enter two strings. Both strings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.

If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cydeo.com” and print the final string as your created email.
The final email should be in all lowercase.

    input:
        JamesBond
        Secret
    output:
        jameret@cydeo.com
         */
        System.out.println("Enter two strings");

        String s1 = "JamesBond";
        String s2 = "Secret";
        int l1 = s1.length();
        int l2 = s2.length();
        String email = s1.substring(0,4) + s2.substring(3,6) + "@cydeo.com";


        if(l1<6 &&l2<6){
            System.out.println("Invalid data");
        }else {
            System.out.println(email.toLowerCase());






        }
    }
}
