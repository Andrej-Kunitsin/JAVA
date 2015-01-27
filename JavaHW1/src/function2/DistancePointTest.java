package function2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DistancePointTest
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

	@Test(expected = IllegalArgumentException.class)
	public final void testGetDistance_allNull()
	{
		function.getDistance(null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testGetDistance_xNull()
	{
		int[] x = { 1, 2 };
		function.getDistance(x, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testGetDistance_yNull()
	{
		int[] y = { 1, 1 };
		function.getDistance(null, y);
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testGetDistance_badLength_ar0()
	{
		int[] x = {};
		int[] y = { 1, 1 };
		function.getDistance(x, y);
	}

	@Test(expected = IllegalArgumentException.class)
	public final void testGetDistance_badLength()
	{
		int[] x = { 1 };
		int[] y = { 1, 1 };
		function.getDistance(x, y);
	}

	@Test
	public final void testGetDistance_oneQuarter()
	{
		int[] x = { 1, 1 };
		int[] y = { 2, 2 };
		double res = function.getDistance(x, y);
		assertEquals(1.4142, res, 1e-4);
	}

	@Test
	public final void testGetDistance_oppositeQuarter()
	{
		int[] x = { 1, 1 };
		int[] y = { -1, -1 };
		double res = function.getDistance(x, y);
		assertEquals(2.8284, res, 1e-4);
	}

	@Test
	public final void testGetDistance_nearbyQuarter()
	{
		int[] x = { 1, 1 };
		int[] y = { -1, 1 };
		double res = function.getDistance(x, y);
		assertEquals(2.0, res, 1e-4);
	}

	@Test
	public final void testGetDistance_oneExys()
	{
		int[] x = { 1, 0 };
		int[] y = { 1, 1 };
		double res = function.getDistance(x, y);
		assertEquals(1.0, res, 1e-4);
	}

	@Test
	public final void testGetDistance_oneCentr()
	{
		int[] x = { 0, 0 };
		int[] y = { 1, 1 };
		double res = function.getDistance(x, y);
		assertEquals(1.4142, res, 1e-4);
	}

	@Test
	public final void testGetDistance_identical()
	{
		int[] x = { 1, 1 };
		int[] y = { 1, 1 };
		double res = function.getDistance(x, y);
		assertEquals(0, res, 1e-4);
	}
}
