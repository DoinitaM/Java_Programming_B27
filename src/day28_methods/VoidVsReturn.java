package day28_methods;

public class VoidVsReturn {

    public static void sayHello(){
        System.out.println("Hello");
    }

   public static String sayBye(){
        return "Bye"; // nothing will be printed, the return value was not used, so we dont see any diference
       //charAt(0)
      // System.out.println(sayBye());//methods returns string ,i'm printing a string
   }






    public static void main(String[] args) {
        sayHello();
        sayBye();
        System.out.println(sayBye());//will print the return
    }




}
