package day11_nested;

public class AgeGroups {
    public static void main(String[] args) {
        /* age should be 0-120
        <1 baby
        2-5 toddler
        6-13 kid
        14-18 young adult
        19-30 adult
        31 -65 middle age adult
        > 65 senior
         */
        int age = -85;

        if(age>=0 && age <=120){

           if(age<=1) {
               System.out.println("baby");
           }else if(age>=2 && age<=5){ // if we put in corect order we can use only age<=5
               System.out.println("toddler");
           }else if( age<=13){
               System.out.println("kid");
           }else if( age<=18){
            System.out.println("young adult");
           }else if( age<=30){
               System.out.println("adult");
           }else if( age<=65){
               System.out.println("midle age adult");
           }else {
               System.out.println("senior");
           }

        }else {
            if (age < 0) {
                System.out.println(" Age can't be negative");
            }else{
                System.out.println("Age can't be more than 120");
            }
        }

    }
}
