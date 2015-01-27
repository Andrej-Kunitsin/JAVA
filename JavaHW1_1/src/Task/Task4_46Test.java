package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_46Test
{

	@Test
	public void testGetBool()
	{
		assertFalse(Task4_46.getBool(5, 6, 7));
	}
	@Test
	public void testGetBool2()
	{
		assertTrue(Task4_46.getBool(5, 7, 7));
	}
	@Test
	public void testGetBool3()
	{
		assertTrue(Task4_46.getBool(7, 7, 5));
	}
	@Test
	public void testGetBool4()
	{
		assertTrue(Task4_46.getBool(5, 7, 5));
	}

}
