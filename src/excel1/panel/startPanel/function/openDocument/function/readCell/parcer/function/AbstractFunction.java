package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import excel.document.Document;
import excel.document.StringCell;
import excel.document.propertiesDocument.SupportParamRowCell;
import excel.panel.startPanel.function.openDocument.CellWorker;
import excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import excel.panel.startPanel.function.openDocument.function.readCell.ReadCell;

public class AbstractFunction {
	protected static List<String> getInternalStringCells(String formula) {
		Pattern pattern = Pattern.compile("[A-Z][0-9]{1,3}");
		Matcher matcher = pattern.matcher(formula);

		List<String> listInternalStringCell = new ArrayList<>();

		while (matcher.find()) {
			String internalStringCell_S = matcher.group().replaceAll("[A-Z]", "");
			int internalStringCell_I = Integer.parseInt(internalStringCell_S);
			listInternalStringCell.add(matcher.group().replaceAll("[A-Z]", ""));

		}
		return listInternalStringCell;
	}

	protected static List<String> getInternalRowCells(String formula) {
		Pattern pattern = Pattern.compile("[A-Z][0-9]{1,3}");
		Matcher matcher = pattern.matcher(formula);

		List<String> listInternalStringCell = new ArrayList<>();

		while (matcher.find()) {

			listInternalStringCell.add(matcher.group().replaceAll("[0-9]", ""));

		}
		return listInternalStringCell;
	}

	

}
