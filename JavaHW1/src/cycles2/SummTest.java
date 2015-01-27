package cycles2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SummTest
{
	private Cycles cycles;

	@Before
	public void setUp()
	{
		cycles = new Cycles();
	}

	@After
	public void tearDown()
	{
		cycles = null;
	}

	@Test
	// Посчитать сумму цифр заданного числа
	public void testSummNull()
	{
		int sum = cycles.summ(0);
		assertEquals(sum, 0);
	}

	@Test
	// Посчитать сумму цифр заданного числа
	public void testSummPlus()
	{
		int sum = cycles.summ(12345);
		assertEquals(sum, 15);
	}

	@Test
	// Посчитать сумму цифр заданного числа
	public void testSummMinus()
	{
		int sum = cycles.summ(-12345);
		assertEquals(sum, 15);
	}

}
