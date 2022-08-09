//demo of this keyword to call a method

class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable

	public Emp()
	{
		System.out.println("parameterless constructor");
		empNo=100;
		empName=null;
		salary=20000.00f;
	}

	public Emp(int empNo,String empName) 
	{
		this();
		System.out.println("parameterized constructor");
		this.empNo=empNo;
		this.empName=empName;
		
		 
	}
	public void displaySalary()
	{
		System.out.println("Salary = "+this.salary);
	}
	public void displayEmpInfo()//method
	{
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
		this.displaySalary();
	}
}

class Tester
{
	public static void main(String[] args)
	{
		Emp e1,e2;
		e1=new Emp();
		e1.displayEmpInfo();
		e2=new Emp(102,"Shruti");
		e2.displayEmpInfo();
		
	}
}