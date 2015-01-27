package conditionalStatments2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VolTest
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
	public void testVolEven()
	{
		int a = 4, b = 5, c;
		c = statments.vol(a, b);
		assertEquals(c, 20);
	}

	@Test
	public void testVolNotEven()
	{
		int a = 5, b = 5, c;
		c = statments.vol(a, b);
		assertEquals(c, 10);
	}

	@Test
	public void testVolEvenNull()
	{
		int a = 0, b = 5, c;
		c = statments.vol(a, b);
		assertEquals(c, 0);
	}

}
