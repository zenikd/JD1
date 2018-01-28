package excel.panel.startPanel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import excel.document.Document;
import excel.panel.CommandExecutor;
import excel.panel.IExecute;
import excel.panel.startPanel.function.closePanel.ClosePanel;
import excel.panel.startPanel.function.createDocument.CreateDocument;
import excel.panel.startPanel.function.deleteDocument.DeleteDocument;
import excel.panel.startPanel.function.loadListDocument.LoadListDocument;
import excel.panel.startPanel.function.saveFile.SaveFile;
import excel.panel.startPanel.function.showAccessCommand.ShowAccesCommand;
import excel.panel.startPanel.function.openDocument.OpenPanel;

public class StartPanel {
	private static List<Document> listDocument = new LinkedList();
	private static Map<String, IExecute> mapCommand = new HashMap<String, IExecute>();

	
	public static void start() {		
		listDocument = LoadListDocument.getList();
		mapCommand.put("-h", new ShowAccesCommand());
		mapCommand.put("-create", new CreateDocument(listDocument));
		mapCommand.put("-delete", new DeleteDocument(listDocument));
		mapCommand.put("-save", new SaveFile(listDocument));
		mapCommand.put("-end", new ClosePanel());
		mapCommand.put("-open", new OpenPanel(listDocument));
		new ShowAccesCommand().execute();
		
		
		
		
		CommandExecutor.execute(mapCommand);

	}

}
