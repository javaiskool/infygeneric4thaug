//demo of static variable for auto generation of empNo
class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId;
	private static int counter=101;
	static 
	{
		companyId=1111;
	}
	public Emp(String empName,float salary)
	{
		
		this.empNo=Emp.counter++;
		this.empName=empName;
		this.salary=salary;
	}
	//public void setEmpNo(int empNo){this.empNo=empNo;}
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
		Emp e1=new Emp("SSS",70000.00f);
		Emp e2=new Emp("AAA",87000.00f);
		Emp e3=new Emp("SJK",44000.00f);
		Emp e4=new Emp("RRR",23000.00f);
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
		e4.displayEmpInfo();
		 
	}
}

