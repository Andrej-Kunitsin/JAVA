package cycles2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumCountTest
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
	// Найти сумму четных чисел и их количество в диапазоне от 1 до 99
	public void testSumCount()
	{
		int[] ch = cycles.summCount(0, 100);
		assertArrayEquals(ch, new int[]{2450, 50});
	}

	@Test
	// Найти сумму четных чисел и их количество в диапазоне от 1 до 99
	public void testSumCount2()
	{
		int[] ch = cycles.summCount(50, 53);
		assertArrayEquals(ch, new int[]{102, 2});
	}

}
