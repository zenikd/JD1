package task10;

public class Task10 {
	public static void main(String[] args) {
		int a = 1223;
		int sum = 0;
		for(int i = 10; i <= a * 10; i*=10) {
			sum += (a%i -a%(i/10))*10/i; 
		}
		
		System.out.println(sum);
	}
}
