//demo of  switch case

class Demo
{
	public static void main(String[] s)
	{
		String sports="FOOTBALL";
		System.out.print("My favourite sports is ");
		switch (sports)
		{
			default : System.out.println(" none of the given options");
	break;
			case "FOOTBALL": System.out.println("FOOTBALL");
					System.out.println("and favourite Player is Messi");
					 
					break;
			case "CRICKET": System.out.println("CRICKET");
					System.out.println("and favourite Player is Sachin");
					 break;
			case "TENNIS": System.out.println("TENNIS");
					System.out.println("and favourite Player is Sania");
					break;
			
		 }
	System.out.println("**************************************");
	}
	
}

