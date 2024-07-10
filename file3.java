import java.io.*;
import java.awt.Desktop;
class file3
{
	public static void main(String[] args)
	{
		String data = "Data manipulated";
		try
		{
			FileWriter f0 = new FileWriter("D:\\codes\\oops practice\\m.txt");
			f0.write(data);
			System.out.println("The data has been entered  successfully");
			f0.close();
			File f1 = new File("D:\\codes\\oops practice\\m.txt");
			if(!Desktop.isDesktopSupported())
			{
				System.out.println("No supported");
				return;
			}
			Desktop desktop  = Desktop.getDesktop();
			if(f1.exists())
			{
				desktop.open(f1);
			}

		}
		catch(IOException e)
		{	
			e.printStackTrace();
		}
	}
}
			
			