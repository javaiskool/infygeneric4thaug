// final keyword for method of the class
class Parent
{
	private int a;
	static private int b;
	public Parent(){this.a=400;}
	static{b=9999;}
	public void setA(int a){this.a=a;}
	public int getA(){return a;}
	public static void setB(int b){Parent.b=b;}
	public static int getB(){return b;}
	public void displayAB()
	{
		this.a=700;
		System.out.println("a = "+this.a);
		System.out.println("b = "+Parent.b);
	}
	final public void dispMsg()
	{
		System.out.println("Hello! Welcome to JAVA");
	}
}
class Child extends Parent
{
	private int x;
	public Child(){this.x=5000;}
	public void setX(int x){this.x=x;}
	public int getX(){return x;}
	public void displayX()
	{
		System.out.println("x = "+this.x);
	}
	//public void dispMsg()
	public void dispCmsg()
	{
		System.out.println("HAPPY LEARNING");
	}
}
	
class Tester
{
	public static void main(String[] args)
	{
		Child ch=new Child();
		ch.displayX();
		ch.dispMsg();
		ch.dispCmsg();
		ch.displayAB();

	}
}
