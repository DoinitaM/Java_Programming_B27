package day29_methods;

public class VarArgEx {
    public static void main(String[] args) {
int[] a = {3, 4, 5, 9};
        printAll(a);
        System.out.println();
//dynamic(a) this works
dynamic(3, 4, 6, 7, 1);
dynamic("helo", "java", "monday");
    }

    public static void printAll(int [] nums){
        for(int each : nums){
            System.out.println(each + " ");
        }
    }

public static void dynamic(int ... nums){ // ... this is same as []
        for(int each : nums){
            System.out.println(each +" ");
        }
}
    public static void dynamic(String ... words) { // ... this is same as []
        for (String each : words){
            System.out.println(each + " ");
        }
    }
}
