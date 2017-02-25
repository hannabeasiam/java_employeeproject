
public class EmployeeTester {	
	// Driver class
	public static void main(String[] args){
		
		// where we store ssn
		String SSN;
	
		// Prompt user
		String fN = Employee.promptS("Employee 1first name?");
		String lN = Employee.promptS("Employee last name?");
		
		//do while to validate SSN
		do{
			SSN = Employee.promptS("Employee social security number?");			
			if(SSN.length() != 9)
				Employee.printS( "Please enter a valid social of 9 digits (Numbers only!)");
		}while(SSN.length() != 9 );			
			
		int startYear = Employee.promptI("Employee Start year?");
		
		String dep = Employee.promptS("Employee department?");
		
		int depCode = Employee.promptI("Employee department code ? (int)");
		
		// Instantiate first using parameter constructor
		Employee first = new Employee(fN, lN, SSN, startYear, dep, depCode);

		// Display first's info using getters.
		first.printEmployee();

		// Instantiate second using default constructor
		Employee second = new Employee();
			
		// Display second's info using our getters.
		second.printEmployee();
		
		// Instantiate third
		Employee third = new Employee();
		
		//call setters
		third.setFirstName("Sherry");
		third.setLastName("Cox");
		third.setSocial("987654321");
		third.setStartYear(2016);
		third.setDepartment("Web Developement");
		third.setDepCode(2196);
		
		// Display third's info using getters.
		third.printEmployee();
	
		// Instantiate fourth
		Employee fourth = new Employee("Jeff", "Ree", "111223333", 1111, "Crazy Coder", 1111);
		
		// Print method
		fourth.printEmployee();			
	}
	

}
	
	
	

	
	
