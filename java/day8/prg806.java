// demo of method overrridding child class cannot have weaker access modifier for oveerridden method
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
	void displayMsg() // generates error due to weaker access modifier
	{
		System.out.println("Happy Learning");
	}
}
class Tester
{
	public static void main(String[] args)
	{
		 
		Child ch1=new Child();
		ch1.displayX();
		ch1.displayY();
		ch1.displayMsg();

		 

	}
}