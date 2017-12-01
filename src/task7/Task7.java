package task7;

public class Task7 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 4;
		int d = 5;
		int e = 7;
		int f = 9;
		if((a + c < e && b + d < f) || (a + c < f && b + d < e) || (a + d < e && b + c < f) || (a + d < f && b + c < e)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
}
