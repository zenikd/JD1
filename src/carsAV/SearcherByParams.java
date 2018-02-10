package carsAV;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import carsAV.car.Car;

public class SearcherByParams {
	public static List<Car> search(List<User> listUser, String model, int year, int priceMin, int priceMax) {
		Iterator iterator1 = listUser.iterator();

		List<Car> foundCar = new ArrayList();

		while (iterator1.hasNext()) {
			User user = (User) iterator1.next();

			List<Car> listCar = user.getListCar();

			for (Car car : listCar) {
				foundCar.add(car);
			}

		}

		Iterator iterator2 = foundCar.iterator();

		while (iterator2.hasNext()) {
			Car car = (Car) iterator2.next();

			if (!car.getModel().equals(model) || car.getYear() != year || car.getPrice() < priceMin
					|| car.getPrice() > priceMax) {
				iterator2.remove();
			}

		}

		return foundCar;
	}

}
