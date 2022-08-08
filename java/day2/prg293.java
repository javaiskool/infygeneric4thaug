//demo of  switch case 
import java.util.*; 
class Demo
{
	public static void main(String[] s)
	{
		int x,y,opr;
		//x=10;y=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number x : ");
		x=sc.nextInt();
		System.out.println("enter a number y : ");
		y=sc.nextInt();
		System.out.print("Enter arithmetic operation 1/2/3/4 ");
		opr=sc.nextInt();
		switch (opr)
		{
			 
			case 1:
				System.out.println(x+" + "+y+" = "+(x+y));
					break;
			case 2:
				System.out.println(x+" - "+y+" = "+(x-y));
					break;
			case 3:
				System.out.println(x+" * "+y+" = "+(x*y));
					break;
			case 4:
				if (y==0)
				System.out.println("division by zero not defined");
				else
				System.out.println(x+" / "+y+" = "+(x/y));
					break;
			 
			default : System.out.println(" invalid");
			break;
			
		 }
	System.out.println("**************************************");
	}
	
}

