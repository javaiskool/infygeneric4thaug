
//demo method with  return with  parameter
class Emp
{
	public	int  empNo;//instance variable
	public	String empName;//instance variable
	public	float salary;//instance variable

	public void displayEmpInfo()//method without return without parameter
	{
		System.out.println("Employee Number : "+empNo);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+salary);
	}
	public int updateSalary(int incr,String msg) //method with  return with  parameter
	{
		if(salary+incr<=100000)
		{
			salary=salary+incr;
			return 1;
		}
		else
		{
			return 0;
		}
		 
	}
}
class Tester
{
	public static void main(String[] args)
	{
		
		Emp e1,e2=new Emp();
		e1=new Emp();
		int status; 
		e1.empNo=101;
		e1.empName="Sagar";
		e1.salary=56000.00f;
		e1.displayEmpInfo(); 
		status=e1.updateSalary("hello",3500);
		if (status==1)
		{
		System.out.println("salary updated successfully");
		}
		else
		{System.out.println("Salary not updated");
		}

		short amt=2600;
		e2.empNo=104;
		e2.empName="Priya";
		e2.salary=99000.00f;
		e2.displayEmpInfo(); 
		status=e2.updateSalary(amt,"welcome"); 
		if (status==1)
		{
		System.out.println("salary updated successfully");
		}
		else
		{System.out.println("Salary not updated");
		}
	}
}