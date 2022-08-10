class Demo
{
	public static void main(String s[])
	{
		int num=121221;//461,6340,19,46139
		int lnum=0;
		int counter=1;
		int i,temp,digit;
		for(i=num;i>0;i=i/10,counter++){}
		counter--;
		//System.out.println(counter);
		temp=num;
		while(temp>0)
		{
			digit=temp%10;
			//System.out.println(digit+" "+counter);
			if(counter%2==0)
			lnum=lnum+(digit*digit);
			temp=temp/10;
			counter=counter-1;
		}
		if(lnum%9==0)
		System.out.println(num+" is a lucky number");
	}
		
}
 
		