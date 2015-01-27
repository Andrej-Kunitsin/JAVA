package arrays2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinArrayTest
{

	@Test(expected = NullPointerException.class)
	public void testMinArr_null_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		arrays2.getMinArr(null);
	}

	@Test(expected = NullPointerException.class)
	public void testMinArr_emptyArr_exept()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		arrays2.getMinArr(in);
	}

	@Test
	public void testMinArr_1val_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1};
		int out = arrays2.getMinArr(in);
		assertEquals(1, out);
	}

	@Test
	public void testMinArr_2val_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {2, 1};
		int out = arrays2.getMinArr(in);
		assertEquals(1, out);
	}

	@Test
	public void testMinArr_2val_2()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {2, 3};
		int out = arrays2.getMinArr(in);
		assertEquals(2, out);
	}

	@Test
	public void testMinArr_2NegativeVal_minus5()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {-5, -2};
		int out = arrays2.getMinArr(in);
		assertEquals(-5, out);
	}

	@Test
	public void testMinArr_manyIndex0_3()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {3, 4, 5, 9, 6, 7, 8};
		int out = arrays2.getMinArr(in);
		assertEquals(3, out);
	}

	@Test
	public void testMinArr_manyIndex3_3()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {10, 4, 5, 3, 5, 20, 55};
		int out = arrays2.getMinArr(in);
		assertEquals(3, out);
	}

	@Test
	public void testMinArr_manyLastIndex_3()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {10, 4, 5, 98, 55, 20, 3};
		int out = arrays2.getMinArr(in);
		assertEquals(3, out);
	}

	@Test
	public void testMinArr_manyNegative_minus25()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {-15, -25, -5, -2, -1, -3, -9};
		int out = arrays2.getMinArr(in);
		assertEquals(-25, out);
	}

}
