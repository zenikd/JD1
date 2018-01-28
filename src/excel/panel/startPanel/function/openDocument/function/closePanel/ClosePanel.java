package excel.panel.startPanel.function.openDocument.function.closePanel;


import excel.language.Language;
import excel.panel.IExecute;

public class ClosePanel implements IExecute {

	@Override
	public void execute() throws RuntimeException {
		throw new RuntimeException(Language.getLocalString("documentclosed"));
	}

}
