package day16_string;

public class CreateID {
    public static void main(String[] args) {
        /*
[Create ID]
Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
         */
       String name = "john";
       String lastName = "smith";
        String iD = name.substring(0,1).toLowerCase() + lastName.substring(0,1).toUpperCase()+lastName.substring(1,3).toLowerCase()+ name.length()*2;


        System.out.println(iD);
    }
}
