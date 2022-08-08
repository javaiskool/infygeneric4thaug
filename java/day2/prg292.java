//demo of  switch case
 
class Demo
{
	public static void main(String[] s)
	{
		int x,y,opr=4;
		x=10;y=2;
		Scanner sc=new Scanner(System.in);
		System.out.print("arithmetic operation ");
		
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

