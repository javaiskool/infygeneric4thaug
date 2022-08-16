// inheritance demo  example 3 parameterized constructor of parent

class Parent
{
	private int pv;
	
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
	public Child()
	{
		//super(555); // to call parameterized constructor of parent class 
		System.out.println("constructor of child class");
		this.y=100;
		super(444);
	}
	public void display()
	{
		System.out.println(" pv = "+this.getPV());
		System.out.println(" y = "+this.y);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Child ch1=new Child();
		ch1.display();
		 
	}
}

