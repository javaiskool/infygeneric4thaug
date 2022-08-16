// inheritance demo  example 4 static block

class Parent
{
	private int pv;
	private static int cnt;
	
	static
	{
		System.out.println("static block of parent class");
		cnt=10001;
	}
	public Parent()
	{ 
		System.out.println("parameterless constructor of parent class");
		this.pv=1;
		
	}
	public Parent(int pv)
	{ 
		System.out.println("parameterised constructor of parent class");
		this.pv=pv;
		
	}

	public int getPV(){return pv;}
	public void setPV(int pv){this.pv=pv;}

	public void displayParent()
	{
		System.out.println("private pv = "+this.pv);
	}
	
}
class Child extends Parent
{
	private int y;
	
	static
	{
		System.out.println("static block of child class");
	}
	public Child()
	{
		super(555); // to call parameterized constructor of parent class 
		System.out.println("constructor of child class");
		this.y=100;
		// super(444); // call to super should be the first statement

	}
	public void display()
	{
		System.out.println(" pv = "+this.getPV());
		System.out.println(" y = "+this.y);
	}
}
class Demo
{
	static
	{
		System.out.println("static block of demo class");
		 
	}
	public static void main(String[] args)
	{
		Child ch1=new Child();
		ch1.display();
		 
	}
}

