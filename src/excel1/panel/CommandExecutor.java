package excel.panel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandExecutor {
	public static void execute(Map<String, IExecute> mapCommand) {
		boolean foundComand;

		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("Write key command");
			String keyCommand = in.nextLine();
			

			foundComand = false;

			try {

				for (Map.Entry entry : mapCommand.entrySet()) {
					if (keyCommand.equals(entry.getKey())) {
						IExecute command = (IExecute) entry.getValue();
						command.execute();
						foundComand = true;
						break;
					}
				}
			} catch (RuntimeException e) {
				return;
			}

			if (!foundComand)
				System.out.println("You have entered the missing command");
		}
	}

}
