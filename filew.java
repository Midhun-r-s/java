import java.io.*;
public class filew
{
	public static void main(String[] args)
	{	
		String data = "This is an official message";
		try
		{
			FileWriter f0 = new FileWriter("D:\\codes\\oops practice\\test.txt");
			f0.write(data);
			System.out.println("The data has been written successfully");
			f0.close();
			System.out.println("--------------------------------------");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}