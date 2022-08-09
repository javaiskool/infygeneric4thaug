import java.util.*;

class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable

	public void displayEmpInfo()//method
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+salary);
	}
}
class Tester
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc=new Scanner(System.in);
		
		int x,y=5;
		x=10;
		Emp e1,e2=new Emp();
		//e1=new Emp();
		e1.displayEmpInfo();
		System.out.println("employee no : "+e1.empNo);
		e1.empNo=sc.nextInt();
		e1.empName=sc.next();
		e1.salary=sc.nextFloat();
		e1.displayEmpInfo(); 
		e2.empNo=104;
		e2.empName="Priya";
		e2.salary=87000.00f;
		e2.displayEmpInfo(); 
		 
	}
}