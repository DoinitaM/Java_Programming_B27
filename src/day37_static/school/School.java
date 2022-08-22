package day37_static.school;

public class School {
    public int lunchTime;
    public static int district;
    public static int totalTeachers;
    public static int totalStudents;

    public static void annoncement(){
        System.out.println("Annoncement to whole district");
    }

    public void lunch(){
        System.out.println("Lunch is at " + lunchTime);
    }
}
