package excel.panel.startPanel.function.openDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import excel.document.Document;
import excel.document.functionWithAbstractListElement.ListFunction;
import excel.language.Language;
import excel.panel.CommandExecutor;
import excel.panel.IExecute;
import excel.panel.startPanel.function.closePanel.ClosePanel;
import excel.panel.startPanel.function.openDocument.function.editCell.EditCell;
import excel.panel.startPanel.function.openDocument.function.readCell.ReadCell;
import excel.panel.startPanel.function.openDocument.function.showAccesCommand.ShowAccesCommand;

public class OpenPanel implements IExecute {
	private List<Document> listDocument = new ArrayList();
	private Document currentDocument = null;
	private boolean end = false;
	Map<String, IExecute> mapCommand = new HashMap<String, IExecute>();

	public OpenPanel(List<Document> listDocument) {
		this.listDocument = listDocument;

	}

	public void execute() {
		try {
		setCurrentDocument();}
		catch (RuntimeException e) {
			e.printStackTrace();
			return;
		}

		mapCommand.put("-h", new ShowAccesCommand());
		mapCommand.put("-edit", new EditCell(currentDocument));
		mapCommand.put("-read", new ReadCell(currentDocument));
		mapCommand.put("-close", new ClosePanel());

		new ShowAccesCommand().execute();

		CommandExecutor.execute(mapCommand);

	}

	private void setCurrentDocument() throws RuntimeException{
		ListFunction<Document> listFunction = new ListFunction<>();

		Language.showMessage("openPanNameDoc");

		Scanner in = new Scanner(System.in);
		currentDocument = listFunction.foundInList(listDocument, in.nextLine());

		if (currentDocument != null)
			return;

	
		throw new RuntimeException(Language.getLocalString("openPanDocNotFound"));
		
	}

}
