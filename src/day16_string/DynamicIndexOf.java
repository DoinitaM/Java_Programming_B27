package day16_string;

public class DynamicIndexOf {
    public static void main(String[] args) {

        String str = "mississippi";
       //             012345678910
        // goal is to find all the indexes of all the 'i' characters

        System.out.println("First i: " +str.indexOf('i'));

        System.out.println("Last i: " + str.lastIndexOf('i'));

        System.out.println("other use of indexof");

        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i', 4));// if first i is 3 we put 4 to see from 4 that i will be
        System.out.println("Second i: " + str.indexOf('i', 6));

        System.out.println("Hard coded above -----Dynamic below");


        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI + 1); // take previous index and add 1 to it , so we can start looking fir the next occurence
        int thirdI = str.indexOf('i', secondI +1);
        int fourtI = str.indexOf('i', thirdI + 1);
        System.out.println("First i: " + firstI);
        System.out.println("Second i: " + secondI);
        System.out.println("Third i: " + thirdI);
        System.out.println("Fourt i: " + fourtI);


    }
}
