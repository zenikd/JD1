package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell;

import java.util.ArrayList;
import java.util.List;

import excel.document.Document;
import excel.document.StringCell;
import excel.document.propertiesDocument.SupportParamRowCell;
import excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import excel.panel.startPanel.function.openDocument.function.readCell.ReadCell;
import excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class TwoInternalCell extends AbstractFunction {
	protected static List<Double> getListReadValue(Document currentDocument, String formula) {

		List<String> listInteranlStringCell = getInternalStringCells(formula);
		List<String> listInternakRowCell = getInternalRowCells(formula);

		List<StringCell> listStringCell = currentDocument.getListStringCell();

		// ???????????????????????????????
		SupportParamRowCell[] all = SupportParamRowCell.values();

		String firstValueStringCell = listInteranlStringCell.get(0);
		String secondhValueStringCell = listInteranlStringCell.get(1);

		String firstValueRowStringCell = listInternakRowCell.get(0);
		String secondValueRowCell = listInternakRowCell.get(1);

		ReadCell readCell = new ReadCell(currentDocument);
		String readValue_S1 = readCell.getReadValueInDocument(currentDocument, firstValueStringCell,
				firstValueRowStringCell);
		Double readValue_D1 = Double.parseDouble(readValue_S1);
		List<Double> listReadValue = new ArrayList();
		listReadValue.add(readValue_D1);

		String readValue_S2 = readCell.getReadValueInDocument(currentDocument, secondhValueStringCell,
				secondValueRowCell);
		Double readValue_D2 = Double.parseDouble(readValue_S2);

		listReadValue.add(readValue_D2);

		return listReadValue;
	}
}
