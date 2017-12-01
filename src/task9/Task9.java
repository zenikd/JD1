package task9;

import java.util.Random;

public class Task9 {
	public static void main(String[] args) {
		int[] mas = new int[10];
		
		int max = 0;
		Random rand = new Random();
		
		for (int i = 0; i <10; i++) {
			mas[i] =  rand.nextInt(10);
		}
		
		for(int i = 0; i < 10; i++) {
			if(max < mas[i]) {
				max = mas[i];
			}
		}
		
		System.out.println(max);
		
	}
}