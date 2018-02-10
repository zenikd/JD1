package carsAV;
import java.util.List;

import carsAV.car.Car;

public class NewCar implements IExecutor{
	List<Car> listCar;
	public NewCar(List<Car> listCar) {
		this.listCar = listCar;
	}

	@Override
	public void execute() {
		Car car = new Car();
		
		String brand = GeterBrand.getBrand();
		car.setBrand(brand);
		
		car.setModel(GeterModel.getModel(brand));
		
		System.out.println("Wrtite price car");
		car.setPrice(GeterPrice.getPrice());
				
		car.setYear(GeterYear.getYear());
		
		car.setTitle(GeterTytle.getTytle());
		
		System.out.println("You have successfully created announcement ");
		listCar.add(car);
	}

}
