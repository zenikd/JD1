package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.List;

import excel.document.Cell;
import excel.document.Document;
import excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class SumFunction extends ManyInternalCell {
	
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		
		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);
		
		Double sum = 0d;
		
		for(Double val: listReadValue) {
			sum+=val;
		}
				
		return sum.toString();
	}

}
