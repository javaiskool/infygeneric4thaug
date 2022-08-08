//demo of  while loop
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("multiplication table of a number between 2-30");
		n=sc.nextInt();
		int i=1; 
		while(i<=10)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
			i=i+1;
				
		 }
	System.out.println("**************************************");
	}
	
}

