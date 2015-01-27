package arrays2;

//Сделать реверс массива (массив в обратном направлении)
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ReversArrayTest
{

	@Test
	public void testReversArr_arNull_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = null;
		int[] out = {};
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testReversArr_emptyArr_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		int[] out = {};
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testReversArr_1vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1 };
		int[] out = { 1 };
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testReversArr_2vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1, 2 };
		int[] out = { 2, 1 };
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testReversArr_4vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1, 2, 3, 4 };
		int[] out = { 4, 3, 2, 1 };
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testReversArr_5vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = { 1, 2, 3, 4, 5 };
		int[] out = { 5, 4, 3, 2, 1 };
		int[] res = arrays2.getReversArr(in);
		assertArrayEquals(out, res);
	}
}
