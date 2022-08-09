
//demo method local variables
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
		int temp=incr; //local variable
		incr=incr+1000;//parameter also local variable
		salary=salary+incr;//instance variable
		System.out.println("salary : "+salary);
		System.out.println("increment : "+incr);
		System.out.println("temp : "+temp);  
		 
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
		e1.updateSalary(3500);
		System.out.println("salary : "+e1.salary);
		System.out.println("increment : "+incr);
		System.out.println("temp : "+temp);  

		short amt=2600;
		e2.empNo=104;
		e2.empName="Priya";
		e2.salary=99000.00f;
		e2.displayEmpInfo(); 
		e2.updateSalary(amt ); 
		
	}
}