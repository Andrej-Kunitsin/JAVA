package function2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumDayTest
{
	private Function function;

	@Before
	public void setUp()
	{
		function = new Function();
	}

	@After
	public void tearDown()
	{
		function = null;
	}
	
	@Test
	public void testNumDayMonday()
	{
		int numberDay = 1;
		String day = function.getDay(numberDay);
		assertEquals(day, "Понедельник");
	}

	@Test
	public void testNumDayTuesday()
	{
		int numDay = 2;
		String day = function.getDay(numDay);
		assertEquals(day, "Вторник");
	}

	@Test
	public void testNumDayWednesday()
	{
		int numDay = 3;
		String day = function.getDay(numDay);
		assertEquals(day, "Среда");
	}

	@Test
	public void testNumDayThursday()
	{
		int numDay = 4;
		String day = function.getDay(numDay);
		assertEquals(day, "Четверг");
	}

	@Test
	public void testNumDayFriday()
	{
		int numDay = 5;
		String day = function.getDay(numDay);
		assertEquals(day, "Пятница");
	}

	@Test
	public void testNumDaySaturday()
	{
		int numDay = 6;
		String day = function.getDay(numDay);
		assertEquals(day, "Суббота");
	}

	@Test
	public void testNumDaySunday()
	{
		int numDay = 7;
		String day = function.getDay(numDay);
		assertEquals(day, "Воскресенье");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumDayNull()
	{
		function.getDay(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNumDayEight()
	{
		function.getDay(8);
	}

}
