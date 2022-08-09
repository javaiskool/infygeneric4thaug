class Student
{
	public int rollNo;
	public String name;
	public String course;
	public float fees;

	public Student(int rollNo,String name,String course,float fees)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
		this.fees=fees;
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
		Student s1=new Student(11,"AAA","JAVA",30000);
		s1.displayStudentInfo();
	}
}