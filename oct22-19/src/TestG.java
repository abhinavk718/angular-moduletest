public class TestG
{
	final void add()
	{
		System.out.println("add() method");
	}
	final void add(int a)
	{
		System.out.println("add(int a) method");
	}
	public static void main(String[] args)
	{
		SuperClass sc=new SuperClass();
		System.out.println("********************");
		SubClass sub = new SubClass();
		sub.getData();
		TestG g=new TestG();
		g.add();
		g.add(10 );
		
	}

}
 