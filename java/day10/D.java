package pkg2;
import pkg1.*;
class D
{
	public void displayD()
	{
		System.out.println("display in class D");
		A a=new A();
		//System.out.println("pv = "+a.pv);
		//System.out.println("pk = "+a.pk);
		//System.out.println("pt = "+a.pt);
		System.out.println("pb = "+a.pb);
	}
}

