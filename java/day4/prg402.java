class Emp
{
	private int empNo;
	private String empName;
	private float salary;

	public Emp(int empNo,String empName,float salary)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public int getEmpNo(){return this.empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return this.empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return this.salary;}
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
	}
}
class Tester
{
	public static void main(String s[])
	{
		Emp e1=new Emp(1,"SSS",70000.00f);
		e1.displayEmpInfo();
		Emp e2=new Emp(2,"KKK",87000.00f);
		System.out.println("Employee Details ");
		System.out.println(e2.getEmpNo()+" "+e2.getEmpName()+" "+e2.getSalary());
		//	e1.setSalary(e1.getSalary()+5000);
		/*float sal=e1.getSalary();
		e1.setSalary(sal+5000);*/
		float sal=e1.getSalary()+5000;
		e1.setSalary(sal);
		e1.displayEmpInfo();
	}
}

