COP2337C Project Version 2 – 100 points
For version 2 you will add the concept of Inheritance.
Features:
 A subclass called PartTimeEmployee, to be inherited from the Employee class.
(5 pts) This class will inherit all of the fields and methods of an Employee,
and will include the following additional private fields:
o weeklyHoursWorked
o hourlyRate
The PartTimeEmployee class will also include the following methods:
o (10 pts) Constructors:
o Default constructor that initializes the two private fields to zero
in addition to calling the superclass default constructor.
o Parameter Constructor that sets the two private field values in
addition to calling the superclass parameter constructor.
o (5 pts) Include mutator methods for the two new member fields.
o (5 pts) Include accessor methods for the two new member fields.
o (10 pts) Include the following public method called CalculateWeeklyPay().
This method should calculate and return the weekly pay based on the
following:
If 40 hours or less are worked:
weeklyPay = weeklyHoursWorked * hourlyRate
 If over 40 hours are worked:
Regular pay for the first 40 hours plus an additional amount of 1.5 the
hourlyRate for all hours worked over 40.
 A subclass called FullTimeEmployee, to be inherited from the Employee class.
(5 pts) This class will inherit all of the fields and methods of an Employee,
and will include the following additional private field:
o annualSalary
The FullTimeEmployee class will also include the following methods:
o (10 pts) Constructors:
o Default constructor that initializes the private field to zero in
addition to calling the superclass default constructor.
o Parameter Constructor that sets the private field value in addition
to calling the superclass parameter constructor.
o (5 pts) Include a mutator methods for annualSalary.
o (5 pts) Include accessor methods for annualSalary.
o (10 pts) Include the following public method called CalculateWeeklyPay().
The weekly pay will be based on a 52-week year.
(10 pts) Update your UML diagram to represent the Employee Hierarchy.
o (20 pts) Create a driver class called EmployeeTester. Be sure to fully
test your class.