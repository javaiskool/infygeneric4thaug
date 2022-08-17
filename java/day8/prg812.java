// demo of instanceof operator
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
		System.out.println("case 1 reference & object of parent class");
		
 		System.out.println("instance of child class "+(pr1 instanceof Child));
		System.out.println("instance of parent class "+(pr1 instanceof Parent));
		System.out.println("instance of object class "+(pr1 instanceof Object));

		//case 2 reference & object of child class
		Child ch1=new Child();
		System.out.println("case2 reference & object of child class");
		
 		System.out.println("instance of child class "+(ch1 instanceof Child));
		System.out.println("instance of parent class "+(ch1 instanceof Parent));
		System.out.println("instance of object class "+(ch1 instanceof Object));

		//case 3 reference of parent class and object of child class
		Parent pc=new Child();
		System.out.println("case 3 reference of parent class & object of child class");
		
 		System.out.println("instance of child class "+(pc instanceof Child));
		System.out.println("instance of parent class "+(pc instanceof Parent));
		System.out.println("instance of object class "+(pc instanceof Object)); 


	}
}