package excel.panel.startPanel.function.deleteDocument;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import excel.document.Document;
import excel.language.Language;
import excel.panel.IExecute;

public class DeleteDocument implements IExecute {
	List<Document> listDocument;
	public DeleteDocument(List<Document> listDocument) {
		this.listDocument = listDocument;
	}
	
	public void execute() {
		Scanner in = new Scanner(System.in);
		Language.showMessage("nameDoc");
		String nameDocument = in.nextLine();

		Iterator<Document> iter = listDocument.iterator();
		while (iter.hasNext()) {
			Document doc = iter.next();
			if (doc.getName().equals(nameDocument)) {
				iter.remove();
				Language.showMessage("successfulDelete");
				return;
			}
		}
		try {
			throw new RuntimeException(Language.getLocalString("docIsn'tFound"));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}
	
}
