import java.util.Scanner;
interface calc
{
	void area();
	void perimeter();
}
class circle implements calc
{
	Scanner sc=new Scanner(System.in);
	double r;
	public void data()
	{
		System.out.println("Enter the radius of the circle : ");
		r = sc.nextDouble();
	}
	public void area()
	{
		double area1 = 3.14*r*r;
		System.out.println("The area of circle is : "+" "+area1+" "+"sq units");
	}
	public void perimeter()
	{
		double perimeter1 = 2*3.14*r;
		System.out.println("The perimeter of circle is : "+" "+perimeter1);
	}
}
class rectangle implements calc
{
	Scanner sc1 = new Scanner(System.in);
	double l;
	double b;
	public void data()
	{
		System.out.println("Enter the Lenght of Rectangle : ");
		l=sc1.nextDouble();
		System.out.println("Enter the Breadth of Rectangle : ");
		b=sc1.nextDouble();
	}
	public void area()
	{
		double area1=l*b;
		System.out.println("The area of Rectangle is : "+" "+area1+" "+"sq units");
	}
	public void perimeter()
	{
		double perimeter1=2*(l+b);
		System.out.println("The perimter of Reactangle is : "+" "+perimeter1);
	}
}
class Maincalc
{
	public static void main(String args[])
	{
		circle obj1 = new circle();
		rectangle obj2 = new rectangle();
		Scanner sc2 = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("\n1.Circle\n2.Rectangle\n3.Exit");
			System.out.println("-------------------");
			System.out.println("Enter your choice:\n");
			int ch = sc2.nextInt();
			switch(ch)
			{
				case 1:
					obj1.data();
					obj1.area();
					obj1.perimeter();
					break;
				case 2:
					obj2.data();
					obj2.area();
					obj2.perimeter();
					break;
				case 3 :
					loop=false;
					System.out.println("Exiting.....");
					break;
				default:
					System.out.println("Invalid choice");	
			}
		}
	}
}
		

	
		
		
	