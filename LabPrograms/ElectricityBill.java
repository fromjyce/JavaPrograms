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
 static String Connectiontype() {
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the connection type (Commercial or Domestic): ");
     String ConType = scan.nextLine();
     return ConType;
 }
 static int ConsumerNo() {
     Scanner scan = new Scanner(System.in);
     System.out.print("\nEnter the Consumer Number: ");
     int ConNum = scan.nextInt();
     return ConNum;
 }
 static String ConsumerName() {
     Scanner scan = new Scanner(System.in);
     System.out.print("\nEnter the Consumer Name: " );
     String ConName = scan.nextLine();
     return ConName;
 }
 static int PreviousMonth() {
     Scanner scan = new Scanner (System.in);
     System.out.print("\nEnter the Units consumed in Previous Month: ");
     int PrevBill = scan.nextInt();
     return PrevBill;
 }
 static int CurrentMonth() {
     Scanner scan = new Scanner(System.in);
     System.out.print("\nEnter the Units consumed in Current Month: ");
     int CurrBill = scan.nextInt();
     return CurrBill;
 }
 static int UnitsConsumed(int prev, int curr) {
     return Math.abs(prev-curr);
 }
 static double CommercialCalc(int units) {
     if (units <= 100) {
         return units * 2;
     } else if (units <= 200) {
         return 100 * 2 + (units - 100) * 4.50;
     } else if (units <= 500) {
         return  100 * 2 + 100 * 4.50 + (units - 200) * 6;
     } else {
         return  100 * 2 + 100 * 4.50+ 300 * 6 + (units - 500) * 7;
 }
     return bill;
 }
 static double DomesticCalc(int units) {
     if (units <= 100) {
        return  units * 1;
     } else if (units <= 200) {
        return  100 * 1 + (units - 100) * 2.50;
     } else if (units <= 500) {
        return  100 * 1 + 100 * 2.50 + (units - 200) * 4;
     } else {
        return  100 * 1 + 100 * 2.50+ 300 * 4 + (units - 500) * 6;
 }
     return bill;
 }
 static void displayBill(int num, String name, String type, int prev, int curr, int units, double bill) {
     System.out.print("\n");
     System.out.println("Consumer Number : " + num);
     System.out.println("Consumer Name: " + name);
     System.out.println("Type of EB: " + type);
     System.out.println("Units Consumed in Previous Month: " + prev);
     System.out.println("Units Consumed in Current Month: " + curr);
     System.out.println("Total Units: " + units);
     System.out.println("Total Bill: " + bill);
 }
 public static void main(String[] args) {
     double totalbill = 0.0;
     System.out.print("Welcome to Electricity Bill Calculator!!\n");
     String ebtype = Connectiontype();
     int consumno = ConsumerNo();
     String consumname = ConsumerName();
     int prevbill = PreviousMonth();
     int currbill = CurrentMonth();
     int unicon = UnitsConsumed(prevbill,currbill);
     if (ebtype=="Commercial" || ebtype=="commercial" || ebtype=="COMMERCIAL") {
         totalbill = CommercialCalc(unicon);
     }
     else {
         totalbill = DomesticCalc(unicon);
     }
     displayBill(consumno,consumname,ebtype,prevbill,currbill,unicon,totalbill);
     
 }
}
