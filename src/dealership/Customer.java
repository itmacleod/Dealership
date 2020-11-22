package dealership;

public class Customer {
	
	private String name;
	private String address;
	private double budget;
	private boolean finance;
	
	public Customer(String name, String address, boolean finance) {
		this.name = name;
		this.address = address;
		this.finance = finance;
	}
	
	public double getBudget() {
		return this.budget;
	}
	
	public void setBudget(double d) {
		this.budget = d;
	}
	
	public boolean getFinance() {
		return this.finance;
	}

}
