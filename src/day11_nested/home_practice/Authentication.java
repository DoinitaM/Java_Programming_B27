package day11_nested.home_practice;

public class Authentication {
    public static void main(String[] args) {
       /*declare and assign two expected numbers:
pincode: 1234
ssn: 1111
ask the user to enter the two numbers and compare them with the system
values defined above. If they match print Authentication successful
if they don't match print all the reasons that authentication failed:
if the pincode was incorrect print: Pin Code is incorrect
if the ssn was incorrect print: Last 4 SSN numbers are incorrect*/

      int pinCode = 1234;
      int ssn = 1101;
        System.out.println("Enter two numbers and compare them with the system values");

        if( pinCode == 1234 &&  ssn == 1111){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Identification failed");
            if(pinCode!=1234){
                System.out.println("Pin Code is incorrect");
                System.out.println("Try again");
            }else {
                System.out.println("Last 4 SSN numbers are incorrect");
                System.out.println("Try again");
            }


        }

    }
}
