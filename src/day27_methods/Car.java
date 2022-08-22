package day27_methods;

public class Car {
    /*
    unlock car
    open the door
    sit down si start
    check mirrors
    seatbelt

    put to drive and go
     */
   public static void unlock(){
       System.out.println("Unlocking car");
   }

   public static void openDoor(){
       System.out.println("Opening the door");
   }

   public static void sitAndStart(){
       System.out.println("Seating down in seat");
       System.out.println("Ajust the seat");
       System.out.println("Then inseart the key");
       System.out.println("Start the car");
   }

   public static void checkMirror(){
       System.out.println("Checking left mirror");
       System.out.println("Checking right mirror");
   }

    public static void seatbelt(){
        System.out.println("Puting on seatbelts");

    }

    public static void drive(){
        System.out.println("Putting in the drive");
        System.out.println("Drive");
    }
public static void late(){
       unlock();
       openDoor();
       sitAndStart();
       drive();
}



    public static void main(String[] args) {

       unlock();
       openDoor();
       sitAndStart();
       checkMirror();
       seatbelt();
       drive();

        System.out.println("____________");
        late(); // will print just what we selected
    }
}
