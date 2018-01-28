package excel;

import excel.language.Language;
import excel.panel.startPanel.StartPanel;

public class Excel {
	public static void main(String[] args) {
		Language.setLocale();
		StartPanel.start();
	}
}
