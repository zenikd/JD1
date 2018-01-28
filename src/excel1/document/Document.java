package excel.document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import excel.document.functionWithAbstractListElement.ListFunction;
import excel.document.propertiesDocument.SupportParamRowCell;

public class Document extends AbstractListElement implements Serializable {
	private String nameDocument;
	List<StringCell> listStringCell = new ArrayList();

	public Document(String nameDocument) {
		this.nameDocument = nameDocument;
	}

	public String getName() {
		return nameDocument;
	}

	
	

	
	public List<StringCell> getListStringCell(){
		return listStringCell;
	}

}
