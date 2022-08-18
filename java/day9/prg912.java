//demo of interface

interface Inf1
{
	int X=4; // implicitlt the members are public, static and final
	void displayX(); // implicitly the method is public and abstract
}
class A implements Inf1
{
	public void displayX(){System.out.println(" x in A "+X);}
	void displayMSG(){System.out.println("hello");}
}
abstract class B implements Inf1
{
	public void display(){System.out.println("x in B "+X);}
}

class Tester
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.displayX();
		a1.displayMSG();
		B b1;	
	}
}

