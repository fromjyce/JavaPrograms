package Converter;
import java.util.*;
import CurrencyConverter.*;
import DistanceConverter.*;
import TimeConverter.*;
public class Converter {
	int convertertype, currencytype, distancetype, timetype;
	float meter, kilometer, mile, hour, minute, second, yen, euro, dollar, rupee;
	CurrencyConverter curcon = new CurrencyConverter();
	DistanceConverter distcon = new DistanceConverter();
	TimeConverter timcon = new TimeConverter();
	Scanner scan = new Scanner(System.in);
	void AskConverter() {
		System.out.print("What do you want to convert?\n1.Currency\n2.Distance\n3.Time\nEnter Your Choice (in number): ");
		convertertype = scan.nextInt();
		switch(convertertype) {
		case 1:
			CurrencyConverter();
			break;
		case 2:
			DistanceConverter();
			break;
		case 3:
			TimeConverter();
			break;
		default:
			System.out.println("Enter Valid Choice!!!");
			break;
		}
	}
	void CurrencyConverter() {
		System.out.print("What do you want to convert?\n1.Dollars to Rupees\n2.Rupees to Dollars\n3.Euros to Rupees\n4.Rupees to Euros\n5.Yen to Rupees\n6.Rupees to Yen\nEnter your Choice (in number): ");
		currencytype = scan.nextInt();
		switch(currencytype) {
		case 1:
			DoToRu();
			break;
		case 2:
			RuToDo();
			break;
		case 3:
			EuToRu();
			break;
		case 4:
			RuToEu();
			break;
		case 5:
			YeToRu();
			break;
		case 6:
			RuToYe();
			break;
		default:
			System.out.println("Enter Valid Choice!!!");
		}
	}
	void DoToRu() {
		System.out.print("Enter Dollars: ");
		dollar = scan.nextInt();
		rupee = curcon.DollarToRupee(dollar);
		System.out.println("Rupees: " + rupee);
		
	}
	void RuToDo() {
		System.out.print("Enter Rupees: ");
		rupee = scan.nextInt();
		dollar = curcon.RupeeToDollar(rupee);
		System.out.println("Dollars: " + dollar);
	}
	void EuToRu() {
		System.out.print("Enter Euros: ");
		euro = scan.nextInt();
		rupee = curcon.EuroToRupee(euro);
		System.out.println("Rupees: " + rupee);
	}
	void RuToEu() {
		System.out.print("Enter Rupees: ");
		rupee = scan.nextInt();
		euro = curcon.RupeeToEuro(rupee);
		System.out.println("Euros: " + euro);
	}
	void YeToRu() {
		System.out.print("Enter Yen: ");
		yen = scan.nextInt();
		rupee = curcon.YenToRupee(yen);
		System.out.println("Rupees: " + rupee);
	}
	void RuToYe() {
		System.out.print("Enter Rupees: ");
		rupee = scan.nextInt();
		yen= curcon.RupeeToYen(rupee);
		System.out.println("Yen: " + yen);
	}
	void DistanceConverter() {
		System.out.print("What do you want to convert?\n1.Meters to Kilometer\n2.Kilometer to Meters\n3.Miles to Kilometer\n4.Kilometers to Miles\nEnter your Choice (in number): ");
		distancetype = scan.nextInt();
		switch(distancetype) {
		case 1:
			MeToKm();
			break;
		case 2:
			KmToMe();
			break;
		case 3:
			MiToKm();
			break;
		case 4:
			KmToMi();
			break;
		default:
			System.out.println("Enter Valid Choice!!!");
		}
	}
	void MeToKm() {
		System.out.print("Enter Meters: ");
		meter = scan.nextInt();
		kilometer = distcon.MeterToKilometer(meter);
		System.out.println("Kilometer: " + kilometer);
	}
	void KmToMe() {
		System.out.print("Enter Kilometers: ");
		kilometer = scan.nextInt();
		meter = distcon.KilometerToMeter(kilometer);
		System.out.println("Meters: " + meter);
	}
	void MiToKm() {
		System.out.print("Enter Miles: ");
		mile = scan.nextInt();
		kilometer = distcon.MilesToKilometer(mile);
		System.out.println("Kilometer: " + kilometer);
	}
	void KmToMi() {
		System.out.print("Enter Kilometers: ");
		kilometer = scan.nextInt();
		mile = distcon.KilometerToMiles(kilometer);
		System.out.println("Kilometer: " + mile);
	}
	void TimeConverter() {
		System.out.print("What do you want to convert?\n1.Hours to Minutes\n2.Minutes to Hours\n3.Hours to Seconds\n4.Seconds to Hours\nEnter your Choice (in number): ");
		timetype = scan.nextInt();
		switch(timetype) {
		case 1:
			HoToMin();
			break;
		case 2:
			MinToHo();
			break;
		case 3:
			HoToSec();
			break;
		case 4:
			SecToHo();
			break;
		default:
			System.out.println("Enter Valid Choice!!!");
		}
	}
	void HoToMin() {
		System.out.print("Enter Hours: ");
		hour = scan.nextInt();
		minute = timcon.HoursToMinutes(hour);
		System.out.println("Minutes: " + minute);
	}
	void MinToHo() {
		System.out.print("Minutes: ");
		minute = scan.nextInt();
		hour = timcon.MinutesToHours(minute);
		System.out.println("Hours: " + hour);
	}
	void HoToSec() {
		System.out.print("Enter Hours: ");
		hour = scan.nextInt();
		second = timcon.HoursToSeconds(hour);
		System.out.println("Seconds: " + second);
	}
	void SecToHo() {
		System.out.print("Enter seconds: ");
		second = scan.nextInt();
		hour = timcon.SecondsToHours(second);
		System.out.println("Minutes: " + hour);
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Converter System!!!");
		Converter Con = new Converter();
		Con.AskConverter();
	}
}
