package carsAV;

import java.util.List;
import java.util.Scanner;

public class Login implements IExecutor {
	List<User> listUser;

	public Login(List<User> listUser) {
		this.listUser = listUser;

	}

	public void execute() {
		Scanner in = new Scanner(System.in);
		System.out.println("Write your login");
		String loginUser = in.nextLine();

		User foundUser = null;

		for (User user : listUser) {
			if (user.getLogin().equals(loginUser)) {
				foundUser = user;
			}
		}

		System.out.println("Write your passowrd");
		String passowdUser = in.nextLine();

		if (foundUser != null && foundUser.getPassowrd().equals(passowdUser)) {
			System.out.println("You login successful");
			UserPanel userPanel = new UserPanel();
			userPanel.start(foundUser, listUser);
			return;
		}
		throw new RuntimeException("Login or passord are incorrect");

	}

}
