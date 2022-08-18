//demo of abstract class Emp(eno,ename,sal) - Programmer (skill), Stester (type)

abstract class Emp
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
	abstract public void displayEmpInfo();
	
	public abstract void calculateSalary();
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
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+this.getEmpNo());
		System.out.println("Programmer NAme : "+this.getEmpName());
		System.out.println("Salary          : "+this.getSalary());
		System.out.println("Skill           : "+this.skill);
		System.out.println("\n**********************\n\n");
	}
	public void calculateSalary()	{this.setSalary(this.getSalary()+10000);}
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
	public void displayEmpInfo()
	{
		System.out.println("Employee Number : "+this.getEmpNo());
		System.out.println("Software Tester NAme : "+this.getEmpName());
		System.out.println("Salary          : "+this.getSalary());
		System.out.println("Testing type           : "+this.ttype);
		System.out.println("\n**********************\n\n");
	}
	public void calculateSalary(){this.setSalary(this.getSalary()+5000);}
}

class Tester
{
	public static void main(String s[])
	{
		Emp p1=new Programmer(1,"SSS",70000.00f,"JAVA");
		Emp p2=new Programmer(2,"KKK",87000.00f,"ORACLE");
		p1.displayEmpInfo();
		p2.displayEmpInfo(); 
		Emp st1=new Stester(3,"AAA",67000.00F,"Manual");
		Emp st2=new Stester(4,"FFF",98000.00f,"Automated");
		st1.displayEmpInfo();
		st2.displayEmpInfo();
	
		p1.calculateSalary();
		st1.calculateSalary();
		p1.displayEmpInfo();
		st1.displayEmpInfo();

	}
}

