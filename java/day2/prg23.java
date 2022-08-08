//demo of nested if 

class Demo
{
	public static void main(String[] s)
	{
		int x=80;
		System.out.println("statements before if");
		if(x>0)
		{
			System.out.println("x is positive number");
		}
		else
		{
			if(x<0)
			{
				System.out.println("x is a negative number");
			}
			else
			{
				System.out.println("x is zero");
			}
		}
		System.out.println("statements after if");

	}
}

