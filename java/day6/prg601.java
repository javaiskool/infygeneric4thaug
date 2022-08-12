//demo of static variable
class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId;

	static 
	{
		companyId=1111;
	}
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
	
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId){Emp.companyId=companyId;}
	
	public void displayEmpInfo()
	{
		System.out.println("Company ID      : "+Emp.companyId);
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
		Emp.setCompanyId(2222);
		System.out.println("company id = "+Emp.getCompanyId());
	}
}

