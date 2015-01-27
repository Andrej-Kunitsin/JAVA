package conditionalStatments2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SummPlussTest
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
	public void testSumPlusOnePlus()
	{
		int a = 10, b = -2, c = -5, z;
		z = statments.summ(a, b, c);
		assertEquals(z, 10);
	}

	@Test
	public void testSumPlusAllPlus()
	{
		int a = 10, b = 2, c = 5, z;
		z = statments.summ(a, b, c);
		assertEquals(z, 17);
	}

	@Test
	public void testSumPlusNullPlus()
	{
		int a = -10, b = -2, c = -5, z;
		z = statments.summ(a, b, c);
		assertEquals(z, 0);
	}
}
