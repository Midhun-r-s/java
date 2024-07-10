import java.util.Scanner;
class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		System.out.println("< ----------------- >");
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int digit = num%10;
			rev=rev*10+digit;
			num = num/10;
		}
		System.out.println("< ----------------- >");
		System.out.println("Reversed number is :"+rev);
		System.out.println("< ----------------- >");
		if(temp==rev)
		{
			System.out.println("< ----------------- >");
			System.out.println(temp+" "+"is palindrome");
			System.out.println("< ----------------- >");
		}
		else
		{
			System.out.println("< ----------------- >");
			System.out.println(temp+" "+"is not palindrome");
			System.out.println("< ----------------- >");
		}
	}
}
		