package eElectricityBillingSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Customer Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter units: ");
		int units=sc.nextInt();
		
		Customer c = new Customer(id, units, name);
		BillingSystem b = new BillingSystem(c);
		b.displayBill();
		

	}

}