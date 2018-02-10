package carsAV;

import carsAV.IExecutor;
import carsAV.PanelController;

public class Stop implements IExecutor {
	PanelController panelController;

	public Stop(PanelController panelController) {
		this.panelController = panelController;
	}

	@Override
	public void execute() {
		panelController.stop();

	}

}
