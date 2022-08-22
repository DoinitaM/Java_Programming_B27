package day16_string;

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
      String sms = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
        String sender = sms.substring(sms.indexOf('<')+1, sms.indexOf('>'));
        String number = sms.substring(sms.indexOf('[')+1, sms.indexOf(']'));
        String message = sms.substring(sms.indexOf('{')+1, sms.indexOf('}'));
        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
    }
}
