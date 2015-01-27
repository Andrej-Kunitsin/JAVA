package calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest
{

	@Test
	public void testPlus()
	{
		int res = Main.calc(10, 5, "+");
		assertEquals(15, res);
	}
	@Test
	public void testMinus()
	{
		int res = Main.calc(10, 5, "-");
		assertEquals(5, res);
	}@Test
	public void testMul()
	{
		int res = Main.calc(10, 5, "*");
		assertEquals(50, res);
	}@Test
	public void testDev()
	{
		int res = Main.calc(10, 5, "/");
		assertEquals(2, res);
		
	}
}
