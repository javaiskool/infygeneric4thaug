//demo of multilevel inheritance Emp(eno,ename,sal) - Programmer (skill)-TeamHead (teamSize)

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
class TeamLead extends Programmer
{
	private int teamSize;
	public TeamLead(int empNo,String empName,float salary,String skill,int teamSize)
	{
		super(empNo,empName,salary,skill);
		this.teamSize=teamSize;
	}
	public int getTeamSize(){return teamSize;}
	public void SetTeamSize(int teamSize){this.teamSize=teamSize;}
	public void displayTeamLeadInfo()
	{
		System.out.println("Employee Number : "+this.getEmpNo());
		System.out.println("TeamLeader NAme : "+this.getEmpName());
		System.out.println("Salary          : "+this.getSalary());
		System.out.println("Skill           : "+this.getSkill());
		System.out.println("Teamsize        : "+this.teamSize);
		System.out.println("\n**********************\n\n");
	}
}


class Tester
{
	public static void main(String s[])
	{
		TeamLead tl1=new TeamLead(5,"RRR",170000.00f,"JAVA",5);
		TeamLead tl2=new TeamLead(2,"KKK",87000.00f,"ORACLE",4);
		tl1.displayTeamLeadInfo();
		tl2.displayTeamLeadInfo();
	}
}

