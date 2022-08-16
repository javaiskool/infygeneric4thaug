//association example 5

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
	public SalAcc(){this.accno=0;}
	public SalAcc(int accno)
	{
		this.accno=accno;
	}
	public static String getBankName(){return SalAcc.bankName;}
	public static void setBankName(String bankName){SalAcc.bankName=bankName;}
	public int getAccno(){return accno;}
	public void setAccno(int accno){this.accno=accno;}

	public String getEmpAcc(Emp e)
	{
		return ("Empno : "+e.getEmpNo()+"  SalaryAccno : "+this.accno);
	}

}

class Tester
{
	public static void main(String args[])
	{
		Emp e[]={new Emp(1,"SSS",70000.00f),new Emp(2,"KKK",87000.00f),new Emp(3,"HHH",43219.00f),new Emp(4,"PPP",90000.00f)};
		SalAcc sa[]={new SalAcc(12345),new SalAcc(778899)};
		String str[]=new String[e.length];
		int i=0;
		//way1
		if(e.length==sa.length)
		{
			for(i=0;i<e.length;i++)
			{
				str[i]=sa[i].getEmpAcc(e[i]);
			}
		}
		else
		{
			for(i=0;i<sa.length;i++)
			{
				str[i]=sa[i].getEmpAcc(e[i]);
			}
			System.out.println(i);
			for(int j=i;j<e.length;j++)
			str[j]="Empno : "+e[j].getEmpNo()+" SalaryAccno : 0";
		}
		System.out.println("Salacc details for employee way1 ");
		for(i=0;i<str.length;i++)
			System.out.println(str[i]);
			System.out.println("\n********************\n");
		
	}
}

