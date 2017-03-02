
import java.util.Random;

import javax.swing.JOptionPane;

public class Employee {
	// Private variables
	private String firstName, lastName, idNumber, socialSecurityNumber, department;
	private int startYear, departmentCode;
	 
	// Default constructor
	public Employee(){
		this.firstName = "John";
		this.lastName = "Doe";
		this.startYear = 2017;
		this.idNumber = createIDNumber();
		this.socialSecurityNumber = "123456789";
		setSocial(socialSecurityNumber);
		this.department = "Java";
		this.departmentCode = 21;
	}
	 	 
	// Parameter constructor
	public Employee(String fN, String lN, String ssn, int sY, String dep, int depCode){
		this.firstName = fN;
		this.lastName = lN;
		this.socialSecurityNumber = ssn;
		setSocial(socialSecurityNumber);
		this.startYear = sY;
		this.department = dep;
		this.departmentCode = depCode;
		this.idNumber = createIDNumber();	
	}

	// Mutators (Setters)
	public void setFirstName(String fN){		 
		this.firstName = fN;
	}
	public void setLastName(String lN){		 
		this.lastName = lN;
	}	 
	// Format: 3Num-2Num-4Num		 
	public void setSocial(String ssn){
		this.socialSecurityNumber = ssn.substring(0,3) + "-" 
			+ ssn.substring(3,5) + "-" + ssn.substring(5);
	}	 
	public void setStartYear(int sY){		 
		this.startYear = sY;
	}
	public void setDepartment(String dep){
		this.department = dep;
	}
	public void setDepCode(int dC){
		this.departmentCode = dC;
	}
	 
	// Accessors (Getters)
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}	 
	public String getIDnumber(){
		return this.idNumber = createIDNumber();
	}	 
	public String getSocial(){
		return this.socialSecurityNumber;
	}	 
	public int getStartYear(){
		return this.startYear;
	}	 
	public String getDepartment(){
		return this.department;
	}	 
	public int getDepCode(){
		return this.departmentCode;
	}
	
	// Format: FNinitialLNinitial-4RandomNum		 
	private String createIDNumber(){
		Random randomNum = new Random();
		int randomInt = randomNum.nextInt(9999);
		String rNum = String.format("%04d", randomInt);
		String idNum = Character.toString(this.firstName.toUpperCase().charAt(0))
				+Character.toString(this.lastName.toUpperCase().charAt(0))+"-"+rNum;
		return idNum;
	}	 
	// Method toString()
	public String toString(){
//		idNumber = createIDNumber();
		return "Employe ID: " + this.idNumber
			+ "\nFirst name: " + this.firstName
			+ "\nLast name: " + this.lastName
			+ "\nSocial Security Number: " + this.socialSecurityNumber
			+ "\nStart year: " + this.startYear
			+ "\nDepartment: " + this.department
			+ "\nDepartment code: " + this.departmentCode + "\n";
	}	
	//prompts for int
	public int promptI(String text){
		String prompt = JOptionPane.showInputDialog(text);
		int newInt = Integer.parseInt(prompt);
		return newInt;
	}
	
	//prompts for string
	public String promptS(String text){
		String prompt = JOptionPane.showInputDialog(text);
		return prompt;
	}
}