package eElectricityBillingSystem;

public class BillingSystem {
	Customer customer;

	public BillingSystem(Customer customer) {
		super();
		this.customer = customer;
	}
	
	public double CalculateBill() {
		int units=customer.getUnits();
		double amt=0;
		
		if(units<=100) {
			amt=units * 1.3;
		}else if (units<=300) {
			amt=100 * 1.3+(units-100)*2.3;
		}else {
			amt=(100*1.3)+(200*2.3)+(units-300)*3.3;
		}
		return amt;
	}
	public void displayBill() {
		System.out.println("Customer ID :"+customer.getId());
		System.out.println("Customer Name :"+customer.getName());
		System.out.println("Units :"+customer.getUnits());
		System.out.println("Total Bill :"+CalculateBill());
	}

}