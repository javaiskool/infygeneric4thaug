//demo of  for loop
import java.util.*;

class Demo
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		String sports;
		int fc=0,tc=0,cc=0,nc=0;
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter your favourite sport ");
			sports=sc.next();
			switch (sports)
			{
			default : nc=nc+1;
					break;
			case "FOOTBALL": fc=fc+1;  
					 break;
			case "CRICKET": cc=cc+1;
					 break;
			case "TENNIS": tc=tc+1;
					break;
			
		 	}	
		}
		System.out.println("Football "+fc);
		System.out.println("Cricket "+cc);
		System.out.println("Tennis "+tc);
		System.out.println("none "+nc);
	 
	}
	
}

