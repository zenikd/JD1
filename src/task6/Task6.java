package task6;

public class Task6 {
	public static void main(String[] args) {
		int day = 30;
		int month = 3;
		int year = 2000;
		
		day++;
		
		if(day > 30) {
			month++;
		}
		
		if(month > 12) {
			year++;
		}
		
		System.out.println(String.format("%s.%s.%s", day%30 , month%12 , year));
	}
}
