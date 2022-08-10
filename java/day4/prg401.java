class Demo
{
	private int pr;
	public int pb;

	public Demo(int pr,int pb)
	{this.pr=pr;this.pb=pb;}
	public void setPr(int pr) //setter or mutator method
	{this.pr=pr;}
	public int getPr(){return this.pr;} //getter or accessor method

	public void display()
	{
		System.out.println("pr = "+this.pr);
		System.out.println("pb = "+this.pb);
	}
}

class Tester
{
	public static void main(String[] s)
	{
		Demo d=new Demo(10,20);
		d.display();
		d.pb=50;
		System.out.println(d.pb);
		//d.pr=200;
		//System.out.println(d.pr);
		d.setPr(200);
		System.out.println(d.getPr());
		d.display();
	}
}
