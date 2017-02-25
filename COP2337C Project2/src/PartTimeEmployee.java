
public class PartTimeEmployee extends Employee{
	
	// Fields
	private double weeklyHoursWorked, hourlyRate;
	
	// Constructors
	public PartTimeEmployee(){
		super();
		weeklyHoursWorked=0;
		hourlyRate=0;
	}
	
	//Parameter constructor
	public PartTimeEmployee(String fN, String lN, String ssn, int sY, String dep, int depCode, double whw, double hr){
		super(fN,lN,ssn,sY,dep,depCode); // call superclass
		weeklyHoursWorked=whw;
		hourlyRate=hr;
	}
	// Accessors (Getters)
	public double getWeeklyHoursWorked(){
		return weeklyHoursWorked;
	}
	
	public double getHourlyRate(){
		
		return hourlyRate;
	}
	
	// Mutators (Setters)
	public void setWeeklyHoursWorked(double whw){
		weeklyHoursWorked=whw;
	}
	
	public void setHourlyRate(double hr){
		hourlyRate=hr;
	}
	
	// Methods
	public double CalculateWeeklyPay(){
		double weeklyPay;
		if(weeklyHoursWorked<=40)
			weeklyPay = weeklyHoursWorked * hourlyRate;
		else
			weeklyPay = (40 * hourlyRate)+((weeklyHoursWorked-40) * hourlyRate * 1.5);
		return weeklyPay;
	}	
	
	// Method toString()
	public String toString(){
		return super.toString()+"\nWeekly Hours Worked: "+weeklyHoursWorked+"\nHourly Rate: "+hourlyRate+"\nWeekly Pay: "+CalculateWeeklyPay()+"\n";
	}
}