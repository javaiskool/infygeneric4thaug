// demo of method overrridding cases 
class Parent
{
	private int x;
	public Parent(){this.x=100;}
	public void setX(int x){this.x=x;}
	public int getX(){return x;}
	public void displayX()
	{
		System.out.println(" x = "+this.x);
	}
	void displayMsg()
	{
		System.out.println("Welcome to Java");
	}
}
class Child extends Parent
{
	private int y;
	public Child(){this.y=200;}
	public void setY(int y){this.y=y;}
	public int getY(){return y;}
	public void displayY()
	{
		System.out.println(" y = "+this.y);
	}
	void displayMsg()
	{
		System.out.println("Happy Learning");
	}
}
class Tester
{
	public static void main(String[] args)
	{
		//case 1 reference & object of parent class
		Parent pr1=new Parent();
		pr1.displayX();
		//pr1.displayY();
		pr1.displayMsg();

		//case 2 reference & object of child class
		Child ch1=new Child();
		ch1.displayX();
		ch1.displayY();
		ch1.displayMsg();

		//case 3 reference of parent class and object of child class
		Parent pc=new Child();
		pc.displayX();
		//pc.displayY();
		pc.displayMsg();


	}
}