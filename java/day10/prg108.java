// exception handling
import java.io.*;

class Tester
{
	public static void main(String[] s)
	{
		String str; int x;
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		str=br.readLine();
		System.out.println("string str = "+str);
		System.out.println("enter a numeric string");
		str=br.readLine();
		x=Integer.parseInt(str);
		System.out.println("number x = "+x);
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
		System.out.println("program execution continues");
	}
}
