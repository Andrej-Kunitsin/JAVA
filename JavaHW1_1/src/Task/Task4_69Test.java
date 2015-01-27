package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_69Test
{

	@Test
	public void testWork()
	{
		int a = 3;
		int b = 5;
		int res = Task4_69.work(a, b);
		assertEquals(25, res);
	}

	@Test
	public void testWork2()
	{
		int a = 4;
		int b = 9;
		int res = Task4_69.work(a, b);
		assertEquals(45, res);
	}

	@Test
	public void testWork3()
	{
		int a = 3;
		int b = 3;
		int res = Task4_69.work(a, b);
		assertEquals(15, res);
	}
	@Test
	public void testWork4()
	{
		int a = 3;
		int b = 25;
		int res = Task4_69.work(a, b);
		assertEquals(25, res);
	}

}
