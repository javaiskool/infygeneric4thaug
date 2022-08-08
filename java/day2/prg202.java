//demo of for loop

class Demo
{
	public static void main(String[] s)
	{
		int i=1;
		System.out.println("before loop");
		for(;i<=5;)
		{
			System.out.println("Hello "+i);
			i=i+1;
		}
		System.out.println("after loop");
		 
	}
}

/* dry run
	before loop
i  	o/p
1  	Hello 1
2 	Hello 2
3	Hello 3
4	Hello 4
5	Hello 5
6
	after loop
*/
