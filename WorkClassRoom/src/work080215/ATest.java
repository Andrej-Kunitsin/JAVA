package work080215;

public class ATest
{
	public static int count=20;
	static
	{
		count = 50;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		int a = 10;
		Person p = new Person();
		System.out.println("int " + a + "; Person " + p);
		System.out.println(count);
	}

}
