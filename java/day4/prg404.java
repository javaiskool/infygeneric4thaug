// array as instance variable in a class with scanner
import java.util.*;
class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private long contacts[];

	public Emp(int empNo,String empName,float salary,long contacts[])
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.contacts=contacts;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public int getEmpNo(){return this.empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return this.empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return this.salary;}
		
	public long[] getContacts(){return contacts;}
	public void setContacts(long contacts[]){this.contacts=contacts;}

	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
		for(int i=0;i<contacts.length;i++)
		System.out.print(contacts[i]+"  ");
		System.out.println("\n****************\n\n");
	}
}
class Tester
{
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int count;
		long cn1[],cn2[];
		System.out.println("how many contact numbers?");
		count=sc.nextInt();
		cn1=new long[count];
		for(int i=0;i<count;i++)
			cn1[i]=sc.nextLong();
		Emp e1=new Emp(1,"SSS",70000.00f,cn1);

		System.out.println("how many contact numbers?");
		count=sc.nextInt();
		cn2=new long[count];
		for(int i=0;i<count;i++)
			cn2[i]=sc.nextLong();
		Emp e2=new Emp(2,"KKK",87000.00f,cn2);

		e1.displayEmpInfo();
		e2.displayEmpInfo();
	}
}

