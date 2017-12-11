package repositoriJD1.src.task21.copy;

import java.util.Date;

public class Task21 {
	public static void main(String[] args) {
		String[] arrayString = {"hello ", "world ", "my ", "name "};
		StringBuffer strBuffer = new StringBuffer();
		String str = "";
		
		Date date = new Date();

		long millis = date.getTime();

		int time1 = date.getDate();
		
		for (String string : arrayString) {
			strBuffer.append(string);	
		}
		
		int time2 = date.getDate();
		
		for (String string : arrayString) {
			str += string;			
		}
		
		int time3 = date.getDate();			
				
		System.out.println(time3 - time2);
	}
	
}
