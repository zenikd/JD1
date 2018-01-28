package excel.panel.startPanel.function.openDocument.function.readCell;

import excel.document.Cell;
import excel.document.Document;
import excel.document.StringCell;
import excel.panel.IExecute;
import excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import excel.panel.startPanel.function.openDocument.function.GeterParamCell;
import excel.panel.startPanel.function.openDocument.function.readCell.parcer.Parcer;

public class ReadCell implements IExecute{
	Document currentDocument;
	
	public ReadCell(Document currentDocument) {
		this.currentDocument = currentDocument;
	}

	public void execute() {
		String valueStringCell;
		String valueRowCell;

		try {
			valueRowCell = GeterParamCell.getValueRowCell();
			valueStringCell = GeterParamCell.getValueStringCell();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return;
		}

		String readValue = getReadValueInDocument(currentDocument, valueStringCell, valueRowCell);
		System.out.println("Read value is " + readValue);
	}

	public static String getReadValueInDocument(Document currentDocument, String valueStringCell, String valueRowCell) {
		StringCell stringCell = ElementDocumentGeter.getStringCellInDocument(currentDocument, valueStringCell);
		return getReadValueInStringCell(currentDocument, stringCell, valueRowCell);
	}

	public static String getReadValueInStringCell(Document currentDocument, StringCell stringCell,
			String valueRowCell) {
		Cell cell = ElementDocumentGeter.getCellInStringCell(stringCell, valueRowCell);

		return Parcer.getReadValue(cell.getFormula(), currentDocument);
	}

}