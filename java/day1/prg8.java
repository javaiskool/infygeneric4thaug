// arithmetic operators + - * / %

class Demo
{
	public static void main(String[] args)
	{
		int x=6,y=5,z=8;

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println("************************");
		System.out.println(x+y+z+10);
		System.out.println(x-y-z);
		System.out.println(x*y*z*10);
		System.out.println(x/y/z);
		System.out.println(x%y%z);
		System.out.println("************************");
		float f1=3.2f,f2=1.6f;
		System.out.println(f1+f2);
		System.out.println(f1-f2);
		System.out.println(f1*f2);
		System.out.println(f1/f2);
		System.out.println(f1%f2);
		System.out.println("************************");
		System.out.println(f1+x);
		System.out.println(f1-x);
		System.out.println(f1*x);
		System.out.println(f1/x);
		System.out.println(f1%x);
		System.out.println("************************");
		System.out.println(x+f1);
		System.out.println(x-f1);
		System.out.println(x*f1);
		System.out.println(x/f1);
		System.out.println(x%f1);
		System.out.println("************************");
		System.out.println(x+y-z*10/2);
	}
}