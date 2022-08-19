package pkg2;
import pkg1.*;
class E extends A
{
	public void displayE()
	{
		System.out.println("display in class E");
		//System.out.println("pv = "+this.pv);
		//System.out.println("pk = "+this.pk);
		System.out.println("pt = "+this.pt);
		System.out.println("pb = "+this.pb);
	}
}
