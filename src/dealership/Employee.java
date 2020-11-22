package dealership;

import java.util.HashMap;
import java.util.Iterator;

public class Employee {
	
	private String name;
	HashMap<String, Integer> inventory = new HashMap<>();
	
	public Employee(String name) {
		this.name = name;
	}
	
	public void ringCustomerUp(Vehicle vehicle, double money) {
		if(money < vehicle.getPrice()) {
			System.out.println("Sorry, it looks like your card was declined");
		}else {
			System.out.println("One " + vehicle.getMake() + vehicle.getModel() + "coming right up!");
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

}
