import java.util.Scanner;
public class sum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n = sc.nextInt();
		int sum=0;
		int i;
		for(i=1;i<=n;i++)
		{
			if(i==1)	
			{
				System.out.println("Enter the "+" "+i+" "+"st number");
			}
			else if(i==2)
			{
				System.out.println("Enter the "+" "+i+" "+"nd number");
			}
			else if(i==3)
			{
				System.out.println("Enter the "+" "+i+" "+"rd number");
			}
			else if(i>=4)
			{
				System.out.println("Enter the "+" "+i+" "+"th number");
			}
			int num=sc.nextInt();
			sum=sum+num;
		}
		System.out.println("The sum is " +sum);
	}
}
		