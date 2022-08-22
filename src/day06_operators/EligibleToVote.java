package day06_operators;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = false;
        boolean over18 = age >=18;
        boolean isEligible = isCitizen && over18 && !hasCriminalBackground;
        System.out.println(isEligible);
// isCitizwen = true
        // over18 = true
      // ! hasCriminalBackground = !false ->true

// true && true && true -> true

/* int age = 21;
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        boolean over18 = age >=18;
        boolean isEligible = isCitizen && over18 && !hasCriminalBackground;
                                true   &&  true  &&     !true ->false
                                     true      &&     false
                                           false */

      

    }
}
