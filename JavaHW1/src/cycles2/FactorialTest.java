package cycles2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest
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
	public void testFackt_0_minus1()
	{
		int in = 0;
		int out = cycles.mFackt(in);
		assertEquals(-1, out);
	}

	@Test
	public void testFacktNorm()
	{
		int fk = cycles.mFackt(3);
		assertEquals(fk, 6);
	}

	@Test
	public void testFacktMinus()
	{
		int fk = cycles.mFackt(-5);
		assertEquals(fk, -1);
	}

}
