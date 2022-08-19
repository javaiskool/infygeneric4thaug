package pkg1;
public class A
{
	private int pv;
	int pk;
	protected int pt;
	public int pb;
	public A()
	{
		this.pv=1;
		this.pk=2;
		this.pt=3;
		this.pb=4;
	}
	public void displayA()
	{
		System.out.println("display in class A");
		System.out.println("pv = "+this.pv);
		System.out.println("pk = "+this.pk);
		System.out.println("pt = "+this.pt);
		System.out.println("pb = "+this.pb);
	}
}
