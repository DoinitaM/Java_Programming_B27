package day36_custom_classes.employee;

public class EmployeeV2 {
    String name;
    long id;
    String jobTitle;
    double salary;

    public EmployeeV2(String name) {
        this.name = name;
    }
    public EmployeeV2(String name, long id) {
        this(name);
        this.id = id;

    }

    public EmployeeV2(String name, long id, String jobTitle) {
        this(name, id);
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, long id, String jobTitle, double salary) {
        this(name, id, jobTitle);
        this.salary = salary;
    }


    @Override
    public String toString() {


    String output = "Name: " + name;
   if(id!=0){
       output += ", id: " + id;
   }

    if(jobTitle != null){
        output +=", job title: " + jobTitle;

    }
    return output;



    }

}
