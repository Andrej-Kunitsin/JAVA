package arrays2;

//Отсортировать массив (пузырьком (Bubble)
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortBubbleTest
{
	@Test(expected = NullPointerException.class)
	public void testSortBubble_arNull_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		arrays2.getSortBubble(null);
	}

	@Test(expected = NullPointerException.class)
	public void testSortBubble_emptyArr_emptyArr()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {};
		arrays2.getSortBubble(in);
	}

	@Test
	public void testSortBubble_1vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1};
		int[] out = {1};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSortBubble_2vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSortBubble_2volSorted()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {1, 2};
		int[] out = {1, 2};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSortBubble_2volNegativ()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSortBubble_4vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {4, 3, 2, 1};
		int[] out = {1, 2, 3, 4};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}

	@Test
	public void testSortBubble_5vol()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] in = {12, 55, 648, 11, -2};
		int[] out = {-2, 11, 12, 55, 648};
		int[] res = arrays2.getSortBubble(in);
		assertArrayEquals(out, res);
	}
}
