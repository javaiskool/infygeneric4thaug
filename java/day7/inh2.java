// inheritance demo  example 2 constructors 

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
		System.out.println("constructor of child class");
		this.y=100;
	}
	public void dispY()
	{
		System.out.println(" y = "+this.y);
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Child ch1=new Child();
		 
	}
}

