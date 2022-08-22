package day27_methods;

public class Parameters {
    public static void greeting(String name){

        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }
    public static void age(int birthYear){
        System.out.println("You are  " +(2022-birthYear) + " years old");
    }

    public static void main(String[] args) {
        greeting("James"); // James is the argument , value of the name for method
        greeting("Joe");//Joe is the argument , value of the name for method
        age(1994);
        age(2000);
    }

}
