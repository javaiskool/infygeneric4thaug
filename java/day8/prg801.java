// static polymorphism scenario
class Demo
{
	private String msg;
	public Demo()	{this.msg="Hello";}
	public Demo(String msg){this.msg=msg;}
	public void setMsg(String msg){this.msg=msg;}
	public String getMsg(){return msg;}
	public void displayMsg()
	{
		System.out.println(this.msg);
	}
	public void displayMsgWithName(String name)
	{
		System.out.println(msg+name);
	}
	public void displayMsgWithTime(int time)
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
	}
}

class Tester
{
	public static void main(String [] args)
	{
		Demo d1=new Demo();
		d1.displayMsg();
		d1.displayMsgWithName("Suman");
		d1.displayMsgWithTime(10);
	}	
}