package day14_stringMetods1;

public class StringPassword {
    public static void main(String[] args) {

        /*Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password*/

        String password = "RS33Pp9Dd";
        if (password.equals("RS33Pp9Dd")){
           if (password.length() >8){
               System.out.println("Valid password");
           }else{
               System.out.println("Invalid password");
           }
        }
    }

}
