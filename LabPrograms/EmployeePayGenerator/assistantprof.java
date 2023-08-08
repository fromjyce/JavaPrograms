package Employee;

public class assistantprof extends employee{
    private double bPay;
    private String des;

    public assistantprof(String name, String id, String address, String mail, String mobile, double pay, String designation) {
        super(name, id, address, mail, mobile);
        bPay = pay;
        des = designation;
    }
    @Override
    public void paySlip() {
        double DA = 0.97 * bPay;
        double HRA = 0.10 * bPay;
        double PF = 0.12 * bPay;
        double staffClubFund = 0.001 * bPay;
        double grossSalary = bPay + DA + HRA + staffClubFund;
        double netSalary = grossSalary - PF;
        System.out.println("Pay Slip for Assistant Professor - " + Emp_name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}