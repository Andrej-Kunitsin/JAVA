package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_55Test
{

	@Test
	public void testGetBool4_1234_true()
	{
		assertTrue(Task4_55.getBool4(1234));
	}

	@Test
	public void testGetBool4_1235_false()
	{
		assertFalse(Task4_55.getBool4(1235));
	}

	@Test
	public void testGetBool3()
	{
		assertTrue(Task4_55.getBoolb(1234, 1));
	}

	@Test
	public void testGetBool4()
	{
		assertTrue(Task4_55.getBoolb(1234, 2));
	}

	@Test
	public void testGetBool5()
	{
		assertTrue(Task4_55.getBoolb(1234, 3));
	}

	@Test
	public void testGetBool6()
	{
		assertFalse(Task4_55.getBoolb(1235, 6));
	}

	@Test
	public void testGetBool7()
	{
		assertTrue(Task4_55.getBoolb(1205, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetBool8()
	{
		Task4_55.getBoolb(999, 9);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetBool9()
	{
		Task4_55.getBoolb(10000, 9);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetBool10()
	{
		Task4_55.getBoolb(1234, 10);
	}

}
