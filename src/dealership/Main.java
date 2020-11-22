package dealership;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//Program that simulates a car dealership sales process. There are
		//employees, working selling vehicles to customers 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the dealership!");
		System.out.println("My name is Eric! Would you like to buy a car? y/n");
		String response = scan.next();
		
		if(response.equalsIgnoreCase("n")) {
			System.out.println("Have a good day!");
		}else {
			Customer customer1 = new Customer("John", "123 New String Rd", false);
			Employee employee = new Employee("Eric");
			System.out.println("How much money do you have to spend? ");
			int money = scan.nextInt();
			customer1.setBudget(money);
			System.out.println("Which car would you like to buy? ");
			employee.showInventory();
			String response2 = scan.next();
			scan.nextLine();
			if(response2.equalsIgnoreCase("tesla")) {
				Vehicle vehicle = new Vehicle("Tesla", "Model S", 2019, 90000);
				System.out.println("The Tesla Model S, a good choice!");
				employee.handleCustomer(customer1, customer1.getFinance(), vehicle);
			}else if(response2.equalsIgnoreCase("jeep")) {
				Vehicle vehicle = new Vehicle("Jeep", "Wrangler", 2010, 50000);
				System.out.println("The Jeep Wrangler, great for offroading!");
				employee.handleCustomer(customer1, customer1.getFinance(), vehicle);
			}else if(response2.equalsIgnoreCase("Honda")) {
				Vehicle vehicle = new Vehicle("Honda", "Civic", 2011, 30000);
				System.out.println("The Honda Civic, a trusty car!");
				employee.handleCustomer(customer1, customer1.getFinance(), vehicle);
			}else {
				System.out.println("Sorry, we don't know what that is...");
			}
			
			System.out.println("Thanks for shopping with us!");
		
			
			
	
		

		}
	}
}
