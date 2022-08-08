//demo of  while loop
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		int x,y;
		x=10;y=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("do you to p[erform arithmetic operation?");
		char ch;
		ch=sc.next().charAt(0);
		while(ch=='y'||ch=='Y')
		{
				System.out.println(x+" + "+y+" = "+(x+y));
				System.out.println(x+" - "+y+" = "+(x-y));
				System.out.println(x+" * "+y+" = "+(x*y));
				if (y==0)
				System.out.println("division by zero not defined");
				else
				System.out.println(x+" / "+y+" = "+(x/y));
				System.out.println("continue?(y/n)");
				ch=sc.next().charAt(0);		
		 }
	System.out.println("**************************************");
	}
	
}

