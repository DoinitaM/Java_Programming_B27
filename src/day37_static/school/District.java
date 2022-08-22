package day37_static.school;

public class District {
    public static void main(String[] args) {
        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;
        System.out.println(School.totalTeachers);//100-1=99
        System.out.println(School.district);//149
        System.out.println(School.totalStudents);//3000

        School.annoncement();
       // School.lunch();->not working
        //School.luch() luch() method is instance

        School middle = new School();
        middle.lunchTime = 12;
       // School.lunchTime; -> this is not working
        middle.lunch();

        middle.totalStudents = 5000;
        System.out.println(School.totalStudents);//5000
        System.out.println(School.totalTeachers);//99
    }


}
