//demo multiple constructor

class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable

	public Emp(int eno,String ename,float sal)//parameterized constructor
	{
		System.out.println("parameterized constructor");
		empNo=eno;
		empName=ename;
		salary=sal;
	}
	public Emp()//parameterless constructor
	{
		empNo=99;
		empName=null;
		salary=0.0f;
	}
	public Emp(int eno,String ename)
	{
		empNo=eno;
		empName=ename;
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
		e1=new Emp(101,"Gopal",60000.00f);
		e1.displayEmpInfo();
		e2=new Emp(102,"Shruti",70000.00f);
		e2.displayEmpInfo();
		Emp e3=new Emp();
		e3.displayEmpInfo();
		Emp e4=new Emp(103,"Anjali");
		e4.displayEmpInfo(); 
	}
}