package excel.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ListCellRenderer;

import excel.document.functionWithAbstractListElement.ListFunction;

public class StringCell extends AbstractListElement implements Serializable {
	private List<Cell> listCell = new ArrayList();
	private String valueStringCell;

	public StringCell(String valueStringCell) {
		this.valueStringCell = valueStringCell;
	}

	public String getName() {
		return valueStringCell;
	}

	public List<Cell> getListCell() {
		return listCell;
	}
}
