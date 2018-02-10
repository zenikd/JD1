package carsAV;

import java.util.List;

import carsAV.car.Car;

public class Search implements IExecutor {
	List<User> listUser;
	Boolean stop = false;

	public Search(List<User> listUser) {
		this.listUser = listUser;
	}

	@Override
	public void execute() {
		String brand = GeterBrand.getBrand();
		String model = GeterModel.getModel(brand);
		int year = GeterYear.getYear();
		
		System.out.println("Wrtite min price car");
		int priceMin = GeterPrice.getPrice();
		
		System.out.println("Wrtite max price car");
		int priceMax  = GeterPrice.getPrice();
		
		List<Car> listCar = SearcherByParams.search(listUser,model, year, priceMin, priceMax );
		
		PrinterResult.Print(listCar);
		
	}

}
