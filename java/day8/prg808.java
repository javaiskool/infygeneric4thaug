// demo of method overrridding if return type in overridden method is not compatible, an error is generated  
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
	public void displayMsg()
	{
		System.out.println("Welcome to Java");
		return 1;
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
	public int displayMsg() // generates error as return type is not compatible
	{
		System.out.println("Happy Learning");
		return 1;
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