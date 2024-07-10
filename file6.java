import java.io.*;
import java.awt.Desktop;
class file6
{
	public static void main(String[] args)
	{
		try
		{
			File f0=new File("D:\\codes\\oops practice\\test.txt");
			if(!Desktop.isDesktopSupported())
			{
				System.out.println("Not supported");
			}
			Desktop desktop=Desktop.getDesktop();
			if(f0.exists())
			{
				desktop.open(f0);
			}
			else
			{
				System.out.println("File doesnot exist");
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}