// inheritance demo  example 5 constructors

class Parent
{
	 private int pv;
	 
	public Parent()
	{ 
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
	private int pv;
	
	 
	public Child()
	{
		super(555); // to call parameterized constructor of parent class 
		 
		this.pv=100;
		// super(444); // call to super should be the first statement

	}
	public Child (int x)
	{
		super(x);
		 
		this.pv=1000;
	}
	public Child (int x,int pv)
	{
		super(x);
		this.pv=pv;
		
	}
	public void display()
	{
		// System.out.println(" parent class pv = "+super.pv);// if pv in parent class is non-private
		System.out.println("parent class pv = "+getPV());
		System.out.println(" child class pv = "+this.pv);
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
		Child ch2=new Child(60);
		Child ch3=new Child(44,55);
		ch1.display();
		ch2.display();
		ch3.display();
		
		 
	}
}

