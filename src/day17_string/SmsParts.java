package day17_string;

public class SmsParts {
    public static void main(String[] args) {
        /*
        [SMS parts] - We will do this together

Given a String in the following format:
Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
         */
       String message = " Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}" ;

       int startSender = message.indexOf('<');
       int endSender = message.indexOf('>');
       int startNumber = message.indexOf('[');
       int endNumber = message.indexOf(']');
       int startMessage = message.indexOf('{');
       int endMessage = message.indexOf('}');

        String sender = message.substring(startSender+1 ,endSender);
        String number = message.substring(startNumber + 1, endNumber);
        String messege1 = message.substring(startMessage+1, endMessage);
//char sen = messege1.endsWith()
        System.out.println("Sender: " + sender);
        System.out.println("NUmber: " + number);
        System.out.println("Message: " + messege1);



    }
}
