/*Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role. */

abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private int salary;
    private String name;

    public Manager(int isalary, String iname) {
        this.salary = isalary;
        this.name = iname;
    }

    void calculateSalary() {
        salary += 1000;
        System.out.println("Manager Salary Calculated: "+ salary);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: Manager");
        System.out.println("Salary: " + salary);
    }

}

class Programmer extends Employee {
    private int salary;
    private String name;

    public Programmer(int isalary, String iname) {
        this.salary = isalary;
        this.name = iname;
    }

    void calculateSalary() {
        salary += 800;
        System.out.println("Programmer Salary Calculated: "+ salary);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: Programmer");
        System.out.println("Salary: " + salary);
    }

}


public class EmployeePayCal {
    public static void main(String[] args) {

        Employee man = new Manager(10000, "Jayashre");
        man.calculateSalary();
        man.displayInfo();
        Employee prog = new Programmer(750, "Jyce");
        prog.calculateSalary();
        prog.displayInfo();

    }
}
