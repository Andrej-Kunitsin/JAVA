package cycles2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReflexTest
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
	public void testReflex_0_0()
	{
		int in = 0;
		int out = cycles.getReflex(in);
		assertEquals(0, out);
	}

	@Test
	public void testReflex_1_1()
	{
		int in = 1;
		int out = cycles.getReflex(in);
		assertEquals(1, out);
	}

	@Test
	public void testReflex_12_21()
	{
		int in = 12;
		int out = cycles.getReflex(in);
		assertEquals(21, out);
	}

	@Test
	public void testReflex_1234567_7654321()
	{
		int in = 1234567;
		int out = cycles.getReflex(in);
		assertEquals(7654321, out);
	}
}
