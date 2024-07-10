import java.util.Scanner;
class Fibanocci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the count of Fibanocci numbers: ");
		int n = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for( int i=3;i<=n;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
		