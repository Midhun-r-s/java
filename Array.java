import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = sc.nextInt();
		int i;
		int[] array = new int[n];
		System.out.println("Enter the numbers : ");
		for(i=0;i<n;i++)
		{
			int a=sc.nextInt();
			array[i]=a;
		}
		System.out.println("The array is :");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
}
		
		
		