package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell;

import java.util.List;

import excel.document.Document;

public class MultiplyFunction extends TwoInternalCell{
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);

		Double multiply = listReadValue.get(0)*listReadValue.get(1);
		return multiply.toString();
	}
}
