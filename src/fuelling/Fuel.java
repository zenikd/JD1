package fuelling;

public class Fuel {
	private int volumeFuel;
	private TypeFuel typeFuel;
	
	public Fuel(int volumeFuel, TypeFuel typeFuel) {
		this.volumeFuel = volumeFuel;
		this.typeFuel = typeFuel;
	}
	
	synchronized public void decrement() {
		volumeFuel--;
	}
	
	public int getVolumeFuel() {
		return volumeFuel;
	}
	
	public TypeFuel getTypeFuel() {
		return typeFuel;
	}
	

}
