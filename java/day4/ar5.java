//double dimensional array

class Demo
{
	public static void main(String args[])
	{
		int n=1;
		int[][] dr={{2,5},{7},{90,0,1000}};
		
		for(int r=0;r<dr.length;r++)
		{
			for(int c=0;c<dr[r].length;c++)
				System.out.print(dr[r][c]+"\t");
			System.out.println("\n");
		}
		
	}
}

