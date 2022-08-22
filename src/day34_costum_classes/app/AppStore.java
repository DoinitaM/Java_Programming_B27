package day34_costum_classes.app;

public class AppStore {
    public static void main(String[] args) {

       App instagram = new App();

       instagram.name = "Instagram";
       instagram.version = 12.1;
       instagram.isFree = true;
       instagram.ratings = 4;

       instagram.update();//calling the instance method by the project/reference


        System.out.println(instagram.name);//instagram
        System.out.println(instagram.version);//12.2 because is uppdate by 0.1
        System.out.println(instagram.isFree);//true
        System.out.println(instagram.ratings);//4

        System.out.println("------------------");
        System.out.println(instagram);//noe that we wrote the toString we can print the objects
        System.out.println(instagram.toString());//it's already called thet why is grey

    }
}
