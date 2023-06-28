package CarOps;

public class Vehicle {

	private String plate;
	private String brand;
	private String model;
	private int prodYear;

	public void printDetails() {
		System.out.println("Plate: " + plate);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Production Year: " + prodYear);
	}

	public Vehicle(String plate, String brand, String model, int prodYear) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.prodYear = prodYear;
		Registry.Vehicles.add(this);
	}

	public String getPlate() {
		return plate;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getProdYear() {
		return prodYear;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}
}
