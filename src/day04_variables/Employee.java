package day04_variables;

public class Employee {
    public static void main(String[] args) {

        /* - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

    declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - email (first name + employee id @ company name.com)
        - benefits (salary, number of PTO and add "work from home")

    create a summary of the information and print it. Be creative
        Example output: Employment information for James Bond. Secret Agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr. Bond at James7@MI6.com. Current benefits include $1000000 salary a year, 20 PTO days and work from home.*/

        String firstName= "Sam", lastName = "Depp", companyName= "Amazon", jobTitle = "Manager";
        char suite = 'C';
        int employeeID = 321, numberOfPTO = 40;
        double salary = 9000.00;
        Boolean isFullTime = true;
        String fullName = firstName + " " + lastName;
        String email = " "+ firstName + employeeID + "@" + companyName + ".com ";
        String benefits=  "salary: $" +salary +"," +" number of PTO: " +numberOfPTO + "days"+ " + work from home ";

        System.out.print(" Employee information for " +fullName + ", ");
        System.out.println(" Contact email:" + email +" ;");
        System.out.println("He is based in suite: (" + suite +"). "  +"Mrs. Depp has full time job: " +isFullTime +";");
        System.out.println( "Benefits: " + benefits + ".");





    }
}
