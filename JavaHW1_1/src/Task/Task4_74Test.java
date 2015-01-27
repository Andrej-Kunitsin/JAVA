package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_74Test
{

	@Test
	public void testGetCount()
	{
		int[]chs = {15,15,15,15};
		int res = Task4_74.getCount(chs);
		assertEquals(0, res);
	}
	@Test
	public void testGetCount2()
	{
		int[]chs = {15,15,15,20};
		int res = Task4_74.getCount(chs);
		assertEquals(1, res);
	}@Test
	public void testGetCount3()
	{
		int[]chs = {20,15,17,15};
		int res = Task4_74.getCount(chs);
		assertEquals(1, res);
	}@Test
	public void testGetCount4()
	{
		int[]chs = {15,15,-20,100};
		int res = Task4_74.getCount(chs);
		assertEquals(2, res);
	}@Test
	public void testGetCount5()
	{
		int[]chs = {18,48,106,6};
		int res = Task4_74.getCount(chs);
		assertEquals(4, res);
	}

}
