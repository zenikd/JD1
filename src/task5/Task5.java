package task5;

public class Task5 {
	public static void main(String[] args) {
		int money = 1231;
		if(money % 100 == 11 || money % 100 == 12 || money % 100 == 13 || money % 100 == 14) {
			System.out.println(money + " Рублей");
			return;
		}
		
		if(money % 10 == 1) {
			System.out.println(money + " Рубль");
			return;
		}
		
		if(money % 10 == 2 || money % 10 == 3 || money % 10 == 4) {
			System.out.println(money + " Рубля");
			return;
		}
		
		System.out.println(money + " Рублей");
		
		
	}
}
