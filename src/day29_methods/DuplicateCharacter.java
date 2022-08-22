package day29_methods;

import my_utils.StringUtil;

public class DuplicateCharacter {
    /*
    given a string, find and print the dublicated character . a charcater is duplicatedif it appear more than once in the string
    ex : aaabbbccccdseFX
    output: abc
     */
    public static void main(String[] args) {
        System.out.println(getDuplicatedCharacter("aaabbbccccdseFX"));
    }

    public static String getDuplicatedCharacter(String str){

        String duplicate = "";
        for(int i = 0; i<str.length(); i++){
            //str.charAt (i) --> give every character

      if(duplicate.contains("" + str.charAt(i))){
          continue;
      }

        int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

        if(frequency>1){
           duplicate +=str.charAt(i);
        }
        }
        return duplicate;
    }


}
/*
String str = aaabbbccccdseFX
int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));
StringUtil.frequencyOfChar(str. A
 */