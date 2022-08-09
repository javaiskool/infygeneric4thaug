
//demo invoking object and object as explicit parameter 
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
	public void updateSalary(Emp e)  
	{
		 
		salary=salary+5000;//salary refers to salary of invoking object e1
		e.salary=e.salary+5000; //e.salary refers to salary of explicit parameter e2
		 
		 
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
		e2.displayEmpInfo();

		e1.updateSalary(e2);

		e1.displayEmpInfo(); 
		e2.displayEmpInfo(); 
		 
		
	}
}