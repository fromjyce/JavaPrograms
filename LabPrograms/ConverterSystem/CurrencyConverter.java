package CurrencyConverter;

public class CurrencyConverter {
	public float DollarToRupee(float dollar) {
		return (float) (dollar*81.99);
	}
	public float EuroToRupee(float euro) {
		return (float) (euro*91.22);
	}
	public float YenToRupee(float yen) {
		return (float) (yen*0.58);
	}
	public float RupeeToDollar(float rupee) {
		return (float) (rupee*0.012);
	}
	public float RupeeToEuro(float rupee) {
		return (float) (rupee*0.011);
	}
	public float RupeeToYen(float rupee) {
		return (float) (rupee*1.73);
	}
}
