package function2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberToStringTest
{
	private Function function;

	@Before
	public void setUp()
	{
		function = new Function();
	}

	@After
	public void tearDown()
	{
		function = null;
	}
	
	@Test
	public void test0()
	{
		int pr = 0;
		String res = function.getString(pr);
		assertEquals("ноль", res);
	}

	@Test
	public void test5()
	{
		int pr = 5;
		String res = function.getString(pr);
		assertEquals("пять", res);
	}

	@Test
	public void test7()
	{
		int pr = 7;
		String res = function.getString(pr);
		assertEquals("семь", res);
	}

	@Test
	public void test10()
	{
		int pr = 10;
		String res = function.getString(pr);
		assertEquals("десять", res);
	}

	@Test
	public void test12()
	{
		int pr = 12;
		String res = function.getString(pr);
		assertEquals("двенадцать", res);
	}

	@Test
	public void test20()
	{
		int pr = 20;
		String res = function.getString(pr);
		assertEquals("двадцать", res);
	}

	@Test
	public void test28()
	{
		int pr = 28;
		String res = function.getString(pr);
		assertEquals("двадцать восемь", res);
	}

	@Test
	public void test100()
	{
		int pr = 100;
		String res = function.getString(pr);
		assertEquals("сто", res);
	}

	@Test
	public void test105()
	{
		int pr = 105;
		String res = function.getString(pr);
		assertEquals("сто пять", res);
	}

	@Test
	public void test110()
	{
		int pr = 110;
		String res = function.getString(pr);
		assertEquals("сто десять", res);
	}

	@Test
	public void test115()
	{
		int pr = 115;
		String res = function.getString(pr);
		assertEquals("сто пятьнадцать", res);
	}

	@Test
	public void test140()
	{
		int pr = 140;
		String res = function.getString(pr);
		assertEquals("сто сорок", res);
	}

	@Test
	public void test155()
	{
		int pr = 155;
		String res = function.getString(pr);
		assertEquals("сто пятьдесят пять", res);
	}

	@Test
	public void test999()
	{
		int pr = 999;
		String res = function.getString(pr);
		assertEquals("девятьсот девяносто девять", res);
	}

}
