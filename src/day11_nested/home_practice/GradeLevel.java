package day11_nested.home_practice;

public class GradeLevel {
    public static void main(String[] args) {
        /*Create a class called GradeLevel, Given a number grade level
determine and print which school type someone is in.
grade level and types are:
any number less than 1 or more than 18 is not valid
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School*/
        int grade = 11;
        String schoolType = " ";
        System.out.println("Enter a number grade level: "+grade);

        if (grade>=1 && grade<=18){

            if( grade <=5){
                schoolType = "Elementary school";
            }else if(grade <=8){
                schoolType = "Middle school";
            }else if(grade<=12){
                schoolType = "High school";
            }else if(grade<=16){
               schoolType = "College";
            }else {
                schoolType = "Grad school";
            }

        }else{
            schoolType = "Invalide grade/number";
        }
        System.out.println(schoolType);




    }
}
