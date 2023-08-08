import Employee.*;
import java.util.*;

public class EmployeePayGenerator {
    ArrayList<employee> employees = new ArrayList<>();
    String name, emp_id, address, emailid, number, des;
    double basicpay;
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeePayGenerator payG = new EmployeePayGenerator();
        payG.askdetails();
        payG.classifydes();
        for (employee employee : payG.employees) {
            employee.display();
            employee.paySlip();
        }
    }

    void askdetails() {
        System.out.println("Welcome to the Employee Pay Generator!");
        System.out.print("Enter Employee Name: ");
        name = scan.nextLine();
        System.out.print("Employee ID: ");
        emp_id = scan.nextLine();
        System.out.print("Enter Address: ");
        address = scan.nextLine();
        System.out.print("Enter Mail ID: ");
        emailid = scan.nextLine();
        System.out.print("Enter Phone Number: ");
        number = scan.nextLine();
        System.out.print("Enter Designation: ");
        des = scan.nextLine();
        System.out.print("Enter Basic Pay: ");
        basicpay = scan.nextDouble();
    }

    void classifydes() {
        if (des.equals("Programmer") ||des.equals("programmer") || des.equals("PROGRAMMER")) {
            desprogrammer();
        }
        else if (des.equals("Associate Professor") || des.equals("Associate professor") || des.equals("ASSOCIATE PROFESSOR") || des.equals("associate professor")) {
            desassociateprof();
        }
        else if (des.equals("Assistant Professor") || des.equals("Assistant professor") || des.equals("ASSISTANT PROFESSOR") || des.equals("assistant professor")) {
            desassistantprof();
        }
        else if (des.equals("Professor") || des.equals("professor") || des.equals("PROFESSOR")) {
            desprofessor();
        }
        else {
            System.out.println("Terminating due to invalid designation");
            System.exit(0);
        }
    }

    void desprogrammer() {
        programmer prog = new programmer(name,emp_id,address,emailid,number,basicpay,des);
        employees.add(prog);
    }
    void desassistantprof() {
        assistantprof asst = new assistantprof(name,emp_id,address,emailid,number,basicpay,des);
        employees.add(asst);
    }
    void desassociateprof() {
        associateprof asso = new associateprof(name,emp_id,address,emailid,number,basicpay,des);
        employees.add(asso);
    }
    void desprofessor() {
        professor prof = new professor(name,emp_id,address,emailid,number,basicpay,des);
        employees.add(prof);
    }
}

