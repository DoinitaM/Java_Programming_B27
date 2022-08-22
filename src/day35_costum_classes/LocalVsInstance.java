package day35_costum_classes;

public class LocalVsInstance {
    //a &b are instance variables
    int a = 5;
    int b = 10;
    public LocalVsInstance(int a, int z){ //a & z here are local variables
        a = a; //local a is used first, is prioritized, wich means here you are reassigning the local variable to itself. but that means here you are reassigning the local variable to itself, but that means the instance a did not change
        b = z;

    }
    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance(20, 50);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }


}
