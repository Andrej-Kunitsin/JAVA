package arrays2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testSumElementIndexNotEven
{
	private Arrays2 arrays2;
	@Before
	public void setUp(){
		arrays2 = new Arrays2();
	}
	@After
	public void tearDown(){
		arrays2 = null;
	}
	
	@Test(expected = NullPointerException.class)
	public void testSumElementIndexNotEven_arNull_emptyArr()
	{
		arrays2.getSummElement(null);
	}

	@Test
	public void testSumElementIndexNotEven_emptyArr_emptyArr_0()
	{
		int[] in = {};
		int res = arrays2.getSummElement(in);
		assertEquals(0, res);
	}

	@Test
	public void testSumElementIndexNotEven_1vol_0()
	{
		int[] in = { 1 };
		int res = arrays2.getSummElement(in);
		assertEquals(0, res);
	}

	@Test
	public void testSumElementIndexNotEven_1volMinus_0()
	{
		int[] in = { -15 };
		int res = arrays2.getSummElement(in);
		assertEquals(0, res);
	}

	@Test
	public void testSumElementIndexNotEven_2vol_1()
	{
		int[] in = { 2, 1 };
		int res = arrays2.getSummElement(in);
		assertEquals(1, res);
	}

	@Test
	public void testSumElementIndexNotEven_2volNegativ_minus2()
	{
		int[] in = { -1, -2 };
		int res = arrays2.getSummElement(in);
		assertEquals(-2, res);
	}

	@Test
	public void testSumElementIndexNotEven_many_27()
	{
		int[] in = { 4, 3, 2, 1, 234, 23, 0 };
		int res = arrays2.getSummElement(in);
		assertEquals(27, res);
	}

	@Test
	public void testSumElementIndexNotEven_manyNegative_6()
	{
		int[] in = { 12, -4, 648, 11, -2, -1, 15 };
		int res = arrays2.getSummElement(in);
		assertEquals(6, res);
	}
}
