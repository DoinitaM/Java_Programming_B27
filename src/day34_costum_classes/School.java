package day34_costum_classes;

public class School {

    public static void main(String[] args) {

    Student studentOne = new Student();
        System.out.println(studentOne);//print the object we will get some #tag
        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.99;

        System.out.println(studentOne);//this is still show some #tag, nothing useful

        System.out.println(studentOne.name);
        System.out.println( studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);

        //call the instance method:
        studentOne.study();//Olena is Studying
//this will work if the method is static

        System.out.println("------------------------");

        Student studentTwo = new Student();
        System.out.println(studentTwo.name);//null
        System.out.println( studentTwo.batchNumber);//0
        System.out.println(studentTwo.program);//null
        System.out.println(studentTwo.grade);//0.0

         studentTwo.study(); //null is Studying
        /*
        in this case we created a new object of the student class
        it means this object was a fresh copy of the instance variables, wich means they will have their default values
         */





    }
}
