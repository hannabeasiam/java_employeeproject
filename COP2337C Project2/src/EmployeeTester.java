import java.util.Currency;

public class EmployeeTester {	
	// Driver class
	public static void main(String[] args){
		
		Employee e1 = new Employee();
		System.out.println("Employee e1 (default)");
		System.out.println(e1);
		Employee e2 = new Employee("Jone", "Smith", "123456789", 2017, "IT", 1234);
		System.out.println("Employee e2 (para)");
		System.out.println(e2);
		PartTimeEmployee p1 = new PartTimeEmployee();
		System.out.println("PartTimeEmployee p1 (default)");
		System.out.println(p1);
		PartTimeEmployee p2 = new PartTimeEmployee("Jane", "Doe", "987654321", 2015, "IT", 1234, 42, 10);
		System.out.println("PartTimeEmployee p2 (para)");
		System.out.println(p2);
		//FullTimeEmployee test
		FullTimeEmployee f1 = new FullTimeEmployee();
		System.out.println("FullTimeEmployee f1 (default)");
		System.out.println(f1);
		FullTimeEmployee f2 = new FullTimeEmployee("Wal", "Green", "123654789", 2016, "Sales", 3333, 100000);
		System.out.println("FullTimeEmployee f2 (para)");
		System.out.println(f2);
	}
}