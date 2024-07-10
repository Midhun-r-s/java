import java.io.*;
class copyfile
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream r = new FileInputStream("D:\\codes\\oops practice\\a.txt");
			FileOutputStream w = new FileOutputStream("D:\\codes\\oops practice\\output.txt");
		
			int i;
			while((i=r.read())!=-1)
			{
				w.write((char)i);
			}
			System.out.println("Data copied successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
			