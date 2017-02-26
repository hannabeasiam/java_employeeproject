
import java.text.NumberFormat;
public class FullTimeEmployee extends Employee {

	private double annualSalary;
	
	//Default constructor
	public FullTimeEmployee(){
		super();
		annualSalary=0;
	}
	//Parameter constructor
	public FullTimeEmployee(String fN, String lN, String ssn, int sY, String dep, int depCode, double as){
		super(fN,lN,ssn,sY,dep,depCode);
		annualSalary=as;
	}
	//Mutator
	public void setAnnualSalary(double as){
		annualSalary=as;
	}
	//Accessor
	public double getAnnualSalary(){
		return annualSalary;
	}
	//Method
	public double CalculateWeeklyPay(){
		double weeklyPay;
		weeklyPay=annualSalary/52.0;
		return weeklyPay;
	}
	/*
	 *toString method, import java.text.NumberFormat to use currency format 
	 */
	public String toString(){
		return super.toString()+"Annual Salary: "+ NumberFormat.getCurrencyInstance().format(annualSalary)+"\nWeekly Pay: "+NumberFormat.getCurrencyInstance().format(CalculateWeeklyPay())+"\n";
	}
}
