import java.util.Scanner;
class swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b= sc.nextInt();
		int temp1=a;
		int temp2=b;
		a=temp2;
		b=temp1;
		System.out.println("The original numbers are :");
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println("---------------------------");
		System.out.println("The swapped numbers are :");
		System.out.println(a);
		System.out.println(b);
	}
}
		