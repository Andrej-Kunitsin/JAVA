package arrays2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxArrayTest
{

	@Test(expected = NullPointerException.class)
	public void testMaxArr_null_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		arrays2.getMaxArr(null);
	}

	@Test(expected = NullPointerException.class)
	public void testMaxArr_emptyArr_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		arrays2.getMaxArr(in);
	}

	@Test
	public void testMaxArr_1val_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1 };
		int out = arrays2.getMaxArr(in);
		assertEquals(1, out);
	}

	@Test
	public void testMaxArr_2val_2()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 2, 1 };
		int out = arrays2.getMaxArr(in);
		assertEquals(2, out);
	}

	@Test
	public void testMaxArr_2val_3()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 2, 3 };
		int out = arrays2.getMaxArr(in);
		assertEquals(3, out);
	}

	@Test
	public void testMaxArr_2NegativeVal_minus2()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { -5, -2 };
		int out = arrays2.getMaxArr(in);
		assertEquals(-2, out);
	}

	@Test
	public void testMaxArr_manyIndex0_10()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 10, 2, 5, 9, 1, 3, 2 };
		int out = arrays2.getMaxArr(in);
		assertEquals(10, out);
	}

	@Test
	public void testMaxArr_manyIndex3_9()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 10, 2, 5, 98, 1, 20, 2 };
		int out = arrays2.getMaxArr(in);
		assertEquals(98, out);
	}

	@Test
	public void testMaxArr_manyLastIndex_205()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 10, 2, 5, 98, 1, 20, 205 };
		int out = arrays2.getMaxArr(in);
		assertEquals(205, out);
	}

	@Test
	public void testMaxArr_manyNegative_minus1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { -15, -2, -5, -2, -1, -3, -9 };
		int out = arrays2.getMaxArr(in);
		assertEquals(-1, out);
	}
}
