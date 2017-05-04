/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

public class E11_EmployeeTester
{
public static void main(String[] args)
{
E11_Employee harry = new E11_Employee("Hacker, Harry", 50000);
System.out.println("Employee Name : "+harry.getName());
System.out.println("Employee Salary : "+harry.getSalary());
harry.raiseSalary(10); // Harry gets a 10 percent raise
System.out.println("\nEmployee Salary after increasing : "+harry.getSalary());
System.out.println("Employee Expected Salary : 55000.0");
}
}
