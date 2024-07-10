import java.util.Scanner;
class EmployeeSearch
{
	static class Employee
	{
		int eno;
		String ename;
		double empsalary;
		
		Employee(int eno , String ename , double empsalary)
		{		
			this.eno = eno;
			this.ename = ename;
			this.empsalary = empsalary;
		}
	}

public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Employees : ");
	int n = sc.nextInt();
	Employee[] employees = new Employee[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the details of employee number"+" "+(i+		1)+" "+":");
		System.out.println("Enter Employee number : ");
		int eno = sc.nextInt();
		System.out.println("Enter Employee name : ");
		String ename = sc.next();
		System.out.println("Enter Salary : ");
		double empsalary = sc.nextDouble();
		employees[i] = new Employee(eno,ename,empsalary);
	}
	System.out.println("Enter the Employee number : ");
	int m = sc.nextInt();
	boolean found=false;
	for(Employee emp : employees)
	{
		if(emp.eno == m)
		{	
			System.out.println("Employee Found");
			System.out.println("Employee number :"+" "+emp.eno);
			System.out.println("Employee name :"+" "+emp.ename);
			System.out.println("Employee Salary:"+" "+emp.empsalary); 
		}
	}
	if(!found)
	{
		System.out.println("Employee not found");
	}
}
}
			
			
	

	
		
	