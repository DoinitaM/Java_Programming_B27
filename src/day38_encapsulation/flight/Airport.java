package day38_encapsulation.flight;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virginia");

        System.out.println(ticket1.getType());// first
        System.out.println(ticket1.getDepartureLocation());//Chicago
        System.out.println(ticket1.getArrivalLocation());//Virginia

        FlightTicket ticket2 = new FlightTicket("flying", "New York", "Canada");
        System.out.println(ticket2.getType());//null


        ticket2.setType("economy");
        System.out.println(ticket2.getType());//economy

    }
}
