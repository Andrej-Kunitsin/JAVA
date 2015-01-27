package conditionalStatments2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChetvTest
{
	private ConditionalStatments statments = new ConditionalStatments();

	@Before
	public void setUp()
	{
		statments = new ConditionalStatments();
	}

	@After
	public void tearDown()
	{
		statments = null;
	}

	@Test
	public void testQuarter1()
	{
		int x = 1, y = 2;
		int quarter = statments.chetv(x, y);
		assertEquals(1, quarter);
	}

	@Test
	public void testQuarter2()
	{
		int x = 1, y = -2;
		int quarter = statments.chetv(x, y);
		assertEquals(2, quarter);
	}

	@Test
	public void testQuarter3()
	{
		int x = -1, y = -2;
		int quarter = statments.chetv(x, y);
		assertEquals(3, quarter);
	}

	@Test
	public void testQuarter4()
	{
		int x = -1, y = 2;
		int quarter = statments.chetv(x, y);
		assertEquals(4, quarter);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testQuarterNull1()
	{
		statments.chetv(0, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testQuarterNull2()
	{
		statments.chetv(5, 0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testQuarterNullNull()
	{
		statments.chetv(0, 0);
	}
}
