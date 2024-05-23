package eElectricityBillingSystem;

public class Customer {
	int id;
	int units;
	String name;
	
	public Customer(int id, int units, String name) {
		super();
		this.id = id;
		this.units = units;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public int getUnits() {
		return units;
	}

	public String getName() {
		return name;
	}
}