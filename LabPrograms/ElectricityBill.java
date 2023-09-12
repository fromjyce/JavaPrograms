/*Develop a Java application to generate Electricity bill. 
Create a class with the following members: Consumer no., consumer name, previous month reading, current month reading, type of EB connection (i.e domestic or commercial). 
Compute the bill amount using the following tariff. 
If the type of the EB connection is domestic, calculate the amount to be paid as follows: 
    • First 100 units - Rs. 1 per unit 
    • 101-200 units - Rs. 2.50 per unit 
    • 201 -500 units - Rs. 4 per unit 
    • 501 units - Rs. 6 per unit 
If the type of the EB connection is commercial, calculate the amount to be paid as follows: 
    • First 100 units - Rs. 2 per unit 
    • 101-200 units - Rs. 4.50 per unit 
    • 201 -500 units - Rs. 6 per unit 
    • 501 units - Rs. 7 per unit */
import java.util.Scanner;
public class ElectricityBill {
	String ebtype;
    int consumno;
    String consumname;
    int prevbill;
    int currbill;
    int units;
    double totalbill;
    Scanner scan = new Scanner(System.in);
    String Connectiontype() {
     System.out.print("Enter the connection type (Commercial or Domestic): ");
     String ConType = scan.nextLine();
     return ConType;
 }
    int ConsumerNo() {
     System.out.print("\nEnter the Consumer Number: ");
     int ConNum = scan.nextInt();
     return ConNum;
    }
    
	String ConsumerName() {
     System.out.print("\nEnter the Consumer Name: " );
     String ConName = scan.nextLine();
     return ConName;
 }
	int PreviousMonth() {
     System.out.print("\nEnter the Units consumed in Previous Month: ");
     int PrevBill = scan.nextInt();
     return PrevBill;
 }
	int CurrentMonth() {
     System.out.print("\nEnter the Units consumed in Current Month: ");
     int CurrBill = scan.nextInt();
     return CurrBill;
 }
	int UnitsConsumed() {
     return Math.abs(prevbill-currbill);
 }
	double CommercialCalc() {
     if (units <= 100) {
         return units * 2;
     } else if (units <= 200) {
         return 100 * 2 + (units - 100) * 4.50;
     } else if (units <= 500) {
         return  100 * 2 + 100 * 4.50 + (units - 200) * 6;
     } else {
         return  100 * 2 + 100 * 4.50+ 300 * 6 + (units - 500) * 7;
 }
 }
	double DomesticCalc() {
     if (units <= 100) {
        return  units * 1;
     } else if (units <= 200) {
        return  100 * 1 + (units - 100) * 2.50;
     } else if (units <= 500) {
        return  100 * 1 + 100 * 2.50 + (units - 200) * 4;
     } else {
        return  100 * 1 + 100 * 2.50+ 300 * 4 + (units - 500) * 6;
 }
 }
	void displayBill() {
     System.out.print("\n");
     System.out.println("Consumer Number : " + consumno);
     System.out.println("Consumer Name: " + consumname);
     System.out.println("Type of EB: " + ebtype);
     System.out.println("Units Consumed in Previous Month: " + prevbill);
     System.out.println("Units Consumed in Current Month: " + currbill);
     System.out.println("Total Units: " + units);
     System.out.println("Total Bill: " + totalbill);
 }
 public static void main(String[] args) {
     System.out.print("Welcome to Electricity Bill Calculator!!\n");
     ElectricityBill eb = new ElectricityBill();
     eb.ebtype = eb.Connectiontype();
     eb.consumno = eb.ConsumerNo();
     eb.consumname = eb.ConsumerName();
     eb.prevbill = eb.PreviousMonth();
     eb.currbill = eb.CurrentMonth();
     eb.units = eb.UnitsConsumed();
     if (eb.ebtype=="Commercial" || eb.ebtype=="commercial" || eb.ebtype=="COMMERCIAL") {
         eb.totalbill = eb.CommercialCalc();
     }
     else {
         eb.totalbill = eb.DomesticCalc();
     }
     eb.displayBill();
     
 }
}
