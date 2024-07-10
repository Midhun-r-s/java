import java.io.*;
import java.awt.Desktop;
class file5
{
	public static void main(String[] args)
	{
		String data = "This is an official message";
		char[] array = new char[200];
		try
			{
				File f0=new File("D:\\codes\\oops practice\\a.txt");
				if(f0.createNewFile())
				{
					System.out.println("The file"+" "+f0.getName()+" "+"is created successfully");
					System.out.println("-------------------------------------------");

				}
				else
				{
					System.out.println("The file"+" "+f0.getName()+" "+"already exist");
					System.out.println("-------------------------------------------");

				}
				FileWriter f1=new FileWriter("D:\\codes\\oops practice\\a.txt");
				f1.write(data);
				System.out.println("Data is written into"+" "+f0.getName()+" "+"successfully");
				System.out.println("-------------------------------------------");
				f1.close();
				FileReader f2=new FileReader("D:\\codes\\oops practice\\a.txt");
				f2.read(array);
				System.out.println("Data of"+" "+f0.getName()+" "+"is given below:");
				System.out.println(" ");
				System.out.println(array);
				System.out.println("-------------------------------------------");
				f2.close();
				File f3=new File("D:\\codes\\oops practice\\a.txt");
				if(!Desktop.isDesktopSupported())
				{
					System.out.println("Not supported");
					return;
				}
				Desktop desktop = Desktop.getDesktop();
				if(f3.exists())
				{
					desktop.open(f3);
				}
				else
				{
					System.out.println("File"+" "+f3.getName()+" "+"does not exist");
				}
			}
		catch(IOException e)
			{
				e.printStackTrace();
			}
	}
}
