//demo of multiple conditions with if 

class Demo
{
	public static void main(String[] s)
	{
		int x=-90;
		System.out.println("statements before if");
		if(x>0 && x%2==0)
		{
			System.out.println("x is an even positive number");
		}
		if(x>0 && x%2!=0)
		{
			System.out.println("x is an odd positive number");
		}
		if(x<0 && x%2==0)
		{
			System.out.println("x is an even negative number");
		}
		if(x<0 && x%2!=0)
		{
			System.out.println("x is an odd negative number");
		} 
		if (x==0)
		{
			System.out.println("x is zero");
		}
		System.out.println("statements after if");

	}
}

