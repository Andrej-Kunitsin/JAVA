package Task;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task4_30Test
{

	@Test
	public void testTask4_30a1()
	{
		assertTrue(Task4_30.task4_30a(555));
	}

	@Test
	public void testTask4_30a2()
	{
		assertFalse(Task4_30.task4_30a(123));
	}

	@Test
	public void testTask4_30a3()
	{
		assertFalse(Task4_30.task4_30a(112));
	}

	@Test
	public void testTask4_30a4()
	{
		assertFalse(Task4_30.task4_30a(121));
	}

	@Test
	public void testTask4_30a5()
	{
		assertFalse(Task4_30.task4_30a(211));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask4_30a6()
	{
		Task4_30.task4_30a(99);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask4_30a7()
	{
		assertFalse(Task4_30.task4_30a(1000));
	}

	@Test
	public void testTask4_30b1()
	{
		assertFalse(Task4_30.task4_30b(123));
	}

	@Test
	public void testTask4_30b2()
	{
		assertTrue(Task4_30.task4_30b(211));
	}

	@Test
	public void testTask4_30b3()
	{
		assertTrue(Task4_30.task4_30b(112));
	}

	@Test
	public void testTask4_30b4()
	{
		assertTrue(Task4_30.task4_30b(121));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask4_30b5()
	{
		Task4_30.task4_30b(99);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTask4_30b6()
	{
		Task4_30.task4_30b(1000);
	}
}
