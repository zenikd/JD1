package carsAV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import excel.document.Document;

public class Load {
	public static List<User> getList() {
		String fileName = "DocumentLis.dat";
		List<User> listUser = new ArrayList<User>();
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			listUser = (ArrayList<User>) ois.readObject();
		} catch (Exception e) {

		}

		return listUser;

	}
}
