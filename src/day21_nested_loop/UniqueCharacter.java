package day21_nested_loop;

public class UniqueCharacter {
    public static void main(String[] args) {
        /*
        java
        given a String find the print all unique characters

        unique character: only appears in the String once

        output:
        jv
         */
      //  String s = "Java";

        /*for(int i = 0; i<s.length(); i ++){

            for(int j=0; j<s.length(); j ++) {
                if (s.charAt(i) == s.charAt(j)) {
                    break;
                } else {

                    //System.out.println( s.charAt(i) +" " s.charAt(j));


                    System.out.println((s.charAt(i)) + " " + (s.charAt(j)));
                }
            }
        }*/
        String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
                }
               if(count==1) { // if the counter is 1 the character was find only one time
                   System.out.println(s.charAt(i));
               }

            }
        }
    }


/*
 String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" = ");
            for (int j = 0; j < s.length(); j++) {

                   // System.out.println((s.charAt(i)) + " -> " + (s.charAt(j)));
                System.out.print("-"+ s.charAt(j));
                        }
                        System.out.println() ;
                        */
