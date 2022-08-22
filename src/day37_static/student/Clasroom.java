package day37_static.student;

import java.util.Arrays;

public class Clasroom {
    public static void main(String[] args) {
        CydeoStudent.schoolInfo();

        CydeoStudent mayila = new CydeoStudent("Mayila", " Toronto", 2);
        System.out.println(mayila);
        System.out.println(Arrays.toString(mayila.instructors));
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.instructors[1].charAt(3));

        System.out.println(mayila.myCoffee.amountLeft);
        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);
        CydeoStudent aili = new CydeoStudent("Aili", "Ottava", 1);
        System.out.println(aili.myCoffee.amountLeft);
        aili.drink();
        aili.drink();
        aili.drink();
        System.out.println("aili left: " + aili.myCoffee.amountLeft);
        System.out.println("mayila left: " + mayila.myCoffee.amountLeft);
    }
}
