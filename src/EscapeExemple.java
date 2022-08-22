public class EscapeExemple {


 public static void main(String[]args){
   //  System.out.println("Today is "Friday""); this is not valid because it things the double quotation is for java syntax, but we want to print the character of double quotation

     System.out.println("\"here\"");
     System.out.println("Today is \"Friday\"");

//I want to print a \
     System.out.println("\\"); // first \ is syntax, the second \is the caracter we wanted to print
     // tabbing here
     System.out.println("\tHello");
     System.out.println("\t\tHello");
     System.out.println("Shopping list:\n1)Juise\n2)Chips\n3)Water");


     System.out.println();

     System.out.println("Shopping list:\n\t1)juise\n\t2)chips\n\t3)water");


        }


}
