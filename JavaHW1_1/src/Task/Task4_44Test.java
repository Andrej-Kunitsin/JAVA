package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_44Test
{

	@Test
	public void testGetBool()
	{
		assertTrue(Task4_44.getBool(3.25, 3.25, 3.25));
	}

	@Test
	public void testGetBool2()
	{
		assertTrue(Task4_44.getBool(3.25, 3.25, 3.20));
	}

	@Test
	public void testGetBool3()
	{
		assertTrue(Task4_44.getBool(3.25, 3.20, 3.25));
	}

	@Test
	public void testGetBool4()
	{
		assertTrue(Task4_44.getBool(3.20, 3.25, 3.25));
	}
	
	@Test
	public void testGetBool5()
	{
		assertFalse(Task4_44.getBool(3.20, 3.201, 3.25));
	}
	 

	@Test
	public void testGetBool6()
	{
		assertFalse(Task4_44.getBool(3.25, 3.20, 3.21));
	}
}
