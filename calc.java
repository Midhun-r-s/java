import java.util.Scanner;
class calc
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("CALCULATOR");
		System.out.println("-----------");
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.Addition\n2.Susbtraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter your choice : ");
			int opt = sc.nextInt();
			int result;
			switch(opt)
			{
				case 1:
					result=a+b;
					System.out.println("The sum of"+" "+a+" "+"and"+" "+b+" "+"is :"+" "+result);
					System.out.println("-------------------------------------------------------");
					break;
				case 2:
					result=a-b;
					System.out.println("The difference of"+" "+a+" "+"and"+" "+b+" "+"is :"+" "+result);
					System.out.println("-------------------------------------------------------");
					break;	
				case 3:
     					result=a*b;
					System.out.println("The product of"+" "+a+" "+"and"+" "+b+" "+"is :"+" "+result);
					System.out.println("-------------------------------------------------------");
					break;
				case 4:
					float result1=a/b;
					System.out.println("The quotient of"+" "+a+" "+"and"+" "+b+" "+"is :"+" "+result1);
					System.out.println("-------------------------------------------------------");
					break;
				case 5:
					System.out.println("Exiting.....");
					System.out.println("------------");
					loop=false;
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}
}