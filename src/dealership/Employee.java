package dealership;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	
	private String name;
	HashMap<String, Integer> inventory = new HashMap<>();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
		if(finance) {
			runCreditHistory(customer, vehicle.getPrice() - customer.getBudget());
		}else if(vehicle.getPrice() <= customer.getBudget()){
			processTransaction(customer, vehicle);
		}else {
			System.out.println("Bring more money...");
		}
	}
	
	public void showInventory() {
		System.out.println("Here is our selection...");
		this.inventory.put("Tesla Model S", 90000);
		this.inventory.put("Jeep Wrangler", 50000);
		this.inventory.put("Honda Civic", 30000);
		
		for(String key : inventory.keySet()) {
			System.out.println(key);
		}
		
	}
	
	public void runCreditHistory(Customer customer, int amount) {
		System.out.println("Running credit history...");
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		
	}

}
