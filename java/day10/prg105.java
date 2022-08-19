// exception handling

class Tester
{
	public static void main(String[] s)
	{
		int a,b,c=0;
		a=6;
		b=3;
		try
		{
		System.out.println("in a try block");
		System.out.println("a/b = "+(a/b));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("division by zero not allowed");
		}
		try
		{
		int[] ar={6,2,0,8};
		for(int i=0;i<=ar.length;i++)
		System.out.println("ar[i] = "+ar[i]);
		System.out.println("end of try");
		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
			System.out.println("accessing array beyond limit");}
		catch(Exception e)
		{
			System.out.println("some error occured");	
		}
		finally
		{
			System.out.println("finally block, closing task");
		}
		System.out.println("Ececution continues after try");
		String str="1234";
		int x=Integer.parseInt(str);
		System.out.println("numric string "+str+" number "+x);
		Tester t=null;
		System.out.println(" t = "+t);
		System.out.println("c = "+c);
		System.out.println("end of the program");


	}
}
