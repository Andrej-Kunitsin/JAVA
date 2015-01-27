package cycles2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SqrtTest
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
	// Найти корень натурального числа с точностью до целого
	public void testSqrtNull()
	{
		// 0
		int sq = cycles.sqrt(0);
		assertEquals(sq, -1);
	}

	@Test
	// Найти корень натурального числа с точностью до целого
	public void testSqrtDot()
	{
		// точный корень квадратный
		int sq = cycles.sqrt(49);
		assertEquals(sq, 7);
	}

	@Test
	// Найти корень натурального числа с точностью до целого
	public void testSqrtMin()
	{
		// не точный корень квадратный
		int sq = cycles.sqrt(46);
		assertEquals(sq, 6);
	}

	@Test
	// Найти корень натурального числа с точностью до целого
	public void testSqrtMax()
	{
		// не точный корень квадратный
		int sq = cycles.sqrt(26);
		assertEquals(sq, 5);
	}

}
