package excel.panel.startPanel.function.openDocument.function;

import java.util.Scanner;

import excel.document.propertiesDocument.SupportParamRowCell;
import excel.language.Language;

public class GeterParamCell {
	public static String getValueStringCell() throws RuntimeException {
		Scanner in = new Scanner(System.in);
		Language.showMessage("valStringCell");
		Integer valueStringCell = in.nextInt();

		if (isParamStringCellSupport(valueStringCell)) {
			return valueStringCell.toString();
			
		}
		throw new RuntimeException(Language.getLocalString("notSupportSC"));
	}

	public static String getValueRowCell() throws RuntimeException {
		Language.showMessage("valRowCell");

		Scanner ro = new Scanner(System.in);
		String valueRowCell = ro.nextLine();

		if (isParamRowCellSupport(valueRowCell)) {
			return valueRowCell;
		}
		throw new RuntimeException(Language.getLocalString("notSupportRC"));

	}

	public static boolean isParamRowCellSupport(String rowCell) {
		boolean suportValueRowCell = false;

		for (int i = 0; i < 26; i++) {
			if (SupportParamRowCell.values()[i].name().equals(rowCell)) {
				suportValueRowCell = true;
				break;
			}
		}

		if (suportValueRowCell) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isParamStringCellSupport(Integer stringCell) {
		if (stringCell < 1001 && stringCell > -1) {
			return true;
		} else {
			return false;
		}
	}
}
