package day39_inheritance.acces.a;

public class Runner {
    public static void main(String[] args) {


        // What did I inherit , what do i have acces to
        Condo condo = new Condo();
        condo.adress = "1312 l";
        condo.city = "Chicago";
        condo.state = "IL"; // is inherited because is in the same package
        // condo.zipcode = zipcode was private so it doesn't inherit

    }
}
