package day21_nested_loop;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*
        given a string determine how many times a character is in the string java
       j-1
       a-2
       v-1

      j
      j==j
      j==a
      j==v
      j==a

      a
      a==j
      a==a
      a--v
      a==a
         */
        String str = "hello java";
        String checked = "";

        for(int i = 0; i < str.length(); i ++) { // outer: interatinh one character at the time
            int count = 0; // the counter shoul reset back to 0 for every character

            if (!checked.contains("" + str.charAt(i))) {//only run the counterthat not repeat
                //    continue; // skip and  go to the next or just put ! before checked


                for (int j = 0; j < str.length(); j++) { // inner : compare the character we are looking at (i) with each other character in the String

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;

                    }
                }
                System.out.println(str.charAt(i) + " - " + count);
                checked += str.charAt(i);
            }
        }
    }
}
