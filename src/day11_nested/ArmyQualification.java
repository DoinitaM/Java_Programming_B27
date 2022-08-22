package day11_nested;

public class ArmyQualification {
    public static void main(String[] args) {
        /*ages: 18-35
        high school diploma
        citizen
         */

        int age = 40;
        boolean hasDiploma = false;
        boolean isCitizen = false;

        if ((age>=18 && age<=35) && hasDiploma && isCitizen){
            System.out.println("You Qualify for the Army");
        }else {

            //if you check about age
            if (age < 0 || age > 120) {
                System.out.println("Not a valid age");
            } else if (age < 18) {
                System.out.println("You are too young, need to be at least 18");
            } else if(age > 35) {
                System.out.println("You are too old, limit is 35 years old");
            }
            //if you check about diploma
            if (!hasDiploma) { //if you don't have diploma then :
                System.out.println("You need at least a high school diploma");
            }
            //if you check about citizenship
            if (!isCitizen) {
                System.out.println("You need at least GreenCard");
            }

        }
//if it's a nested are checked every one, and can be multiple version or results/// they check every if and if it's true will be in the console
        // in our proglram we check if you are aligible and show the message if you are, but then if you are not we go through 3 if statements so check the reasons why.

    }
}
