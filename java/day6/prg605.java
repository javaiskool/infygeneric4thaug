//demo of static variable
class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId=1111;

	static 
	{
		System.out.println("Static block in Emp class");
		 
	}
	public Emp(int empNo,String empName,float salary)
	{
		System.out.println("constructor in Emp class");
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
	public static void tryal()
	{
		System.out.println("Company ID      : "+Emp.companyId);
		//System.out.println("Employee Number : "+empNo); // instance variables can not be accessed by static methods. it generates compilation error
	}

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
	static
	{
		System.out.println("static block in Tester class");
	}

	public static void main(String s[])
	{	 
		System.out.println("main method in Tester class");
		System.out.println("using class Emp"+Emp.getCompanyId());
		//Emp e1=new Emp(1,"SSS",70000.00f);
		//Emp e2=new Emp(2,"KKK",56000.00f);
		 
	}
}

