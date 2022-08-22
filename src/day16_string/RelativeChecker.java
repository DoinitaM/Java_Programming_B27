package day16_string;

public class RelativeChecker {
    public static void main(String[] args) {
        /*
        [Relative checker]
Given two full names check if the two people are related. They will be considered to be related if they have the same last name

    Input:
        James Bond
        Jamie Bond
    Output:
        Related
         Input:
        James Bond
        Alex Benji
    Output:
        Not Related

         */
        String s1 = "James Bond";
        String s2 = "Jamie Benji";
        String s11=  s1.toLowerCase();
        String s22 = s2.toLowerCase();

        if(s11.contains("bond") && s22.contains("bond")){
            System.out.println("They are related");
        }else{
            System.out.println("They are not related");
        }

    }
}
