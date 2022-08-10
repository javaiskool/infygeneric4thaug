//array with user input
import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter a number");
			a[i]=sc.nextInt();
		}
		for(int n:a)
		System.out.println(n);
		
	}
}

