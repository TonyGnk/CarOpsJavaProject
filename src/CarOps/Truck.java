package CarOps;

public class Truck extends Vehicle {

	private int useFullLoad;

	public Truck(String plate, String brand, String model, int productionYear, int useFullLoad) {
		
		super(plate, brand, model, productionYear);
		this.useFullLoad = useFullLoad;
	}

}