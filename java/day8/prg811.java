// demo of super keyword for constructorvariable name is same
class Parent
{
	int x;
	public Parent(){this.x=100;}
	public Parent(int x){this.x=x;}
	public void setX(int x){this.x=x;}
	public int getX(){return x;}
	public void displayX()
	{
		System.out.println(" x = "+this.x);
	}
	 
}
class Child extends Parent
{
	int y;
	public Child(){this.y=200;}
	public Child(int x){super(x);this.y=4000;}
	public Child(int x,int y){super(x);this.y=y;}
	public void setY(int y){this.y=y;}
	public int getY(){return y;}
	public void displayY()
	{
		System.out.println(" y = "+this.y);
	}
	public void displayXY()
	{
		super.displayX();
		this.displayY();
	}

}
class Tester
{
	public static void main(String[] args)
	{
		 
		Child ch1=new Child();
		Child ch2=new Child(3000);
		Child ch3=new Child(15000,50000);
		ch1.displayXY();
		ch2.displayXY();
		ch3.displayXY();
	}
}