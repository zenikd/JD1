package excel.panel.startPanel.function.closePanel;

import excel.panel.IExecute;

public class ClosePanel implements IExecute {

	@Override
	public void execute() throws RuntimeException {
		throw new RuntimeException("Document closed");
	}

}
