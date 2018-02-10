package carsAV;

import java.util.List;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

import carsAV.IExecutor;
import carsAV.user.User;

public class CreateNewUser implements IExecutor {
	private List<User> listUser;

	public CreateNewUser(List<User> listUser) {
		this.listUser = listUser;
	}

	@Override
	public void execute() {
		System.out.println("Write name new user");

		Scanner in = new Scanner(System.in);
		String loginNewUser = in.nextLine();

		for (User user : listUser) {
			if (user.getLogin().equals(loginNewUser)) {
				throw new RuntimeException("This name already use");
			}
		}

		System.out.println("Write passowrd new user");
		String passowrdNewUser = in.nextLine();

		User newUser = new User(loginNewUser, passowrdNewUser);

		listUser.add(newUser);
		System.out.println("You register successful");

	}

}
