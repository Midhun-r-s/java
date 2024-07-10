import java.io.*;
class file1
{
	public static void main(String[] args)
	{
		try
		   {
			File f0 = new File("D:\\codes\\oops practice\\p.txt");
			if(f0.createNewFile())
			{
				System.out.println("File"+" "+f0.getName()+" "+"is created successfully");
			}
			else
			{
				System.out.println("File"+" "+f0.getName()+" "+"already exist");
			}
		    }
		catch(IOException exp)
		   {
			System.out.println("An error occured");
			exp.printStackTrace();
		   }
	}
}
	
