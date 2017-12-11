package task21;

public class Task21 {
	public static void main(String[] args) {
		String[] arrayString = {"hello ", "world ", "my ", "name "};
		StringBuffer strBuffer = new StringBuffer();
		String str = "";
		
		for (String string : arrayString) {
			strBuffer.append(string);	
		}
		
		for (String string : arrayString) {
			str += string;			
		}
		
		System.out.println(strBuffer);
	}
	
}
