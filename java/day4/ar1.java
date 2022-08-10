//array with user input

class Demo
{
	public static void main(String args[])
	{
		
		int[] a=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=i+100;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" "+a[i]);
		}
		
	}
}

