package day30_practice_wrapper;

import java.util.Arrays;

public class HomePractice1 {
  /*
  Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string
Ex:
    str = "JAVA java";
output:
    true
   */
  public static void main(String[] args) {
String s = "JAVA java";
String[] s1 = s.split(" ");
    System.out.println(Arrays.toString(s1));//[JAVA, java]
    System.out.println(s1[0]);
    System.out.println(s1[1]);
int countUpper = 0;
int countLower = 0;
      /* if(s1[0].length() == s1[1].length()){
         System.out.println("true");//true
       } */ //-> it's check just the length of words not type of character

      System.out.println("==========================");
       for(int i = 0; i<s.length(); i++){
         if(s.charAt(i)>='a' &&s.charAt(i)<='z'){
             countLower++;
         } else if (s.charAt(i)>='A' &&s.charAt(i)<='Z') {
             countUpper++;
         }
       }
if(countLower==countUpper){
    System.out.println(true);
}else{
    System.out.println(false);
}
      System.out.println("-----------------------------------");
      System.out.println(countLower==countUpper?true : false);






  }
}
