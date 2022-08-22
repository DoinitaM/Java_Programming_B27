package day11_nested;

public class NestedExemple {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;


        if (a){
            System.out.println(1);
            if(b){
                System.out.println(2);
            }
        }
        /*
        when
        a = true             a = false       a = true
        b = true             b - true        b = false
        output: a ->1        no output       output : a -> 1
                b ->2
         */
    }
}
