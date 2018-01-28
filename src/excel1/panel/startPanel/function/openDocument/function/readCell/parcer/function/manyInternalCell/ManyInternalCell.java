package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.ArrayList;
import java.util.List;

import excel.document.Document;
import excel.document.StringCell;
import excel.document.propertiesDocument.SupportParamRowCell;
import excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import excel.panel.startPanel.function.openDocument.function.readCell.ReadCell;
import excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class ManyInternalCell extends AbstractFunction {
	protected static List<Double> getListReadValue(Document currentDocument, String formula) {

		List<String> listInteranlStringCell = getInternalStringCells(formula);
		List<String> listInternakRowCell = getInternalRowCells(formula);

		List<StringCell> listStringCell = currentDocument.getListStringCell();

		// ???????????????????????????????
		SupportParamRowCell[] all = SupportParamRowCell.values();

		int startValueStringCell = Integer.parseInt(listInteranlStringCell.get(0));
		int finishValueStringCell = Integer.parseInt(listInteranlStringCell.get(1));

		int startValueRowStringCell = 0;
		int finishValueRowCell = 0;

		for (int i = 0; i < SupportParamRowCell.values().length; i++) {
			if (all[i].name().equals(listInternakRowCell.get(0))) {
				startValueRowStringCell = i;
			}

			if (all[i].name().equals(listInternakRowCell.get(1))) {
				finishValueRowCell = i;
			}
		}

		List<Double> listReadValue = new ArrayList();
		for (Integer s = startValueStringCell; s <= finishValueStringCell; s++) {
			String valueStringCell = s.toString();
			StringCell stringCell = ElementDocumentGeter.getStringCellInDocument(currentDocument, valueStringCell);
			for (int i = startValueRowStringCell; i <= finishValueRowCell; i++) {
				ReadCell readCell= new ReadCell(currentDocument);
				String readValue_S = readCell.getReadValueInStringCell(currentDocument, stringCell, all[i].name());
				Double readValue_D = Double.parseDouble(readValue_S);
				listReadValue.add(readValue_D);
			}
		}

		return listReadValue;
	}
}
