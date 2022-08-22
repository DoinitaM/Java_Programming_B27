package day34_costum_classes.app;

public class App {

    String name;
    double version;
    boolean isFree;
    int ratings;


    public void update(){
        System.out.println(name + " is uppdating");
        version +=0.1;

    }

public String toString(){
        return "Name: " + name +"\nVersion: " + version+"\nisFree: " + isFree + "\nRating: " +ratings;

}


}
