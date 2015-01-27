package arrays2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexMaxArrTest
{
	@Test(expected = NullPointerException.class)
	public void testIndexMaxArr_null_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		arrays2.indexMaxArr(null);
	}

	@Test(expected = NullPointerException.class)
	public void testIndexMaxArr_emptyArr_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		arrays2.indexMaxArr(in);
	}

	@Test
	public void testIndexMaxArr_1val_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(0, out);
	}

	@Test
	public void testIndexMaxArr_2val_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 2, 1 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(0, out);
	}

	@Test
	public void testIndexMaxArr_2val_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1, 2 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(1, out);
	}

	@Test
	public void testIndexMaxArr_2NegativeVal_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { -5, -2 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(1, out);
	}

	@Test
	public void testIndexMaxArr_many_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 10, 2, 5, 9, 1, 3, 2 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(0, out);
	}

	@Test
	public void testIndexMaxArr_many_5()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 10, 2, 5, 9, 1, 20, 2 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(5, out);
	}

	@Test
	public void testIndexMaxArr_manyNegative_6()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { -15, 2, 5, 2, 1, 3, 9 };
		int out = arrays2.indexMaxArr(in);
		assertEquals(6, out);
	}
}
