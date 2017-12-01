package task8;

public class Task8 {
	public static void main(String[] args) {
		int s = 1; int i=1;
		do{
		 s *= i;
		 i++;
		}while(i < 5 && i > 0);
		System.out.println("s=" + s + " i=" + i);
	}
}
