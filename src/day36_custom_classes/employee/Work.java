package day36_custom_classes.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        Employee james = new Employee("James Bond", 7, "Spy", 10_000_000.00);
        james.goToMeeting();
        System.out.println(james);

   Employee obj2 = new Employee("Anna");
        System.out.println(obj2);

        Employee obj3 = new Employee("Janie", 9);
        System.out.println(obj3);

        Employee obj4 = new Employee("Panie", 9, "CEO");
        System.out.println(obj4);
        System.out.println("------------------------");
        EmployeeV2 s = new EmployeeV2("Anna", 2, "teacher");
        System.out.println(s);

        //for practice
        Employee[] arr = new Employee[3];
        arr [0] = james;
        arr [1] = obj2;
        arr [2] = obj3;
        System.out.println(Arrays.toString(arr));
        ArrayList<Employee> list = new ArrayList<>();
        System.out.println(list);

    }
    }


