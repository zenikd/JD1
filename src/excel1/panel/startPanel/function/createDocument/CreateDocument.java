package excel.panel.startPanel.function.createDocument;

import java.util.List;
import java.util.Scanner;

import excel.document.Document;
import excel.document.functionWithAbstractListElement.ListFunction;
import excel.language.Language;
import excel.panel.IExecute;

public class CreateDocument implements IExecute {
	List<Document> listDocument;
	public CreateDocument(List<Document> listDocument) {
		this.listDocument = listDocument;
	}
	
	@Override
	public void execute() {
		Scanner in = new Scanner(System.in);
		Language.showMessage("nameDoc");
		String nameDocument = in.nextLine();

		if (ListFunction.isInList(listDocument, nameDocument)) {
			try {
				throw new RuntimeException(Language.getLocalString("docAlreadyUse"));
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			return;
		}

		listDocument.add(new Document(nameDocument));
		Language.showMessage("successfulAddDoc");
		
	}

}
