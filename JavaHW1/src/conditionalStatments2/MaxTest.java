package conditionalStatments2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaxTest
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
	public void testMaxFirst()
	{
		int a = 3, b = 3, c = 3, z;
		z = statments.max(a, b, c);
		assertEquals(z, 30);
	}

	@Test
	public void testMaxNull()
	{
		int a = 0, b = 0, c = 0, z;
		z = statments.max(a, b, c);
		assertEquals(z, 3);
	}

	@Test
	public void testMaxSecond()
	{
		int a = 1, b = 1, c = 1, z;
		z = statments.max(a, b, c);
		assertEquals(z, 6);
	}
}
