
//demo pass by value
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
	public void updateSalary(int incr )  
	{
		 
		incr=incr+1000; 
		 
		 
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
		e1.updateSalary(incr);
		System.out.println("increment : "+incr);
		

		
		/*e2.empNo=104;
		e2.empName="Priya";
		e2.salary=99000.00f;
		e2.displayEmpInfo(); 
		e2.updateSalary(incr); */
		
	}
}