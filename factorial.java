import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();	
		int temp=num;	
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num=num-1;
		}
		System.out.println("The factorial of"+" "+temp+" "+"is: "+fact);
	}
}	
	