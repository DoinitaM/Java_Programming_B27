package day05_arithmetic_operators;

public class Employee {
    public static void main(String[] args) {
        String firstName = "James";
        String lastName = "Bond";
        String companyName = "MI6";
        String jobTitle = "Secret Agent";
        char suite = 'E';
        int employeeId = 7;
        int numberOfPTO = 15;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName; //concagnation is when we change or subbmit name with fisrt name ( we put firstname no James)
        String email = firstName + employeeId + '@' +companyName + ".com";
        String benefits = "$"+ salary + " salary a year, " + numberOfPTO +" PTO days and work from home.";
        String summary = "Employee information for " + fullName + ". " + jobTitle + " for " + companyName + ", based in suite " + suite + ". Mr/Mrs " +lastName + " is full time "+ isFullTime + ". Contact Mr/Mrs " + lastName + " at " + email + " . Current benefits include " + benefits;
        System.out.println(summary);

    }
}
