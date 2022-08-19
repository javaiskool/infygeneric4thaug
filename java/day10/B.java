package pkg1;
class B extends A
{
	public void displayB()
	{
		System.out.println("display in class B");
		//System.out.println("pv = "+this.pv); // can be accessed using getter-setter methods
		System.out.println("pk = "+this.pk);
		System.out.println("pt = "+this.pt);
		System.out.println("pb = "+this.pb);
	}
}
