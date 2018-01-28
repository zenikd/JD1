package fuelling;

public class Fuel {
	private int perspectiveVolumeFuel;
	private int realVolumeFuel;
	private TypeFuel typeFuel;

	public Fuel(int volumeFuel, TypeFuel typeFuel) {
		perspectiveVolumeFuel = volumeFuel;
		realVolumeFuel = volumeFuel;
		this.typeFuel = typeFuel;
	}

	synchronized public void decrement() {
		realVolumeFuel--;
	}

	public int getPerspectiveVolumeFuel() {
		return perspectiveVolumeFuel;
	}

	public TypeFuel getTypeFuel() {
		return typeFuel;
	}

	synchronized public void setPerspectiveVolumeFuel(int countFuel) {
		perspectiveVolumeFuel -= countFuel;
	}

}
