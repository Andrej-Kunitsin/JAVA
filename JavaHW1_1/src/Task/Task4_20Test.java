package Task;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task4_20Test
{

	@Test(expected = ArithmeticException.class)
	public void testGetBool_Dev0()
	{
		Task4_20.getBool(0, 15);
	}

	@Test
	public void testGetBool4_Dev()
	{
		boolean resp = Task4_20.getBool(15, 0);
		assertTrue(resp);
	}

	@Test
	public void testGetBool_True()
	{
		int a = 2;
		int b = 4;
		boolean resp = Task4_20.getBool(a, b);
		assertTrue(resp);
	}

	@Test
	public void testGetBool_False()
	{
		int a = 3;
		int b = 10;
		boolean resp = Task4_20.getBool(a, b);
		assertFalse(resp);
	}

}
