package version1;

import java.util.Random;

/*
 * This is Java project Version 1 
 */
public class Employee {

	//Declare Employee info under private
	private String firstName, lastName, IDnumber, socialSecurityNumber, department;
	private int startYear, departmentCode;
	
	//Create Default constructor
	public Employee(){
		firstName = "John";
		lastName = "Doe";
		startYear = 2017;
		IDnumber = CreateIDNumber(firstName,lastName);
	}
	
	//Parameter constructor
	public Employee(String fName, String lName, String SSN, int sYearear, String dep, int depCode){
		firstName = fName;
		lastName = lName;
		setSocial(SSN);
		//socialSecurityNumber = SSN;
		//setSocial(socialSecurityNumber);
		startYear = sYearear;
		department = dep;
		departmentCode = depCode;
		IDnumber = CreateIDNumber(firstName,lastName);
	}
	
	//Using mutator method to collect employee info
	public void setFirstName(String fName){
		firstName = fName;
	}
	
	public void setLastName(String lName){	 
		lastName = lName;
	}
	
	//SSN format xxx-xx-xxxx
	public void setSocial(String SSN){
		socialSecurityNumber = SSN.substring(0,3) + "-" + SSN.substring(3,5) +
				"-" + SSN.substring(5) ;
	}
	
	public void setStartYear(int sYear){		 
		startYear = sYear;
	}
	
	public void setDepartment(String dep){
		department = dep;
	}
	
	public void setDepCode(int dCode){
		departmentCode = dCode;
	}
	
	//Use accessor methods for get a value from a class's field and return value 
	public String getfirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}	 
	
	public String getIDnumber(){
		return IDnumber = CreateIDNumber(firstName,lastName);
	}	
	
	public String getSocial(){
		return socialSecurityNumber;
	} 
	
	public int getStartYear(){
		return startYear;
	}	
	
	public String getDepartment(){
		return department;
	}	
	
	public int getDepCode(){
		return departmentCode;
	}
	
	//Method to create ID include required toString()
	//Format : fName(initial)lName(initial)-4RandomNum
	private String CreateIDNumber(String fName, String lName){
		Random randomNum = new Random();
		int randomInt = randomNum.nextInt(9999);
		String rNum = String.format("%04d", randomInt);
		String idNum = Character.toString(fName.toUpperCase().charAt(0))
				+Character.toString(lName.toUpperCase().charAt(0))+"-"+rNum;
		return idNum;
	}

}
