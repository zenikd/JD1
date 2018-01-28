package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell;

import java.util.List;

import excel.document.Document;

public class ShareFunction extends TwoInternalCell {
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);

		double difference = listReadValue.get(0) / listReadValue.get(1);
		//int �� ������������ � Double, ������ � double
		Double difference1 = difference;
		return difference1.toString();
	}
}
