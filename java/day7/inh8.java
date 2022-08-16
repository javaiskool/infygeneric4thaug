//demo of hierarchical inheritance Emp(eno,ename,sal) - Programmer (skill), Stester (type)

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
class Programmer extends Emp
{
	private String skill;
	public Programmer(int empNo,String empName,float salary,String skill)
	{
		super(empNo,empName,salary);
		this.skill=skill;
	}
	public void setSkill(String skill){this.skill=skill;}
	public String getSkill(){return skill;}
	public void displayProgInfo()
	{
		//displayEmpInfo();
		System.out.println("Employee Number : "+this.getEmpNo());
		System.out.println("Programmer NAme : "+this.getEmpName());
		System.out.println("Salary          : "+this.getSalary());
		System.out.println("Skill           : "+this.skill);
		System.out.println("\n**********************\n\n");
	}
}
class Stester extends Emp
{
	private String ttype;
	public Stester(int empNo,String empName,float salary,String ttype)
	{
		super(empNo,empName,salary);
		this.ttype=ttype;
	}
	public void setTtype(String ttype){this.ttype=ttype;}
	public String getTtype(){return ttype;}
	public void displayStesterInfo()
	{
		//displayEmpInfo();
		System.out.println("Employee Number : "+this.getEmpNo());
		System.out.println("Software Tester NAme : "+this.getEmpName());
		System.out.println("Salary          : "+this.getSalary());
		System.out.println("Testing type           : "+this.ttype);
		System.out.println("\n**********************\n\n");
	}
}

class Tester
{
	public static void main(String s[])
	{
		Programmer p1=new Programmer(1,"SSS",70000.00f,"JAVA");
		Programmer p2=new Programmer(2,"KKK",87000.00f,"ORACLE");
		p1.displayProgInfo();
		p2.displayProgInfo(); 
		Stester st1=new Stester(3,"AAA",67000.00F,"Manual");
		Stester st2=new Stester(4,"FFF",98000.00f,"Automated");
		st1.displayStesterInfo();
		st2.displayStesterInfo();
	}
}

