
public class PartTimeEmployee extends Employee{
	
	// Fields
	private double weeklyHoursWorked, hourlyRate;
	
	// Constructors
	public PartTimeEmployee(){
		super();
		this.weeklyHoursWorked=0;
		this.hourlyRate=0;
	}
	
	//Parameter constructor
	public PartTimeEmployee(String fN, String lN, String ssn, int sY, String dep, int depCode, double whw, double hr){
		super(fN,lN,ssn,sY,dep,depCode); // call superclass
		weeklyHoursWorked=whw;
		hourlyRate=hr;
	}
	// Accessors (Getters)
	public double getWeeklyHoursWorked(){
		return this.weeklyHoursWorked;
	}
	
	public double getHourlyRate(){
		return this.hourlyRate;
	}
	
	// Mutators (Setters)
	public void setWeeklyHoursWorked(double whw){
		this.weeklyHoursWorked=whw;
	}
	
	public void setHourlyRate(double hr){
		this.hourlyRate=hr;
	}
	
	// Methods
	//calculates weekly pay
	public double CalculateWeeklyPay(){
		double weeklyPay;
		if(this.weeklyHoursWorked<=40)
			weeklyPay = this.weeklyHoursWorked * this.hourlyRate;
		else
			//calculates weekly pay if theres over time
			weeklyPay = (40 * this.hourlyRate)+((this.weeklyHoursWorked-40) * this.hourlyRate * 1.5);
		return weeklyPay;
	}	
	
	// Method toString()
	public String toString(){
		return super.toString()+"Weekly Hours Worked: "+weeklyHoursWorked+"\nHourly Rate: "
	+hourlyRate+"\nWeekly Pay: "+CalculateWeeklyPay()+"\n";
	}
}