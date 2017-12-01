package task11;

public class Task11 {
	public static void main(String[] args) {
		int a = 7;
		int i;
		for(i = 2; i < a; i++) {
			if(a%i == 0) {
				break;
			}
		}
		if (i == a) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
