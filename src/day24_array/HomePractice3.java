package day24_array;

public class HomePractice3 {
    public static void main(String[] args) {
        /*
        Given a String array:
String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
"Albania", "Portugal", "Philippines", "Armenia",
"Colombia",
"Honduras", "Indonesia", "United States"
};
Find and print all the first and last characters
Find and print all the middle character
Print each country as a char array
         */
        String[] s = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia",
                "Colombia", "Honduras", "Indonesia", "United States"};

        for( String eachCountry : s){
            System.out.println(""+ eachCountry.charAt(0) + eachCountry.charAt(eachCountry.length()-1));


         //  System.out.println( eachCountry.charAt(eachCountry.length()/2));
        }
        System.out.println("--------------");
        for(String midlle : s) {
            if (midlle.length() % 2 == 1) {
                System.out.println(midlle.charAt(midlle.length() / 2));
            } else {
                System.out.println("" + midlle.charAt(midlle.length() / 2 - 1) + midlle.charAt(midlle.length() / 2));
            }
        }
        System.out.println("-------------");
            for(String charCountry : s){
                System.out.println(charCountry.charAt(0));

            }

        }
    }

