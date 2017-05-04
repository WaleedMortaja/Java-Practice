/*
E3.11 Implement a class Employee. An employee has a name (a string) and a salary (a double).
Provide a constructor with two arguments
public Employee(String employeeName, double currentSalary)
and methods
public String getName()
public double getSalary()
public void raiseSalary(double byPercent)
These methods return the name and salary, and raise the employee’s salary by a
certain percentage. Sample
usage:
Employee harry = new Employee("Hacker, Harry", 50000);
harry.raiseSalary(10); // Harry gets a 10 percent raise
Supply an EmployeeTester class that tests all methods.
*/




/**
 * Calculate employees’ salaries.
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a> 
 */
public class E11_Employee
{
    private final String name;
    private double salary;
    
    /**
    * Constructor for an employee.
    * @param employeeName employee name
    * @param currentSalary employee current salary
    */
    public E11_Employee(String employeeName, double currentSalary)
    {
    name = employeeName;
    salary=currentSalary;
    }
    /**
     * return employee name
      *@return name the name of the employee
      */
    public String getName(){return name;}
    /**
     * return employee salary
      *@return salary the salary of the employee
      */
    
    public double getSalary(){return salary;}
    /**
     *Increase salary by the given value.
     *@param byPercent the percentage which with the employee salary will increase
     */
    
    public void raiseSalary(double byPercent)
    {
        salary += salary*byPercent/100.0;
    }
}
