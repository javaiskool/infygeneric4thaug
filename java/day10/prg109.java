// exception handling
import java.io.*;

class Tester
{
	public static void main(String[] s) throws Exception
	{
		String str; int x;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a string");
		str=br.readLine();
		System.out.println("string str = "+str);
		System.out.println("enter a numeric string");
		str=br.readLine();
		try{
		x=Integer.parseInt(str);
		System.out.println("number x = "+x);
		}
		catch(NumberFormatException ne){System.out.println("invalid nunber");}
		System.out.println("program execution continues");
	}
}
