package DistanceConverter;

public class DistanceConverter {
	public float MeterToKilometer(float meter) {
		return meter/1000;
	}
	public float MilesToKilometer(float miles) {
		return (float) (miles*1.609);
	}
	public float KilometerToMeter(float kilometer) {
		return kilometer*1000;
	}
	public float KilometerToMiles(float kilometer) {
		return (float) (kilometer/1.609);
	}
}
