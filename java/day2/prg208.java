//demo of  continue
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		 int i,sum;
		i=1;sum=0;
		for(;i<=20;i++)
		{
			
			if(i%3==0)
				continue;
			System.out.println(i);
			sum=sum+i;
			if(sum>100)
				break;
		}
		System.out.println("sum of first 10 natural numbers = "+sum);
		
	}
	
}

