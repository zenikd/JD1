package carsAV;

import java.util.Scanner;

import carsAV.car.poroperties.SupportAudiModel;
import carsAV.car.poroperties.SupportBMV_Model;
import carsAV.car.poroperties.SupportBrand;

public class GeterModel {
	public static String getModel(String brand) {
		if(SupportBrand.values()[0].name().equals(brand)) {
			return getBMV_Model();
		} else if(SupportBrand.values()[1].name().equals(brand)) {
			return getAudiModel();
		}
		throw new RuntimeException("Brand mistake");
			
	}

	private static String getBMV_Model() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Support model is");

		for (int i = 0; i < SupportBMV_Model.values().length; i++) {
			System.out.println(SupportBMV_Model.values()[i].name());

		}
		System.out.println("Write model");
		
		String userModel = in.nextLine();

		String brand = null;

		for (int i = 0; i < SupportBMV_Model.values().length; i++) {
			if (SupportBMV_Model.values()[i].name().equals(userModel)) {
				brand = userModel;
				break;
			}
		}

		if (brand != null) {
			return brand;
		} else {
			System.out.println("This model isn't support");
			return getBMV_Model();
		}
	}
	
	private static String getAudiModel() {
		Scanner in = new Scanner(System.in);		
		System.out.println("Support model is");

		for (int i = 0; i < SupportAudiModel.values().length; i++) {
			System.out.println(SupportAudiModel.values()[i].name());

		}
		System.out.println("Write model");
		
		String userModel = in.nextLine();

		String brand = null;

		for (int i = 0; i < SupportAudiModel.values().length; i++) {
			if (SupportAudiModel.values()[i].name().equals(userModel)) {
				brand = userModel;
				break;
			}
		}

		if (brand != null) {
			return brand;
		} else {
			System.out.println("This model isn't support");
			return getBMV_Model();
		}
	}
	
	
}