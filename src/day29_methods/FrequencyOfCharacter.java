package day29_methods;

public class FrequencyOfCharacter {
    /*
    given a String and char determine how many times the given char ia in the String
    "java
    how many time is 'a' in the word ->2
     */
    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) ==letter){
                count++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("apple", 'a'));
        System.out.println(frequencyOfChar("mississippi", 's'));
    }
}
