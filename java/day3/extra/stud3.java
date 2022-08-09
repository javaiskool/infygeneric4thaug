class Student
{
	public int rollNo;
	public String name;
	int mk1;
	int mk2;
	int mk3;
	float avg;
	String remark;
	char grade;

	public Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	public void setMarks(int mk1,int mk2,int mk3)
	{
		this.mk1=mk1;
		this.mk2=mk2;
		this.mk3=mk3;
	}
	public void prepareResult()
	{
		this.avg=(this.mk1+this.mk2+this.mk3)/3;
		if(this.avg>=50)
			this.remark="PASS";
		else
			this.remark="FAIL";
		if(this.remark=="PASS")
		{
			if(this.avg>=50 && this.avg<=60)
			grade='C';
			if(this.avg>60 && this.avg<=75)
			grade='B';
			if(this.avg>75 && this.avg<=90)
			grade='A';
			if(this.avg>90)
			grade='S';
		}
	}

	public void displayStudentResult()
	{
		System.out.println("Roll Number : "+this.rollNo);
		System.out.println("Student name : "+this.name);
		System.out.println("marks : "+this.mk1+" "+this.mk2+" "+this.mk3);
		System.out.println("Percentage : "+this.avg);
		System.out.println("Remark : "+this.remark);
		System.out.println("Grade : "+this.grade);
	}
}

class Tester
{
	public static void main(String s[])
	{
		Student s1=new Student(11,"AAA");
		s1.setMarks(67,88,90);
		s1.prepareResult();
		s1.displayStudentResult();
		 
	}
}