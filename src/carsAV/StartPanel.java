package carsAV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StartPanel {

	public static void main(String[] args) {
		HashMap<String, IExecutor> mapCommand = new HashMap<>();

		List<User> listUser = Load.getList();
		PanelController panelController = new PanelController();

		mapCommand.put("-h", new ShowAccessCommand());
		mapCommand.put("-search", new Search(listUser));
		mapCommand.put("-register", new CreateNewUser(listUser));
		mapCommand.put("-login", new Login(listUser));
		mapCommand.put("-stop", new Stop(panelController));
		mapCommand.put("-save", new Save(listUser));

		panelController.ExecuteComand(mapCommand);

	}
}
