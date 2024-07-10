import java.util.Scanner;
class Person
{
	String name;
	String gender;
	String address;
	int age;
	
	Person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}

class Employee extends Person
{
	int empid;
	String cmp_name;
	String qualification;
	double salary;
	
	Employee(String name,String gender,String address,int age,int empid,String cmp_name,String qualification,double salary)
	{
		super(name,gender,address,age);
		this.empid=empid;
		this.cmp_name=cmp_name;
		this.qualification=qualification;
		this.salary=salary;
	}
}

class Teacher extends Employee
{
	String subject;
	String department;
	int teacher_id;
	
	Teacher(String name,String gender,String address,int age,int empid,String cmp_name,String 	qualification,double salary,String subject,String department,int teacher_id)
	{
		super(name,gender,address,age,empid,cmp_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacher_id=teacher_id;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Age : "+age);
		System.out.println("Employee Id : "+empid);
		System.out.println("Company Name : "+cmp_name);
		System.out.println("Qualification : "+qualification);
		System.out.println("Salary : "+salary);
		System.out.println("Subject : "+subject);
		System.out.println("Department : "+department);
		System.out.println("Teacher Id : "+teacher_id);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Teacher :");
		int num = sc.nextInt();
		Teacher[] arr = new Teacher[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the deatils of teacher number : "+" "+(i+					1));

			System.out.println("Enter the name :");
			String name = sc.next();

			System.out.println("Enter the Gender :");
			String gender = sc.next();

			System.out.println("Enter the Address :");
			String address = sc.next();

			System.out.println("Enter the age : ");
			int age = sc.nextInt();

			System.out.println("Enter Employee Id : ");
			int empid = sc.nextInt();

			System.out.println("Enter the Company name :");
			String cmp_name = sc.next();

			System.out.println("Enter the Qualification :");
			String qualification = sc.next();

			System.out.println("Enter the Salary : ");
			double salary = sc.nextDouble();

			System.out.println("Enter the Subject :");
			String subject = sc.next();

			System.out.println("Enter the Department : ");
			String department = sc.next();

			System.out.println("Enter the Teacher_id : ");
			int teacher_id = sc.nextInt();
		
			arr[i] = new Teacher(name,gender,address,age,empid,cmp_name,qualification,salary, 			subject,department,teacher_id );
		}
		System.out.println("\n---------Details of "+" " +num+ " "+" Teachers---------\n");
		for(int i=0;i<num;i++)
		{
			arr[i].display();
			System.out.println("--------------------------------------------");
		}
	}
}
			
		
			

		





		