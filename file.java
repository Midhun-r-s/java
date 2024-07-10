import java.io.File;
import java.io.IOException;
class file
{
	public static void main(String[] args)
	{
		try
		{
			File f0 = new File("D:\\codes\\oops practice\\test.txt");
			if(f0.createNewFile())
			{	
				System.out.println("The file "+" "+f0.getName()+" "+"created");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}	
