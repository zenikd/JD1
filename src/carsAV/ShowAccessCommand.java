package carsAV;

import carsAV.IExecutor;

public class ShowAccessCommand implements IExecutor {

	@Override
	public void execute() {
		System.out.println("'-search'    -add new car");
		System.out.println("'-register'  -delete car");
		System.out.println("'-login'     -search car by params");
		System.out.println("'-save'      -search car by params");
		System.out.println("'-stop'      -save all update on server");
		System.out.println("'-h'         -show access command");
		
	}

}