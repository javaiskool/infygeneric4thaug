// exception handling

class Tester
{
	public static void main(String[] s)
	{
		 
		int n1=2,n2=50,sum=0;
		try{
		for(int i=n1;i<n2;i++)
		{
			sum+=i;
			System.out.println("sum = "+sum);
			if (sum>70) throw new ArithmeticException("sum out of range");
			
		}
		System.out.println("****");	
		}
		catch(ArithmeticException ae)
			{System.out.println(ae);}
 		System.out.println("program execution continues");
		 
	}
}
