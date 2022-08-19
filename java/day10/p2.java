import java.io.*;

class Demo
{
	private int x;
	

	public Demo()
	{
		this.x=100;
		
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}
	
	public void updateData() throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		

	}
	public void displayX()
	{
		System.out.println(" x = "+this.x);
		
	}
	
}
class Child extends Demo
{
	private String str;
	public Child(){this.str="Welcome";}
	public String getStr(){return str;}
	public void setStr(String str){this.str=str;}
	
	public void displayStr()
	{
		System.out.println(" str = "+this.str);
	}
	public void updateData()  
	{
		this.str=this.str+" ALL";
	}
	public void displayData()
	{
		displayX();
		displayStr();
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.displayData();
		 
		c.updateData();
		c.displayData();
		 
		 
		/*catch(Exception e)
		{System.out.println("Input error");}*/

	}
}


		