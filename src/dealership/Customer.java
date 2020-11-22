package dealership;

public class Customer {
	
	private String name;
	private String address;
	private int budget;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public int getBudget() {
		return this.budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}

}
