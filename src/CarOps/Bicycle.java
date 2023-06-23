package CarOps;

public class Bicycle extends Vehicle {

	private int cubism;
	
	
	public void printDetails() {
		
		super.printDetails();
		System.out.println("Cubism: " +cubism);
	
	}

	public Bicycle(String plate, String brand, String model, int productionYear, int cubism) {
		
		super( plate, brand, model, productionYear);
		this.cubism = cubism;
	}

}