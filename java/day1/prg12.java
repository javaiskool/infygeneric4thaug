// increment decrement operator
class Demo
{
	public static void main(String[] args)
	{
		int x,y;
		x=4;
		y=++x; //=> increment value of x then assign value of x to y
		System.out.println(x); //5
		System.out.println(y); //5
		 
		x=4;
		y=x++; //=> assign value of x to y then increment value of x
		System.out.println(x); //5
		System.out.println(y); //4
	}
}