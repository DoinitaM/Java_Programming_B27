package day35_costum_classes;

public class School {
    String name;
    int totalNUmOfStudents;
    double avgGpa;
// this keyword allows us to acces the instance variables, not the local variable

    public School(String name, int totalNUmOfStudents, double avgGpa){
        this.name = name;
        this.totalNUmOfStudents = totalNUmOfStudents;
        this.avgGpa =avgGpa;

   /* public School(String inputName, int inputStudents, double inputGpa){
        name = inputName;
        totalNUmOfStudents = inputStudents;
        avgGpa = inputGpa;
*/
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", totalNUmOfStudents=" + totalNUmOfStudents +
                ", avgGpa=" + avgGpa +
                '}';
    }
}
