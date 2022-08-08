//demo of  nested loops
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		int n=1;
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=3;c++)
			{
				System.out.print (n+" ");
				n=n+1;
			}
			System.out.println("\n");
		}
		
	}
	
}

/* dry run
r	c	n	o/p
1	1	1	1 2 3
		2    	4 5 6
	2		7 8 9
		3	10 11 12
	3	
		4
	4
2	1	
		5
	2	
		6
	3
		7
	4
3	1		
		8
	2
		9
	3
		10
	4
4	1	
		11
	2
		12
	3
		13
	4
5
*/
	
