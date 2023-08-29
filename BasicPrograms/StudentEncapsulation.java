import java.util.*;

class Student {
    private int studid;
    private String name;
    private String place;
    private List<Double> grades = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String newplace) {
        this.place = newplace;
    }

    public int getstudid() {
        return studid;
    }

    public void setstudid(int newstudid) {
        this.studid = newstudid;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrades(double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade! Grade should be between 0 and 100.");
        }
    }
}

public class StudentEncapsulation {
    Scanner scan = new Scanner(System.in);
    Student stud = new Student();

    void setnewname() {
        System.out.print("Enter Name: ");
        String newname = scan.nextLine();
        stud.setName(newname);
        System.out.println("Name Set Successfully");
    }

    void setnewid() {
        System.out.print("Enter Student ID: ");
        int newid = scan.nextInt();
        scan.nextLine();
        stud.setstudid(newid);
        System.out.println("Student ID Set Successfully");
    }

    void setnewplace() {
        System.out.print("Enter Place: ");
        String newplace = scan.nextLine();
        stud.setPlace(newplace);
        System.out.println("Place Set Successfully");
    }

    void addgrades() {
        System.out.print("Enter Grades Size: ");
        int size = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("Grade " + (i + 1) + " : ");
            double grade = scan.nextDouble();
            scan.nextLine();
            stud.addGrades(grade);
        }
        System.out.println("Grades Set Successfully");
    }

    void getnewgrades() {
        System.out.println("Grades: " + stud.getGrades());
    }

    void display() {
        System.out.println("Name: " + stud.getName());
        System.out.println("Student ID: " + stud.getstudid());
        System.out.println("Place: " + stud.getPlace());
        System.out.println("Grades: " + stud.getGrades());
    }

    public static void main(String[] args) {
        StudentEncapsulation studentEncaps = new StudentEncapsulation();
        int choice = 0;
        while (choice != 7) {
            System.out.print("\nDo you want to \n1. Set Name \n2. Set Student ID \n3. Set Place \n4. Add Grades \n5. Display Grade \n6. Get Full Information \n7. Exit \nEnter your choice: ");
            choice = studentEncaps.scan.nextInt();
            studentEncaps.scan.nextLine();
            switch (choice) {
                case 1:
                    studentEncaps.setnewname();
                    break;
                case 2:
                    studentEncaps.setnewid();
                    break;
                case 3:
                    studentEncaps.setnewplace();
                    break;
                case 4:
                    studentEncaps.addgrades();
                    break;
                case 5:
                    studentEncaps.getnewgrades();
                    break;
                case 6:
                    studentEncaps.display();
                    break;
                default:
                    System.out.println("Exiting...");
            }
        }
    }
}
