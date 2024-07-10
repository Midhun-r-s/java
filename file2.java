import java.io.*;
import java.awt.Desktop;
class file2
{
	public static void main(String[] args)
	{
		try
			{
				File f0 = new File("D:\\codes\\oops practice\\p.txt");
				if(!Desktop.isDesktopSupported())
				{
					System.out.println("Not suppoprted");
					return;
				}
				Desktop desktop = Desktop.getDesktop();
				if(f0.exists())
				{
					desktop.open(f0);
				}
			}
		catch(IOException e)
			{
				e.printStackTrace();		
			}
	}
}