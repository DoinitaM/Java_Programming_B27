package day37_static;

public class Executions {

    public static void main(String[] args) {
       new Executions();
        System.out.println(1);
        new Executions(); //will repeat the execution one more time ->2

    }
   public Executions(){
       System.out.println(2);
   }
    static { // this block will run first, whenever the class is loaded(used)
        System.out.println(3);
    }

}
