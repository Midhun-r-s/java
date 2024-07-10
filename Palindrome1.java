import java.util.Scanner;
class Palindrome1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);			
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("The reversed number is: "+rev);
		System.out.println("------------------------");

		if(temp == rev)
		{
			System.out.println("The number is palindrome");
		}
		else
		{			
			System.out.println("The number is not palindrome");
		}
	}
}