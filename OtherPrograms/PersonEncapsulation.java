/*Write a Java Program to create a class called "person" with private instance variables - name, age, country, provided public getter and setter methods to access and modify these variables */

import java.util.*;

class Person {
    private String name;
    private int age;
    private String country;
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCountry() {
        return country;
    }
    public void setName(String newname) {
        this.name = newname;
    }
    public void setAge(int newage) {
        this.age = newage;
    }
    public void setCountry(String newcountry) {
        this.country = newcountry;
    }

}
public class PersonEncapsulation {
    Scanner scan = new Scanner(System.in);
    Person person = new Person();
    void setnewname() {
        System.out.print("Enter Name: ");
        String newname = scan.nextLine();
        person.setName(newname);
        System.out.println("Name Set Successfully");
    }
    void getname() {
        System.out.println("Name: " + person.getName());
    }
    void setnewage() {
        System.out.print("Enter Age: ");
        int newage = scan.nextInt();
        scan.nextLine();
        person.setAge(newage);
        System.out.println("Age Set Successfully");
    }
    void getage() {
        System.out.println("Age: " + person.getAge());
    }
    void setnewcountry() {
        System.out.print("Enter Country: ");
        String newcountry = scan.nextLine();
        person.setCountry(newcountry);
        System.out.println("Country Set Successfully");
    }
    void getcountry() {
        System.out.println("Country: " + person.getCountry());
    }
    public static void main(String[] args) {
        PersonEncapsulation personencaps = new PersonEncapsulation();
        System.out.println("WELCOME TO ENCAPSULATION!!");
        int choice = 0;
        while (choice!=7) {
            System.out.print("Do you want to \n1. Set Name \n2. Get Name \n3. Set Age \n4. Get Age \n5. Set Country \n6. Get Country \n7. Exit \nEnter your choice: ");
            choice = personencaps.scan.nextInt();
            personencaps.scan.nextLine();
            switch(choice) {
                case 1:
                    personencaps.setnewname();
                    break;
                case 2:
                    personencaps.getname();
                    break;
                case 3:
                    personencaps.setnewage();
                    break;
                case 4:
                    personencaps.getage();
                    break;
                case 5:
                    personencaps.setnewcountry();
                    break;
                case 6:
                    personencaps.getcountry();
                    break;
                default:
                    System.out.println("Exiting");
                    break;
            }
        }
    }
}
