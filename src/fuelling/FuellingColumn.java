package fuelling;

import java.util.List;
import java.util.Random;

public class FuellingColumn extends Thread {
	private List<Fuel> listFuelInFueling;
	private int needFuel;
	private TypeFuel typeFuel;

	public FuellingColumn(List<Fuel> listFuelInFueling, int needFuel, TypeFuel typeFuel) {
		this.listFuelInFueling = listFuelInFueling;
		this.needFuel = needFuel;
		this.typeFuel = typeFuel;
		run();
	}

	public void run() {
		int curentFuel = 0;

		Fuel usedTank = null;
		;

		for (Fuel fuel : listFuelInFueling) {
			if (fuel.getTypeFuel().equals(typeFuel)) {
				usedTank = fuel;
				break;
			}
		}

		if (usedTank.getPerspectiveVolumeFuel() < needFuel) {

			curentFuel = needFuel + 1;

		}

		if (curentFuel < needFuel) {
			usedTank.setPerspectiveVolumeFuel(needFuel);
		}

		while (curentFuel <= needFuel) {
			usedTank.decrement();

			curentFuel++;

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		System.out.println(
				String.format("The car filled up with %s to %s liters", usedTank.getTypeFuel().name(), needFuel));

		if (!isAllEmptyTank()) {
			Random rand = new Random();
			int needFuel = rand.nextInt(20) + 1;
			TypeFuel typeFuel = TypeFuel.values()[rand.nextInt(3)];
			new FuellingColumn(listFuelInFueling, needFuel, typeFuel);
		}

	}

	private boolean isAllEmptyTank() {
		boolean allTankEmpty = true;

		for (Fuel fuel : listFuelInFueling) {
			if (fuel.getPerspectiveVolumeFuel() > 0) {
				allTankEmpty = false;
				return allTankEmpty;
			}
		}

		return allTankEmpty;
	}

}
