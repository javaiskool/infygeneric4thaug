// demo of super keyword for using variable of parent class in child class method where variable name is same
class Parent
{
	int x;
	public Parent(){this.x=100;}
	public void setX(int x){this.x=x;}
	public int getX(){return x;}
	public void displayPX()
	{
		System.out.println(" x = "+this.x);
	}
	 
}
class Child extends Parent
{
	int x;
	public Child(){this.x=200;}
	public void setX(int y){this.x=x;}
	public int getX(){return x;}
	public void displayCX()
	{
		System.out.println(" x = "+this.x);
	}
	 
	public void displayAll()
	{
		System.out.println(" x in Parent class = "+super.x);
		System.out.println(" x in Child class = "+this.x);
	}	
}
class Tester
{
	public static void main(String[] args)
	{
		 
		Child ch1=new Child();
		ch1.displayPX();
		ch1.displayCX();
		ch1.displayAll();

		 

	}
}