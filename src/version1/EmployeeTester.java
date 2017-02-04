package version1;

import javax.swing.JOptionPane;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables
		String input, testSSN;
		
		// Prompt user
		String testfName = JOptionPane.showInputDialog("Employee first name?");
		String testlName = JOptionPane.showInputDialog("Employee last name?");
		
		//Validate testSSN
		do{
			testSSN = JOptionPane.showInputDialog("Employee social security number?");			
			if(testSSN.length() != 9)
				JOptionPane.showMessageDialog(null, "PLease enter a valid social of 9 digits (Numbers only!)");
		}while(testSSN.length() != 9 );			
		
		input = JOptionPane.showInputDialog("Employee Start year?");
		int testsYear = Integer.parseInt(input);
		
		String testdep = JOptionPane.showInputDialog("Employee department?");
		
		input = JOptionPane.showInputDialog("Employee department code ? (int)");
		int testdCode = Integer.parseInt(input);
		
		// Instantiate first using parameter constructor
		Employee first = new Employee(testfName, testlName, testSSN, testsYear, testdep, testdCode);
				
				// Display first's info using getters.
		JOptionPane.showMessageDialog(null, "User entered employee"
						+ "\nEmploye Id: " + first.getIDnumber()
						+ "\nFirst name: " + first.getfirstName()
						+ "\nLast name: " + first.getLastName()
						+ "\nSocial security number: " + first.getSocial()
						+ "\nStart year: " + first.getStartYear()
						+ "\nDepartment: " + first.getDepartment()
						+ "\nDepartment code: " + first.getDepCode());
				
				
				
		//instantiate a new employee using default constructor
		Employee defaultEmp = new Employee();
		
		//Here we display the default information with our getters.
		JOptionPane.showMessageDialog(null, "Default employee"
				+ "\nEmploye Id: " + defaultEmp.getIDnumber()
				+ "\nFirst name: " + defaultEmp.getfirstName()
				+ "\nLast name: " + defaultEmp.getLastName()
				+ "\nSocial security number: " + defaultEmp.getSocial()
				+ "\nStart year: " + defaultEmp.getStartYear()
				+ "\nDepartment: " + defaultEmp.getDepartment()
				+ "\nDepartment code: " + defaultEmp.getDepCode());
		
		/* Instantiate manualEmp */
		//object using using manually entered information using the parameter constructor and only had to use one setter for format
		Employee manualEmp = new Employee();
		manualEmp.setFirstName("Sherry");
		manualEmp.setLastName("Cox");
		manualEmp.setSocial("987654321");
		manualEmp.setStartYear(2002);
		manualEmp.setDepartment("Web Developement");
		manualEmp.setDepCode(3215);
		
		//Here we display the manually entered information with our getters.
		JOptionPane.showMessageDialog(null, "Parameter employee"
				+ "\nEmploye Id: " + manualEmp.getIDnumber()
				+ "\nFirst name: " + manualEmp.getfirstName()
				+ "\nLast name: " + manualEmp.getLastName()
				+ "\nSocial security number: " + manualEmp.getSocial()
				+ "\nStart year: " + manualEmp.getStartYear()
				+ "\nDepartment: " + manualEmp.getDepartment()
				+ "\nDepartment code: " + manualEmp.getDepCode());
		
		
	}

}
