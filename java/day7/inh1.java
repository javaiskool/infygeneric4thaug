class Parent
{
	private int pv;
	protected int pt;
	int pk;
	public int pb;

	public Parent()
	{ 
		this.pv=1;
		this.pt=2;
		this.pk=3;
		this.pb=4;
	}
	public int getPV(){return pv;}
	public void displayParent()
	{
		System.out.println("private pv = "+this.pv);
		System.out.println("protected pt = "+this.pt);
		System.out.println("default/package pk = "+this.pk);
		System.out.println("public pb = "+this.pb);
	}
	
}
class Child extends Parent
{
	private int y;
	public Child(){this.y=100;}
	public void dispY(){System.out.println(" y = "+this.y);}
	public void displayAll()
	{
		//System.out.println("private pv = "+this.pv); // only non-private properties of parent class are directly accessible
		System.out.println("private pv = "+this.getPV()); // private properties of parent class are accessible through non-private methods of parent class
		System.out.println("protected pt = "+this.pt);
		System.out.println("default/package pk = "+this.pk);
		System.out.println("public pb = "+this.pb);
		System.out.println(" y = "+this.y);
	}
	
}
class Demo
{
	public static void main(String[] args)
	{
		Parent p1=new Parent();
		p1.displayParent();
		//p1.dispY(); // properties of child class are not accessible to parent class
		Child ch1=new Child();
		ch1.displayParent();
		ch1.dispY();
		ch1.displayAll();
		

	}
}

