//demo of static variable for auto generation of empNo alphanumeric with department name and no. of employees 
class Emp
{
	private String empNo;
	private String empName;
	private float salary;
	private String dname;
	private static int companyId;
	private static int counter=101;
	private static int empCount=0;
	static 
	{
		companyId=1111;
	}
	public Emp(String empName,float salary,String dname)
	{
		this.dname=dname;
		//this.empNo=this.dname.charAt(0)+""+Emp.counter++;
		this.empNo=this.dname.substring(0,3)+Emp.counter++;
		this.empName=empName;
		this.salary=salary;
		Emp.empCount=Emp.empCount+1;
	}
	 
	public String getEmpNo(){return this.empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return this.empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return this.salary;}
	public void setDname(String dname){this.dname=dname;}
	public String getDname(){return this.dname;}
	
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId){Emp.companyId=companyId;}
	public static int getEmpCount(){return empCount;}
	public void displayEmpInfo()
	{
		System.out.println("Company ID      : "+Emp.companyId);
		System.out.println("Department Name : "+this.dname);
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
	}
}
class Tester
{
	public static void main(String s[])
	{
		Emp e1=new Emp("SSS",70000.00f,"Accounts");
		Emp e2=new Emp("AAA",87000.00f,"Purchase");
		Emp e3=new Emp("SJK",44000.00f,"Marketing");
		Emp e4=new Emp("RRR",23000.00f,"Development");
		e1.displayEmpInfo();
		e2.displayEmpInfo();
		e3.displayEmpInfo();
		e4.displayEmpInfo();
		System.out.println("NO. of employees = "+Emp.getEmpCount()); 
	}
}

