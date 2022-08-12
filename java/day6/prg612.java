//demo of aggregation Employee has a Gadget array

class Gadget
{
	private String gname;
	public Gadget(String gname)
	{this.gname=gname;}
	public void setGname(String gname){this.gname=gname;}
	public String getGname(){return gname;}
}


class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId;
	private Gadget[] egadget;

	static 
	{
		companyId=1111;
	}
	public Emp(int empNo,String empName,float salary,Gadget[] egadget)
	{
		this.empNo=empNo;
		this.empName=empName;
		this.salary=salary;
		this.egadget=egadget;
	}
	public void setEmpNo(int empNo){this.empNo=empNo;}
	public int getEmpNo(){return this.empNo;}
	public void setEmpName(String empName){this.empName=empName;}
	public String getEmpName(){return this.empName;}
	public void setSalary(float salary){this.salary=salary;}
	public float getSalary(){return this.salary;}
	public void setEgadget(Gadget[] egadget){this.egadget=egadget;}
	public Gadget[] getEgadget(){return egadget;}
	
	public static int getCompanyId(){return companyId;}
	public static void setCompanyId(int companyId){Emp.companyId=companyId;}
	
	public void displayEmpInfo()
	{
		System.out.println("Company ID      : "+Emp.companyId);
		System.out.println("Employee Number : "+this.empNo);
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("Gadgets");
		for(Gadget eg:egadget)
		System.out.print(eg.getGname()+"  ");
		System.out.println("\n");
		
	}
}
class Tester
{
	public static void main(String s[])
	{	
		Gadget eg[]={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("Headphone")};
		Emp e1=new Emp(1,"SSS",70000.00f,eg);
		e1.displayEmpInfo();
		Emp e2=new Emp(2,"KKK",88000.00f,eg);
		e2.displayEmpInfo();
		

	}
}

