package day37_static.student;

import java.util.Arrays;

public class CydeoStudent {

    String name;
    String city;
    int group;
Coffee myCoffee; // -> it not an object just reference
   //static variables
    static int batchNumber;
    static String schoolName;
    static String [] instructors; // static means one copy belongs to class all objects share. String [] type
    static {
        batchNumber = 27;
        schoolName = "Cydeo";
        instructors = new String []{"Adam", "Asia", "Saim"};//createt a new String array and assigned into instructors reference
        /*
        instead of line 16:
        instructors = new String[3];
        instructors[0] = "Adam";
        instructors[1] = "Asia";
        instructors[2] = "Saim";

        //another alternative:
        instructors = ("Adam Asia Saim).split(" ");

         */

    }
public CydeoStudent(String name, String city, int group) { // this is contractor
    this.name = name;
    this.city = city;
    this.group = group;
    myCoffee = new Coffee(16);
}
public static void schoolInfo(){
    System.out.println(schoolName + "Batch " + batchNumber);
    System.out.println(" instructors: " + Arrays.toString(instructors));
}

public void drink(){
        myCoffee.amountLeft -=2;
}


    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
