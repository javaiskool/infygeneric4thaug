//association example 4

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

	public String getEmpAcc(Emp e)
	{
		return ("Empno : "+e.getEmpNo()+"  SalaryAccno : "+this.accno);
	}

}

class Tester
{
	public static void main(String args[])
	{
		Emp e[]={new Emp(1,"SSS",70000.00f),new Emp(2,"KKK",87000.00f)};
		SalAcc sa[]={new SalAcc(12345),new SalAcc(78906)};
		String str[]=new String[sa.length];
		//way1
		for(int i=0;i<sa.length;i++)
			str[i]=sa[i].getEmpAcc(e[i]);
		System.out.println("Salacc details for employee way1 ");
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
			System.out.println("\n********************\n");
		//way2
		System.out.println("Salacc details for employee way 2");
		for(int i=0;i<sa.length;i++)
		{
			str[i]=sa[i].getEmpAcc(e[i]);
			System.out.println(str[i]);
		}
			System.out.println("\n********************\n");
		//way3
		System.out.println("Salacc details for employee way 3");
		for(int i=0;i<sa.length;i++)
			System.out.println(sa[i].getEmpAcc(e[i]));
			System.out.println("\n********************\n");

		//way4 for single object
		System.out.println("Salacc details for employee way 4 single object");
		Emp e1=new Emp(3,"GGG",67900.00f);
		SalAcc sa1=new SalAcc(445566);
		String s;
		s=sa1.getEmpAcc(e1);
		System.out.println("Emp & Salacc Details : "+s);
		
 		 
	}
}

