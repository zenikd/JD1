package fuelling;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fuelling {

	public static void main(String[] args) {
		List<Fuel> listFuelInFueling = new ArrayList<>();
			
		listFuelInFueling.add(new Fuel(1000, TypeFuel.DT));
		listFuelInFueling.add(new Fuel(1000, TypeFuel.AI_92));
		listFuelInFueling.add(new Fuel(1000, TypeFuel.AI_95));
		
		int countFuellingColumn = 5;
		
		for(int i=0; i< countFuellingColumn; i++) {
			Random rand = new Random();
			int needFuel = rand.nextInt(20) + 1;
			TypeFuel typeFuel = TypeFuel.values()[rand.nextInt(3)];
			new FuellingColumn(listFuelInFueling, needFuel, typeFuel);
		}
	}
}
