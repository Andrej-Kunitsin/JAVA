package arrays2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNotEvenTest
{

	@Test
	public void testNotEven_4()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 1, 2, 3, 4, 5, 6, 7 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 4);
	}

	@Test
	public void testNotEven_oneValue_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 1 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 1);
	}

	@Test
	public void testNotEven_oneValue_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 2 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 0);
	}

	@Test
	public void testNotEven_twoValue_1()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 1, 2 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 1);
	}

	@Test
	public void testNotEven_twoValue_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 4, 2 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 0);
	}

	@Test
	public void testNotEven_twoValue_2()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 7, 3 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 2);
	}

	@Test
	public void testCountNotEven_WithoutOdd_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = { 8, 2, 6, 4, 4, 6, 4 };
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 0);
	}

	@Test
	public void testCountNotEven_arNull_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = null;
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 0);
	}

	@Test
	public void testCountNotEven_emptyArr_0()
	{
		Arrays2 arrays2 = new Arrays2();
		int[] c = {};
		int ch = arrays2.countNotEven(c);
		assertEquals(ch, 0);
	}
}
