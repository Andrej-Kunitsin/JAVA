package cycles2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IsPrimeTest
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
	public void testIsPrime_0_false()
	{
		boolean b = cycles.isPrime(0);
		assertFalse(b);
	}

	@Test
	public void testIsPrime_1_true()
	{
		boolean b = cycles.isPrime(0);
		assertFalse(b);
	}

	@Test
	public void testIsPrime_2_True()
	{
		int in = 2;
		boolean b = cycles.isPrime(in);
		assertTrue(b);
	}

	@Test
	public void testIsPrime_7_true()
	{
		int in = 7;
		boolean b = cycles.isPrime(in);
		assertTrue(b);
	}

	@Test
	public void testIsPrime_11_true()
	{
		int in = 11;
		boolean b = cycles.isPrime(in);
		assertTrue(b);
	}

	@Test
	public void testIsPrime_25_False()
	{
		int in = 25;
		boolean b = cycles.isPrime(in);
		assertFalse(b);
	}
}
