package arrays2;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ExchangeArrTest
{
	@Test
	public void testExchangeArr_4vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1, 2, 3, 4};
		int[] out = {3, 4, 1, 2};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testExchangeArr_5vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1, 2, 3, 4, 5};
		int[] out = {4, 5, 3, 1, 2};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testExchangeArr_2vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1, 2};
		int[] out = {2, 1};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testExchangeArr_1vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1};
		int[] out = {1};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testExchangeArr_emptyArr_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		int[] out = {};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testExchangeArr_arNull_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = null;
		int[] out = {};
		int[] res = arrays2.exchangeArr(in);
		assertArrayEquals(out, res);
	}
}