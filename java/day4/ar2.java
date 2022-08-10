
class Demo
{
	public static void main(String s[])
	{
		int a[]={5,90,0,-200,5021};
		
		System.out.println("array values at even index"); 
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(i+" "+a[i]);
		}
		System.out.println("array values at odd index"); 
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println(i+" "+a[i]);
		}
		System.out.println("array : even values"); 
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%2==0)
			System.out.println(i+" "+a[i]);
		}
		System.out.println("array : odd values"); 
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%2!=0)
			System.out.println(i+" "+a[i]);
		}
	}
}


