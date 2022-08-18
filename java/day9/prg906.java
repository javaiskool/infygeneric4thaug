// final keyword for member variables of the class
class Demo
{
	final private int A;
	final static private int B;
	public Demo(){this.A=400;}
	static{B=9999;}
	//public void setA(int A){this.A=A;}
	public int getA(){return A;}
	//public static void setB(int B){Demo.B=B;}
	public static int getB(){return B;}
	public void displayAB()
	{
		//this.a=700;
		System.out.println("a = "+this.A);
		System.out.println("b = "+Demo.B);
	}
}
	
class Tester
{
	public static void main(String[] args)
	{
		 Demo d1=new Demo();
		d1.displayAB();

	}
}
