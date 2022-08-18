//demo of interface

interface Inf1
{
	int X=4; // implicitlt the members are public, static and final
	void displayX(); // implicitly the method is public and abstract
}
interface Inf2
{
	int Y=100;
	void displayY();
}

class A implements Inf1,Inf2 // implements keyword is used to inherit interface to the class
{
	public void displayX(){System.out.println(" x from inf1 "+X);}
	public void displayY(){System.out.println("y from inf2 "+Y);}
	void displayMSG(){System.out.println("hello");}
}
 

class Tester
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.displayX();
		a1.displayY();
		a1.displayMSG();
		
	}
}

