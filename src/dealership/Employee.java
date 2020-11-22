package dealership;

public class Employee {
	
	private String name;
	
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

}
