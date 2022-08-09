
//demo pass by reference
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
	public void updateSalary(Emp e2)  
	{
		 
		e2.salary=e2.salary+10000;
		 
		 
	}
}
class Tester
{
	public static void main(String[] args)
	{
		
		Emp e1,e2=new Emp();
		e1=new Emp();
		
		int incr=3000; 
		e1.empNo=101;
		e1.empName="Sagar";
		e1.salary=56000.00f;
		e1.displayEmpInfo(); 
		
		e2.empNo=104;
		e2.empName="Priya";
		e2.salary=78000.00f; 

		e1.updateSalary(e2);
		e2.displayEmpInfo(); 
		 
		
	}
}