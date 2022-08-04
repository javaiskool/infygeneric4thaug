// assignment operators += -= *= /= %= 
// x+=y => x=x+y
class Demo
{
	public static void main(String[] args)
	{
		int x=4,y=2;
		x=4;
		 
		System.out.println(x+=y);  //x=x+y => x=4+2 => 6
		System.out.println(x-=y);  //x=x-y => x=6-2 => 4
		System.out.println(x*=y);  //x=x*y => x=4*4 =>8
		System.out.println(x/=y);  //x=x/y => x=8/2 => 4
	}
}