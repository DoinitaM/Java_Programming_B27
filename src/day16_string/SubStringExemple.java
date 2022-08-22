package day16_string;

public class SubStringExemple {
    public static void main(String[] args) {

        String s = "infinity";
        //          01234567
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));
      //  System.out.println(s.substring(9));// invalid index will stops the program

        System.out.println(s.substring(1,6));
      //  System.out.println(s.substring(0,5,));//s.charAt(0) -> will not run because of 0 at beggining
        System.out.println(s.substring(0,1));//s.charAt(0)
        System.out.println(s.substring(3,7));
      //  System.out.println(s.substring(3,9)); // can not use 9 index here -> will be a error

    }
}
