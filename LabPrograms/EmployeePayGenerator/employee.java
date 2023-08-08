package Employee;

public class employee {
    protected String Emp_name;
    private String Emp_id;
    private String Address;
    private String Mail_id;
    private String Mobile_no;

    public employee(String name, String id, String address, String mail, String mobile) {
        Emp_name = name;
        Emp_id = id;
        Address = address;
        Mail_id = mail;
        Mobile_no = mobile;
    }

    public void display() {
        System.out.printf("Information of %s:", Emp_name);
        System.out.println("ID: " + Emp_id);
        System.out.println("Address: " + Address);
        System.out.println("Mail ID: " + Mail_id);
        System.out.println("Mobile No: " + Mobile_no);
    }

    public void paySlip() {
       System.out.println("Pay Slip for " + Emp_name );
       System.out.println("Gross Salary: nil");
       System.out.println("Net Salary: nil" );
    }
}
