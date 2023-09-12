package TimeConverter;

public class TimeConverter {
	public float HoursToMinutes(float hours) {
		return hours*60;
	}
	public float HoursToSeconds(float hours) {
		return hours*3600;
	}
	public float SecondsToHours(float seconds) {
		return seconds/3600;
	}
	public float MinutesToHours(float minutes) {
		return minutes/60;
	}
}
