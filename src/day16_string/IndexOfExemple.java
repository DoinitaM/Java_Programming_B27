package day16_string;

public class IndexOfExemple {
    public static void main(String[] args) {

        String s = "lollipop";
        //          01234567
        System.out.println("index of l: " + s.indexOf('l'));//0
        System.out.println("Last index of l: " + s.lastIndexOf('l'));//3


        System.out.println("index of i: " + s.indexOf('i'));//4
        System.out.println("Last index of i: " + s.lastIndexOf('i'));//4

        System.out.println("index of p: " + s.indexOf('p'));
        System.out.println("Last index of p: " + s.lastIndexOf('p'));


        System.out.println("index of e: " + s.indexOf('e')); // results -1 because we dont have character e in the sentense
        System.out.println("index of P: " + s.indexOf('P'));// -1 // because we don't have upper P so it's different character
        System.out.println(s.lastIndexOf('I'));
        System.out.println();
        System.out.println("index if pop: " + s.indexOf("pop")); // gets 5 because the sequense "pop" starts at index 5
        System.out.println("index of Pop: " +s.indexOf("Pop"));//-1 because is uppercase


    }
}
