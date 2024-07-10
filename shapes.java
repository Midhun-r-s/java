import java.util.Scanner;
class overload
{
	public void area(double b , double h)
	{
		double area1 = 0.5*b*h;
		System.out.println("The area of Triangle is :"+" "+area1+" "+"sq units");
	} 
	public void area(double a)
	{
		double area2 = a*a;
		System.out.println("The area of square is :"+" "+area2+" "+"sq units");
	}
	public void area(int l,int e)
	{
		int area3 = l*e;
		System.out.println("The area of rectangle is :"+" "+area3+" "+"sq units");
	}
}
public class shapes
{
	public static void main(String args[])
	{
		
		overload obj = new overload();
		Scanner sc = new Scanner(System.in);
		System.out.println("----Triangle----");
		System.out.println("Enter the length of base :");
		double b=sc.nextDouble();
		System.out.println("Enter the Height :");
		double h=sc.nextDouble();
		obj.area(b,h);
		System.out.println("----Square----");
		System.out.println("Enter the length of a side :");
		double a=sc.nextDouble();
		obj.area(a);
		System.out.println("----Rectangle----");
		System.out.println("Enter the length :");
		int l=sc.nextInt();
		System.out.println("Enter the breadth :");
		int e=sc.nextInt();
		obj.area(l,e);
		
	}
}
		
