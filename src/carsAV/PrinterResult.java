package carsAV;

import java.util.List;

import carsAV.car.Car;

public class PrinterResult {
	public static void Print(List<Car> listCar){
		int count = 1;
		
		for(Car car: listCar) {
			System.out.println(car.getTitle());
			if(count > 10) {
				break;
			}
			count++;
		}
	}
}
