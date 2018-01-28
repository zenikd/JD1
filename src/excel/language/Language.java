package excel.language;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Language {
	private static Locale loc;

	public static void setLocale() {
		System.out.println("Chose language");
		System.out.println("'-en'       -englis language");
		System.out.println("'-ru'       -русский язык(не поддерживется)");

		Scanner in = new Scanner(System.in);
		String language = in.nextLine();

		if (language.equals("-en")) {
			loc = new Locale("eu", "US");
		} else {
			System.out.println("This language isn't support");
			Language.setLocale();
		}
		
	}
	
	public static void showMessage(String string) {
		ResourceBundle rb = ResourceBundle.getBundle("messagesBundle", loc);
		System.out.println(rb.getString(string));
	}
	
	public static String getLocalString(String string) {
		ResourceBundle rb = ResourceBundle.getBundle("messagesBundle", loc);
		return rb.getString(string);
	}

}
