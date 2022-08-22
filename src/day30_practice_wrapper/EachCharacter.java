package day30_practice_wrapper;

public class EachCharacter {
    public static void main(String[] args) {
      /*
      given a String , separate each type of character into a different array
       */

        String s = "49jaVA$33*&EOWe82";
        String upper = "";
        String lower = "";
        String number = "";
        String special = "";

        for(int i =0; i< s.length(); i++){

            char letter = s.charAt(i);

            if(Character.isUpperCase(letter)){
                upper +=letter;
            }else if(Character.isLowerCase(letter)){
                lower +=letter;
            }else if(Character.isDigit(letter)) {
                number += letter;
            }else{
                special += letter;
            }


        }
        System.out.println("uppercase: " + upper);
        System.out.println("lowecase: " + lower);
        System.out.println("number: " + number);
        System.out.println("special: " + special);






    }
}
