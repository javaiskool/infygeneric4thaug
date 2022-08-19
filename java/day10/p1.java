import java.io.*;

class Demo
{
	private int x;
	private String str;

	public Demo()
	{
		this.x=100;
		this.str="hello";
	}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}
	public String getStr(){return str;}
	public void setStr(String str){this.str=str;}
	public void updateData() throws IOException
	{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		str=br.readLine();

	}
	public void displayData()
	{
		System.out.println(" x = "+this.x);
		System.out.println(" str = "+this.str);
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.displayData();
		try{
		d.updateData();
		d.displayData();
		}
		catch(Exception e)
		{System.out.println("Input error");}

	}
}


		