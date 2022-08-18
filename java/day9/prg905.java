// final keyword demo for local variable

class Tester
{
	public static void main(String[] args)
	{
		int x;
		final int Y;
		x=100;
		
		System.out.println("x = "+x);
		//System.out.println("y = "+Y);
		x=500;
		Y=800;

	
		System.out.println("x = "+x);
		System.out.println("y = "+Y);
		//Y=200;
	}
}
