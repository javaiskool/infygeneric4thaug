//demo of  all three loops 
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		 int i,sum;
		i=1;sum=0;
		for(;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of first 10 natural numbers = "+sum);
		i=1;sum=0;
		while(i<=10)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println("sum of first 10 natural numbers = "+sum);
		i=1;sum=0;
		do
		{
			sum=sum+i;
			i=i+1;
		}while(i<=10);
		System.out.println("sum of first 10 natural numbers = "+sum);
	}
	
}

