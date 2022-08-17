// static polymorphism (method overloading)  
class Demo
{
	private String msg;

	public Demo()	{this.msg="Hello";} //contructor overloading
	public Demo(String msg){this.msg=msg;} //constructor overloading

	public void setMsg(String msg){this.msg=msg;}
	public String getMsg(){return msg;}
	public void displayMsg() //method overloading
	{
		System.out.println(this.msg);
	}
	/*public int displayMsg()
	{
		System.out.println("tryal message display");
		return 1;
	}*/ // not allowed. method overloading is not recognized by dieerence in return datatype

	public void displayMsg(String name) //method overloading
	{
		System.out.println(msg+name);
	}
	public int  displayMsg(int time) //method overloading
	{
		if (time<1 || time>24)
		System.out.println("hello");
		else
		{
			if(time<12)
			System.out.println(msg+" Good Morning ");
			else
			if(time<16)
			System.out.println(msg+" Good Afternoon");

		}
		return 1;
	}
	public void displayMsg(int time,String name)
	{
		System.out.println(msg+name+"time "+time);
	}
	public void displayMsg(String name,int time)
	{
		System.out.println("time : "+time);
		System.out.println(msg+name);
	}
	
}

class Tester
{
	public static void main(String [] args)
	{
		Demo d1=new Demo();
		d1.displayMsg();
		d1.displayMsg("Suman");
		d1.displayMsg(10);
		d1.displayMsg("Harry ",12);
		d1.displayMsg(99,"Potter");
	}	
}