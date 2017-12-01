package task2;


public class Task2 {
	public static void main(String[] args) {
		int sec = 147820;
		int min, hour, day, week;
		week = sec / 3600 / 24 / 7;
		sec -= week * 3600 * 24 * 7;
		day = sec / 3600 / 24;
		sec -= day * 3600 * 24;
		hour = sec / 3600;
		sec -= hour * 3600;
		min = sec / 60;
		sec -= min * 60;

		System.out.println(week + " недель " + day + " деней " + hour + " часов " + min + " минут " + sec + " секунд");
	}
}