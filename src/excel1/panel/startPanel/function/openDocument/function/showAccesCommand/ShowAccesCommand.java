package excel.panel.startPanel.function.openDocument.function.showAccesCommand;

import excel.language.Language;
import excel.panel.IExecute;

public class ShowAccesCommand implements IExecute {

	@Override
	public void execute() {
		Language.showMessage("openPanel1");
		Language.showMessage("openPanel2");
		Language.showMessage("openPanel3");

	}

}
