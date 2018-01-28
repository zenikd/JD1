package excel.panel.startPanel.function.openDocument.function;

import java.util.List;

import excel.document.Cell;
import excel.document.Document;
import excel.document.StringCell;
import excel.document.functionWithAbstractListElement.ListFunction;

public class ElementDocumentGeter {
	public static StringCell getStringCellInDocument(Document currentDocument, String valueStringCell) {
		List<StringCell> listStringCell = currentDocument.getListStringCell();
		
		ListFunction<StringCell> listFunction = new ListFunction();

		StringCell foundStringCell = listFunction.foundInList(listStringCell, valueStringCell);

		if (foundStringCell != null) {
			return foundStringCell;
		}

		foundStringCell = new StringCell(valueStringCell);

		listStringCell.add(foundStringCell);

		return foundStringCell;
	}

	public static Cell getCellInStringCell(StringCell stringCell, String valueRowCell) {
		List<Cell> listCell = stringCell.getListCell();
		
		ListFunction<Cell> listFunction = new ListFunction();

		Cell foundCell = listFunction.foundInList(listCell, valueRowCell);

		if (foundCell != null) {
			return foundCell;
		}

		foundCell = new Cell(valueRowCell, "0");

		listCell.add(foundCell);

		return foundCell;
	}
	
	public static Cell getCellInDocument(Document currentDocument, String valueStringCell, String valueRowCell) {
		StringCell foundStringCell = getStringCellInDocument(currentDocument, valueStringCell);
		List<Cell> listCell = foundStringCell.getListCell();
		
		Cell foundCell = getCellInStringCell(foundStringCell, valueRowCell);
		
		return foundCell;
	}
}

