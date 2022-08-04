// type conversion
class Demo
{
	public static void main(String[] args)
	{
		int x=10,y=2,z;
		float f=5.0f,e=2.5f,g;
		 
		System.out.println(x/y);   
		System.out.println(x/e);   
		System.out.println(f/e);   
		System.out.println("*********************" );  
		z=x/y;
		System.out.println(z);
		z=x/(int)e;
		System.out.println(z);
		z=(int)(f/e);
 		System.out.println(z);
		System.out.println("*********************" );  
		g=x/y;
		System.out.println(g);
		g=x/e;
		System.out.println(g);
		g=f/e;
		System.out.println(g);
	
	}
}