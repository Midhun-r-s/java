import java.io.FileReader;
import java.io.IOException;
public class filer
{
	public static void main(String[] args)
	{
		char[] arr = new char[200];
		try
		{
			FileReader f0= new FileReader("D:\\codes\\oops practice\\test.txt");
			f0.read(arr);
			System.out.println(arr);
			f0.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
		