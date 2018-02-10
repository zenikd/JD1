package carsAV;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import excel.language.Language;

public class Save implements IExecutor {
	private List<User> listUser;

	public Save(List<User> listUser) {
		this.listUser = listUser;
	}

	public void execute() {
		String fileName = "DocumentLis.dat";

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(listUser);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
