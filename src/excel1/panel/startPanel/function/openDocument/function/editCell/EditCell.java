package excel.panel.startPanel.function.openDocument.function.editCell;

import java.util.Scanner;

import excel.document.Cell;
import excel.document.Document;
import excel.language.Language;
import excel.panel.IExecute;
import excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import excel.panel.startPanel.function.openDocument.function.GeterParamCell;

public class EditCell implements IExecute {
	Document currentDocument;

	public EditCell(Document currentDocument) {
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

		Cell foundCell = ElementDocumentGeter.getCellInDocument(currentDocument, valueStringCell, valueRowCell);

		System.out.println(Language.getLocalString("currenFormula") + foundCell.getFormula());
		Language.showMessage("newFormula");
		
		Scanner in = new Scanner(System.in);
		foundCell.setFormula(in.nextLine());

	}
}
