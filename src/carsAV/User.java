package carsAV;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import carsAV.car.Car;

public class User implements Serializable {
	private String login;
	private String passowrd;
	List<Car> listCar = new ArrayList<>();
	
	public User(String login, String password) {
		this.login = login;
		this.passowrd = password;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassowrd() {
		return passowrd;
	}
	
	public List<Car> getListCar() {
		return listCar;
	}
	
	

}
