abstract class Demo
{
	private int x;
	public Demo(){x=100;}
	public Demo(int x)
	{this.x=x;}
	public void setX(int x){this.x=x;}
	public int getX(){return x;}
	public void displayX()
	{
		System.out.println("x = "+this.x);
	}
	abstract public void calculateX();

}
class Sqrx extends Demo
{
	private int y;
	
	public Sqrx(int x,int y)
	{super(x);this.y=y;}
	public void setY(int y){this.y=y;}
	public int getY(){return y;}
	public void displayY()
	{
		System.out.println(" y = "+this.y);
	}
	public void displayXY()
	{
		displayX();
		displayY();
	}
	public void calculateX()
	{
		System.out.println(" x square "+(getX()*getX()));
	}
	public void calculateX(int s)
	{
		System.out.println("s = "+s);
	}

}
abstract class Temp extends Demo
{
	public void calculate()
	{
		System.out.println("hello");
	}
}
	
class Tester
{
	public static void main(String[] args)
	{
		Sqrx s1=new Sqrx(5,10);
		s1.displayX();	
		s1.calculateX();	
		s1.calculateX(5);
		s1.displayY();
		s1.displayXY();

		Temp t=new Temp();
		t.calculate();
		
	}
}

