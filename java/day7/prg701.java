//association example1

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
	public void generateSalSlip(SalAcc sa)
	{
		this.displayEmpInfo();
		System.out.println("Salary Bank Name : "+SalAcc.getBankName());
		System.out.println("Salary Account Number : "+sa.getAccno());
			
	}
}
class SalAcc
{
	private static String bankName;
	private int accno;
	static
	{
		bankName="SBI";
	}
	public SalAcc(int accno)
	{
		this.accno=accno;
	}
	public static String getBankName(){return SalAcc.bankName;}
	public static void setBankName(String bankName){SalAcc.bankName=bankName;}
	public int getAccno(){return accno;}
	public void setAccno(int accno){this.accno=accno;}

}

class Tester
{
	public static void main(String s[])
	{
		Emp e1=new Emp(1,"SSS",70000.00f);
		Emp e2=new Emp(2,"KKK",87000.00f);
		e1.displayEmpInfo();
		SalAcc sa1=new SalAcc(12345);
		SalAcc sa2=new SalAcc(78906);
		System.out.println("Salary account number for Employee "+e1.getEmpNo()+" is "+sa1.getAccno());
		e1.generateSalSlip(sa1);
		e2.generateSalSlip(sa2);
 
		 
	}
}

