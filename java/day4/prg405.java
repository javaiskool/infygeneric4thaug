// array of objects

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
		//way1
		/*Emp e[]=new Emp[]{new Emp(1,"SSS",70000.00f),new Emp(2,"KKK",87000.00f)};
		for(int i=0;i<e.length;i++)
		e[i].displayEmpInfo();*/

		//way2
		/*Emp e1,e2;
		e1=new Emp(3,"ppp",65789.00f);
		e2=new Emp (4,"ddd",45320.00f);
		Emp e[]=new Emp[]{e1,e2};
		for(int i=0;i<e.length;i++)
		e[i].displayEmpInfo();*/

		//way3
		Emp e[]=new Emp[3];
		e[0]=new Emp(5,"sss",78000.00f);
		e[1]=new Emp(6,"hhh",33400.00f);
		e[2]=new Emp(7,"ggg",23000.00f);
		for(Emp er:e)
		er.displayEmpInfo();
		 
		 
	}
}

