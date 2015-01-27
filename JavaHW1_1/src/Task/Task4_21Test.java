package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_21Test
{

	@Test
	public void testTestEven_756_true()
	{
		assertTrue(Task4_21.testEven(756));
	}

	@Test
	public void testTestEven_951_false()
	{
		assertFalse(Task4_21.testEven(951));
	}

	@Test
	public void testTestEven_0_True()
	{
		assertTrue(Task4_21.testEven(0));
	}

	@Test
	public void testTestSeven_57_true()
	{
		assertTrue(Task4_21.testSeven(57));
	}

	@Test
	public void testTestSeven_59_false()
	{
		assertFalse(Task4_21.testSeven(59));
	}

	@Test
	public void testTestSeven_0_false()
	{
		assertFalse(Task4_21.testSeven(0));
	}

	@Test
	public void testTestSeven_minus59_false()
	{
		assertFalse(Task4_21.testSeven(-59));
	}

}
