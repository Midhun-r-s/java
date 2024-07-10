import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
class file
{
	public static void main(String[] args)
	{	
		String data="Hello! World";
		try
		{
			File f0=new File("D:\\codes\\oops practice\\test.txt"); 	
			FileWriter f1 = new FileWriter("D:\\codes\\oops practice\\test.txt");
			f1.write(data);	
			System.out.println("Data is written to the file"+" "+f0.getName());
	
		}
		catch(IOException ex)
		{
			ex.printStackTrace();		
		}
	}
}
		