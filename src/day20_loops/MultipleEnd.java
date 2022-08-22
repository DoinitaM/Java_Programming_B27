package day20_loops;

public class MultipleEnd {
    public static void main(String[] args) {
        /*
        Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times
	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????
	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
         */
        String s = "hello";
        int end = 3;

        for (int i = 0; i <end ; i++) {
          s += s.charAt(s.length()-1); //this is the last character

        }
        System.out.println(s);
    }
}
