package carsAV;

import java.util.Scanner;

import carsAV.car.poroperties.SupportBrand;

public class GeterBrand {
	public static String getBrand() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Support brand is");

		for (int i = 0; i < SupportBrand.values().length; i++) {
			System.out.println(SupportBrand.values()[i].name());

		}
		System.out.println("Write brand");
		
		String userBrand = in.nextLine();

		String brand = null;

		for (int i = 0; i < SupportBrand.values().length; i++) {
			if (SupportBrand.values()[i].name().equals(userBrand)) {
				brand = userBrand;
				break;
			}
		}

		if (brand != null) {
			return brand;
		} else {
			System.out.println("This brand isn't support");
			return getBrand();
		}
	}
}