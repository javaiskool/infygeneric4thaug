//demo of  nested if 

class Demo
{
	public static void main(String[] s)
	{
		int x=-90;
		System.out.println("statements before if");
		if(x>0)
		if(x%2==0)
		{System.out.println(x+ " is an even positive number");}
		else
		{System.out.println(x+ " is an odd positive number");}		
		else
		{if(x<0)
		if(x%2==0)
		System.out.println(x+ " is an even negative number");
		else
		System.out.println(x+ " is an odd negative number");}
		if (x==0)
		System.out.println("x is zero");
		
		System.out.println("statements after if");

	}
}

