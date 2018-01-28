package excel.document;

import java.io.Serializable;
import java.util.Scanner;

import excel.document.parcer.ParcerFunction;

public class Cell extends AbstractListElement implements Serializable {
	String valueRowCell;
	
	String formula;

	public Cell(String valueRowCell, String formula) {
		this.valueRowCell = valueRowCell;
		this.formula = formula;
	}
	
	public String getName() {
		return valueRowCell;
	}
			
	public void setFormula(String formula) {
		this.formula = formula;
	} 
	
	public String getReadValue(Document currentVerisonDocument) {
		return ParcerFunction.getReadValue(formula, currentVerisonDocument);
	}
	
	public String getFormula() {
		return formula;
	}
}
