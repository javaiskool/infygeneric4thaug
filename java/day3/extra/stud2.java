class Student
{
	public int rollNo;
	public String name;
	public String course;
	public float fees;

	public Student(int rollNo,String name,String course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		if(this.course=="JAVA")
		this.fees=30000.00f;
		if(this.course=="ORACLE")
		this.fees=25000.00f;

	}
	public void displayStudentInfo()
	{
		System.out.println("Roll Number : "+this.rollNo);
		System.out.println("Student name : "+this.name);
		System.out.println("Course : "+this.course);
		System.out.println("Fees  : "+this.fees);
	}
}

class Tester
{
	public static void main(String s[])
	{
		Student s1=new Student(11,"AAA","JAVA");
		s1.displayStudentInfo();
		Student s2=new Student(12,"KKK","ORACLE");
		s2.displayStudentInfo();
	}
}