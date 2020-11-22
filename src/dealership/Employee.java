package dealership;

import java.util.HashMap;

public class Employee {
	
	private String name;
	HashMap<String, String> inventory = new HashMap<>();
	
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
		
	}

}
