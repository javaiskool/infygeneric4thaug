
//demo method without return without parameter
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
	public void updateSalary() //method without return without parameter
	{
		salary=salary+2000-200;
		System.out.println("updated salary : "+salary);
	}
}
class Tester
{
	public static void main(String[] args)
	{
		
		Emp e1,e2=new Emp();
		e1=new Emp();
		 
		e1.empNo=101;
		e1.empName="Sagar";
		e1.salary=56000.00f;
		e1.displayEmpInfo(); 
		e1.updateSalary();

		/*e2.empNo=104;
		e2.empName="Priya";
		e2.salary=87000.00f;
		e2.displayEmpInfo(); */
		 
	}
}