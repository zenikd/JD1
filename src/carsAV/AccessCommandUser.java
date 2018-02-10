package carsAV;

import carsAV.IExecutor;

public class AccessCommandUser implements IExecutor{

	@Override
	public void execute() {
		System.out.println("'-serarch'  -search car");
		System.out.println("'-add'      -add new car");
		System.out.println("'-delete'   -delete car");		
		System.out.println("'-logout'   -logout ");
		System.out.println("'-h'       -show access command");
		
	}

}
