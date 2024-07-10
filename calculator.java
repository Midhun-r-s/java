import java.util.Scanner;
class calculator
{
	public static void main(String[] args);
	{
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop)
		{
			System.out.println("Enter the first number : ");
			int a = sc.nextInt();
			System.out.println("Enter the second number :");
			int b = sc.nextInt();
			System.out.println("-------------------------");
			System.out.println("\n1.Addition\n2.Subtraction\n3.Division					\n4.multiplication\n5.Exit");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					int sum=a+b;
					System.out.println("Sum is : "+sum);
					break;
				case 2:
					int diff=a-b;
					System.out.println("Diff is :"+diff);
					break;
				case 3:
					int div=a/b;
					System.out.println("Quotient is:"+div);
					break;
				case 4:
					int pro=a*b;
					System.out.println("product is:"+pro);
					break;
				case 5:
					System.out.println("Exiting :");
					loop = false;
					break;
				default:
					system.out.println("Invalid choice");
			}
		}
	}
}
				