//demo of  do-while loop with break statement
import java.util.*;
class Demo
{
	public static void main(String[] s)
	{
		int i=0;
		Scanner sc=new Scanner(System.in);
		int pwd;

		do
		{
			System.out.print("enter the password");
			pwd=sc.nextInt();
			if(pwd==123)  
				{System.out.println("correct password ");
				break;}
			else
				System.out.println("incorrect password");
			i=i+1;

				 
		 }while(i<3);

		System.out.println("**************************************");
	}
	
}

