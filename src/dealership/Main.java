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
			Customer customer1 = new Customer("John", "123 New String Rd", 50000.00);
			Employee employee = new Employee("Eric");
		}
	
		

	}

}
