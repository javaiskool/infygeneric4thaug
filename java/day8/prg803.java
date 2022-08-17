// static polymorphism (constructor overloading)  
class Demo
{
	private String msg;
	private int id;
	private float amt;
	 

	public Demo()	
	
	{
		this.msg="Hello";
		this.id=101;
		this.amt=10000.00f;	
	}  
	public Demo(String msg)
	{
		this.msg=msg;
		this.id=201;
		this.amt=20000.00f;
	}  
	public Demo(String msg,float amt)
	{
		this.msg=msg;
		this.amt=amt;
	}
	public Demo(float amt,int id)
	{
		this.amt=amt;
		this.id=id;
	}
	public Demo(float amt, String msg,int id)
	{
		this.msg=msg;
		this.id=id;
		this.amt=amt;
	}
	public void displayAll()
	{
		System.out.println("message : "+this.msg);
		System.out.println("id       : "+this.id);
		System.out.println("amount = "+this.amt);
		System.out.println("\n###################################\n\n");
	}
	
}

class Tester
{
	public static void main(String [] args)
	{
		Demo d1=new Demo();
		Demo d2=new Demo(40000.00f,"Welcome",501);
		Demo d3=new Demo("happy learning",60000.00f);
		Demo d4=new Demo(77000.00f,301);
		Demo d5=new Demo("have a good day");

		d1.displayAll();
		d2.displayAll();
		d3.displayAll();
		d5.displayAll();
		d4.displayAll();
	}	
}