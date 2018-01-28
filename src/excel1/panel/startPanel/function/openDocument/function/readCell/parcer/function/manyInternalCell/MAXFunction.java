package excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.List;

import excel.document.Document;
import excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class MAXFunction extends ManyInternalCell{
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		
		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);
		
		Double max = listReadValue.get(0);
		
		for(Double val: listReadValue) {
			if(max < val) {
				max = val;
			}
		}
				
		return max.toString();
	}
}
