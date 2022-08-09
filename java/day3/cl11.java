//demo constructor

class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable
	public Emp()//parameterless constructor
	{
		System.out.println("parameterless constructor");
		empNo=105;
		empName="Prakash";
		salary=80000.00f;
	}

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
		Emp e1,e2;
		e1=new Emp();
		e1.displayEmpInfo();
		e2=new Emp();
		e2.displayEmpInfo();
		 
	}
}