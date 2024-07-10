import java.io.*;
class file4
{
	public static void main(String[] args)
	{	
		String data = "This is an official message";
		char[] array = new char[200];
		try
			{
				FileWriter f0 = new FileWriter("D:\\codes\\oops practice\\m.txt");
				f0.write(data);
				System.out.println("The data has been written successfully");
				f0.close();
				System.out.println("--------------------------------------");
				FileReader f1 = new FileReader("D:\\codes\\oops practice\\m.txt");
				f1.read(array);		
				System.out.println("The data in file  is given below :");
				System.out.println(array);
				f1.close();
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}