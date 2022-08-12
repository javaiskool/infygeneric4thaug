//demo of aggregation Employee has a Gadget array and employee array

class Gadget
{
	private String gname;
	public Gadget(String gname)
	{this.gname=gname;}
	public void setGname(String gname){this.gname=gname;}
	public String getGname(){return gname;}
	static
	{
		System.out.println("static block in gadget class");
	}
}


class Emp
{
	private int empNo;
	private String empName;
	private float salary;
	private static int companyId;
	private static Gadget[] egadget=null;

	static 
	{
		System.out.println("static block in employee class");
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
	public static void setEgadget(Gadget[] egadget){Emp.egadget=egadget;}
	public static Gadget[] getEgadget(){return egadget;}
	
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
	static
	{
		System.out.println("static block in Tester class");
	}
	public static void main(String s[])
	{	
	

	Gadget eg[]={new Gadget("Laptop"),new Gadget("Tab"),new Gadget("Headphone"),new Gadget("notebook"),new Gadget("disk")};
		Emp elist[]={new Emp(1,"SSS",70000.00f),new Emp(2,"KKK",88000.00f)};
		Emp.setEgadget(new Gadget[]{eg[0],eg[2],eg[3]});
		
		for(Emp e:elist)
			e.displayEmpInfo();
				 
  		Emp.setEgadget(new Gadget[]{eg[0],eg[1],eg[4]});
		
		for(Emp e:elist)
			e.displayEmpInfo();
		

	}
}

