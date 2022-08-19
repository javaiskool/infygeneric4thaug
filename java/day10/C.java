package pkg1;
class C
{
	public void displayC()
	{
		System.out.println("display in class C");
		A a=new A();
		// System.out.println("pv = "+a.pv); // access through getter-setter
		System.out.println("pk = "+a.pk);
		System.out.println("pt = "+a.pt);
		System.out.println("pb = "+a.pb);
	}
}
