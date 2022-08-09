//demo of this keyword in constructor

class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable

	public Emp(int empNo,String empName,float salary)//parameters are local variables and they get precedence over instance variablesconstructor
	{
		System.out.println("parameterized constructor");
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	
	public void displayEmpInfo()//method
	{
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
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
		
	}
}