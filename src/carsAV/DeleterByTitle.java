package carsAV;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import carsAV.User;
import carsAV.car.Car;

public class DeleterByTitle implements IExecutor {
	private User user;

	public DeleterByTitle(User user) {
		this.user = user;
	}

	@Override
	public void execute() {
		List<Car> listCar = user.getListCar();
		System.out.println("Your car is: ");
		for (Car car : listCar) {
			System.out.println(car.getTitle());
		}

		System.out.println("Write title car to remove");
		Scanner in = new Scanner(System.in);
		System.out.println("Write key command");
		String titleCar = in.nextLine();

		Iterator iterator = listCar.iterator();

		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();

			if (car.getTitle().equals(titleCar)) {
				iterator.remove();
				System.out.println("Delete car successful");
				return;
			}

		}
		throw new RuntimeException("The title not found");
	}

}
