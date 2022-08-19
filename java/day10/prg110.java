// exception handling
import java.io.*;

class Demo
{
	private int x;
	public Demo(){this.x=100;}
	public void updateX() throws IOException 
	{
		String str; int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a numeric string");
		str=br.readLine();
		try{
		this.x=Integer.parseInt(str);
		}
		catch(NumberFormatException ne){System.out.println("invalid nunber");}
	}
	public void displayX()
	{
		System.out.println(" x = "+x);
	}
}	 
	
class Tester
{
	public static void main(String[] s) throws Exception
	{
		Demo d=new Demo();
		d.displayX();
		d.updateX();
		d.displayX();
	}
}
