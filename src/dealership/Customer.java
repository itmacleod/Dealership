package dealership;

public class Customer {
	
	private String name;
	private String address;
	private int budget;
	
	public Customer(String name, String address, int budget) {
		this.name = name;
		this.address = address;
		this.budget = budget;
	}
	
	/**
	 * 
	 * @param vehicle
	 * @param employee
	 * @param finance
	
	public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance) {
		
	}
	
	*/
	
	public int getBudget() {
		return this.budget;
	}

}
