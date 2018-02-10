package carsAV;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import carsAV.IExecutor;

public class PanelController {
	private  boolean stop;

	public  void ExecuteComand(HashMap<String, IExecutor> mapCommand) {
		stop = false;
		while (!stop) {
			Scanner in = new Scanner(System.in);
			System.out.println("Write key command");
			String keyCommand = in.nextLine();	
			
			boolean foundCommand = false;

			try {
				for (Map.Entry entry : mapCommand.entrySet()) {
					if (keyCommand.equals(entry.getKey())) {
						foundCommand = true;
						IExecutor command = (IExecutor) entry.getValue();
						command.execute();							
						break;
					}					
				}
				
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
			
			if(!foundCommand) {
				System.out.println("You have entered the missing command");
			}

		}
	}

	public  void stop() {
		stop = true;
	}
	
	
}
