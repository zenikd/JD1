package carsAV;

import java.util.HashMap;
import java.util.List;

import carsAV.car.Car;

public class UserPanel {
	private static HashMap<String, IExecutor> mapCommand = new HashMap<>();
	
	
	public static void start(User user, List<User> listUser) {
		PanelController panelController = new PanelController();
		
		List<Car> listCar = user.getListCar();
		
		mapCommand.put("-add", new NewCar(listCar));
		mapCommand.put("-h", new AccessCommandUser());
		mapCommand.put("-search", new Search(listUser));
		mapCommand.put("-logout", new Stop(panelController));
		mapCommand.put("-delete", new DeleterByTitle(user));
		
		panelController.ExecuteComand(mapCommand);
	}

}
