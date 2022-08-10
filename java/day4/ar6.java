//double dimensional array

class Demo
{
	public static void main(String args[])
	{
		int n=1;
		int[][] dr=new int[3][4];
		for(int r=0;r<dr.length;r++)
		{
			for(int c=0;c<dr[r].length;c++)
				{dr[r][c]=n*100;
				n=n+1;}
		}
		for(int[] ar:dr)
		{
			for(int e:ar)
				System.out.print(e+"\t");
			System.out.println("\n");
		}
		
	}
}

