package day11_nested;

public class FieldTrip {
    public static void main(String[] args){

     int grade = 6;
    String location = " ";
    String teacher = " ";
     int numberOfGroups = 0;

     if(grade >0 && grade<=6){
         // valid grades
         if(grade ==1){
            location = " Apple Orchard";
            teacher = "Ms Smith";
            numberOfGroups = 5;
         }else if (grade ==2){
             location = " Zoo";
             teacher = "Ms Mond";
             numberOfGroups = 6;
         }else if (grade ==3){
             location = " Aquarium";
             teacher = "Ms Reyes";
             numberOfGroups = 2;
         }else if (grade ==4){
             location = " Museum";
             teacher = "Ms Wilson";
             numberOfGroups = 4;
         }else if (grade ==5){
             location = " Theater";
             teacher = "Ms Lee";
             numberOfGroups = 3;
         }else if (grade ==6) {
             location = " Six Flags ";
             teacher = "Ms Bond";
             numberOfGroups = 10;
         }
         System.out.println("Grades: " + grade);
         System.out.println("Location: " + location);
         System.out.println("Teacher: " + teacher);
         System.out.println("Number of group : " + numberOfGroups);

     }else{
         //invalid grades
         System.out.println("Invalid grade ");
     }






    }
}
