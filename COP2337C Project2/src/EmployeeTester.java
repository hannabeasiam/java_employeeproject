import javax.swing.JOptionPane;

public class EmployeeTester {	
	// Driver class
	public static void main(String[] args){
		
		String SSN;
		
		//base class  employee test default constructor
		Employee e1 = new Employee();
		JOptionPane.showMessageDialog(null, "Employee e1 (default)\n" +e1);
		
		//base class  employee test parameter constructor
		Employee e2 = new Employee("Jone", "Smith", "123456789", 2017, "IT", 1234);
		JOptionPane.showMessageDialog(null, "Employee e2 (parameter)\n" + e2);
		
		//part time employee test default constructor
		PartTimeEmployee p1 = new PartTimeEmployee();
		JOptionPane.showMessageDialog(null, "PartTimeEmployee p1 (default)\n" + p1);
		
		//part time employee test parameter constructor
		PartTimeEmployee p2 = new PartTimeEmployee("Jane", "Doe", "987654321", 2014, "IT", 1234, 42, 10);
		JOptionPane.showMessageDialog(null, "PartTimeEmployee p2 (parameter)\n" +p2);
		
		//FullTimeEmployee test default constructor
		FullTimeEmployee f1 = new FullTimeEmployee();
		JOptionPane.showMessageDialog(null, "FullTimeEmployee (default)\n" +f1);
		
		//FullTime employee test parameter constructor
		FullTimeEmployee f2 = new FullTimeEmployee("Wal", "Green", "123654789", 2016, "Sales", 3333, 100000);
		JOptionPane.showMessageDialog(null, "FullTimeEmployee f2 (para)\n" + f2);
		
		String firstName = JOptionPane.showInputDialog("Enter employee first name.");
		String lastName = JOptionPane.showInputDialog("Enter employee last name.");
		
		//do while to validate ssn
				do{
					SSN = JOptionPane.showInputDialog("Employee social security number?");			
					if(SSN.length() != 9)
						JOptionPane.showMessageDialog( null,"Please enter a valid social of 9 digits (Numbers only!)");
				}while(SSN.length() != 9 );
				
				//prompts for all information and will process all employees with the information.
		String department = JOptionPane.showInputDialog("Enter employee department.");
		int startYear = Integer.parseInt(JOptionPane.showInputDialog("Enter employee start year."));
		int depatrmentCode = Integer.parseInt(JOptionPane.showInputDialog("Enter employee department code."));
		double annualSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter employee annual salary."));
		double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter employee hours worked."));
		double hourlyRate = Double.parseDouble(JOptionPane.showInputDialog("Enter employee hourly rate."));

		//Base employee instance.
		Employee employee1 = new Employee();
		employee1.setFirstName(firstName);
		employee1.setLastName(lastName);
		employee1.setSocial(SSN);
		employee1.setDepartment(department);
		employee1.setStartYear(startYear);
		employee1.setDepCode(depatrmentCode);
		employee1.getIDnumber();
		JOptionPane.showMessageDialog(null,"User entered employee\n" + employee1.toString());
		
		//part time employee instance derived from base employee.
		PartTimeEmployee partTimeEmplyee1 = new PartTimeEmployee();
		partTimeEmplyee1.setFirstName(firstName);
		partTimeEmplyee1.setLastName(lastName);
		partTimeEmplyee1.setSocial(SSN);
		partTimeEmplyee1.setDepartment(department);
		partTimeEmplyee1.setStartYear(startYear);
		partTimeEmplyee1.setHourlyRate(hourlyRate);
		partTimeEmplyee1.setWeeklyHoursWorked(hoursWorked);
		partTimeEmplyee1.setDepCode(depatrmentCode);
		partTimeEmplyee1.getIDnumber();
		
		JOptionPane.showMessageDialog(null,"User entered part time employee\n" + partTimeEmplyee1.toString());
		
		//full time employee derived from base employee.
		FullTimeEmployee fullTimeEmplyee1 = new FullTimeEmployee();
		fullTimeEmplyee1.setFirstName(firstName);
		fullTimeEmplyee1.setLastName(lastName);
		fullTimeEmplyee1.setSocial(SSN);
		fullTimeEmplyee1.setDepartment(department);
		fullTimeEmplyee1.setStartYear(startYear);
		fullTimeEmplyee1.setAnnualSalary(annualSalary);
		fullTimeEmplyee1.setDepCode(depatrmentCode);
		fullTimeEmplyee1.getIDnumber();
		
		JOptionPane.showMessageDialog(null,"User entered full time employee\n" + fullTimeEmplyee1.toString());
		
		EmployeeGUITester gui = new EmployeeGUITester();
		gui.main(args);
		
		
	}
}