package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MorePractice {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mutasem", "Baz", "Adam", "Tina", "Manizha", "Busra", "Reem", "Farzona", "Marjan"));
        ArrayList<String>bylength = new ArrayList<>(names);
        bylength.removeIf(name ->name.length() > 5);//keeping short names

        System.out.println(bylength);//[Baz, Adam, Tina, Busra, Reem]

        ArrayList<String>byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf(p->p.startsWith("M")||p.startsWith("B"));
        System.out.println(byFirstLetter);//[Adam, Tina, Reem, Farzona]

ArrayList<String> byLastLetter = new ArrayList<>(names);
byLastLetter.removeIf(str ->!str.endsWith("a"));
        System.out.println(byLastLetter);//[Tina, Manizha, Busra, Farzona]

        System.out.println("-----------------------------");

        System.out.println(names);

     //  for(String each:names){
    //       System.out.println(each);
    //   }

names.forEach(each-> System.out.println(each));// this is used to print every element like we did in comments upper

names.forEach(name -> System.out.println(name.charAt(0) + " "+ name.charAt(name.length()-1)));//wil print first and the last letter of the each name
    }
}
