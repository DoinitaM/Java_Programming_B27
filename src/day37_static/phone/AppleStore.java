package day37_static.phone;

import day37_static.phone.IPhone;

public class AppleStore {
    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("IPhone X", "Black", 1000, 256);
        System.out.println(iPhone1);
        System.out.println(IPhone.brand);
        System.out.println(IPhone.os);


        //we could use the object to access to static variables, but better to use the class name

        IPhone iPhone2 = new IPhone("IPhone 7",  "silver", 1000, 256);
        System.out.println(iPhone2);

    }
}
