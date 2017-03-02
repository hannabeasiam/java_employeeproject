
import java.text.NumberFormat;
public class FullTimeEmployee extends Employee {

	private double annualSalary;
	
	//Default constructor
	public FullTimeEmployee(){
		super();
		this.annualSalary=0;
	}
	//Parameter constructor
	public FullTimeEmployee(String fN, String lN, String ssn, int sY, String dep, int depCode, double as){
		super(fN,lN,ssn,sY,dep,depCode);
		this.annualSalary=as;
	}
	//Mutator
	public void setAnnualSalary(double as){
		this.annualSalary=as;
	}
	//Accessor
	public double getAnnualSalary(){
		return this.annualSalary;
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
		return super.toString()+"Annual Salary: "+ NumberFormat.getCurrencyInstance().format(this.annualSalary)
				+"\nWeekly Pay: "+NumberFormat.getCurrencyInstance().format(CalculateWeeklyPay())+"\n";
	}
}
