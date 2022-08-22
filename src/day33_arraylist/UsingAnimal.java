package day33_arraylist;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal animal1 = new Animal();// creating an object of the Animal class
        animal1.species = "Lions";
        animal1.numberOfLengs = 4;
        animal1.age=15;
        animal1.canFly =false;
        animal1.weight = 200.00;
        System.out.println(animal1.species);
        System.out.println(animal1.numberOfLengs);
        System.out.println(animal1.age);
        System.out.println(animal1.canFly);
        System.out.println(animal1.weight);

        Animal animal2 = new Animal();
        System.out.println(animal2.species);//null
        System.out.println(animal2.numberOfLengs);//0
        System.out.println(animal2.canFly);//false
        System.out.println(animal2.weight);//0.0



    }

}
