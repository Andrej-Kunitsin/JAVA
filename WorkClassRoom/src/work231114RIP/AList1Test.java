package work231114RIP;

import static org.junit.Assert.*;

import org.junit.Test;

public class AList1Test
{
	// ======================================
	// max
	// ======================================

	@Test
	public void testMax_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(10, res);
	}

	@Test
	public void testMax_2()
	{
		int[] zz = { 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(20, res);
	}

	@Test
	public void testMax_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(99, res);
	}

	// ======================================
	// min
	// ======================================

	@Test
	public void testMin_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	@Test
	public void testMin_2()
	{
		int[] zz = { 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	@Test
	public void testMin_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	// ======================================
	// maxIndex
	// ======================================

	@Test
	public void testMaxIndex_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(0, res);
	}

	@Test
	public void testMaxIndex_2()
	{
		int[] zz = { 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(1, res);
	}

	@Test
	public void testMaxIndex_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(5, res);
	}

	// ======================================
	// minIndex
	// ======================================

	@Test
	public void testMinIndex_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_2()
	{
		int[] zz = { 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	// ======================================
	// Revers
	// ======================================

	@Test
	public void testReversArr_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.toArray();
		assertArrayEquals(zz, res);
	}

	@Test
	public void testReversArr_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20, 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testReversArr_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 32, 99, 24, 11, 77, 20, 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// Sort
	// ======================================
	@Test
	public void testSortArr_1()
	{
		int[] zz = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.toArray();
		assertArrayEquals(zz, res);
	}

	@Test
	public void testSortArr_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testSortArr_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 11, 20, 24, 32, 77, 99 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// addEnd
	// ======================================

	@Test
	public void testAddEnd_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10, 5 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 20, 5 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 99, 32, 5 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// delEnd
	// ======================================

	@Test
	public void testDelEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = {};
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 99 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// delStart
	// ======================================

	@Test
	public void testDelStart_1()
	{
		int[] zz = { 10 };
		int[] exp = {};
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// addStart
	// ======================================

	@Test
	public void testAddStart_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_1()
	{
		int[] zz = { 10 };
		int[] exp = { 5, 10 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 5, 10, 20 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32 };
		AList1 xx = new AList1();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.toArray();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// size
	// ======================================

	@Test
	public void testSize_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int exp = 7;
		AList1 xx = new AList1();
		xx.setArr(zz);
		int res = xx.size();
		assertEquals(exp, res);
	}
	// ======================================
	// addPos
	// ======================================

	/*
	 * @Test public void testAddPos_0() { int[] zz = {}; int[] exp = { 5 };
	 * AList1 xx = new AList1(); xx.setArr(zz); xx.addStart(5); int[] res =
	 * xx.addPos(); assertArrayEquals(exp, res); }
	 * 
	 * @Test public void testAddPos_1() { int[] zz = { 10 }; int[] exp = { 5, 10
	 * }; AList1 xx = new AList1(); xx.setArr(zz); xx.addStart(5); int[] res =
	 * xx.addPos(); assertArrayEquals(exp, res); }
	 * 
	 * @Test public void testAddPos_2() { int[] zz = { 10, 20 }; int[] exp = {
	 * 5, 10, 20 }; AList1 xx = new AList1(); xx.setArr(zz); xx.addStart(5);
	 * int[] res = xx.addPos(); assertArrayEquals(exp, res); }
	 * 
	 * @Test public void testAddPos_many() { int[] zz = { 10, 20, 77, 11, 24,
	 * 99, 32 }; int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32 }; AList1 xx = new
	 * AList1(); xx.setArr(zz); xx.addStart(5); int[] res = xx.addPos();
	 * assertArrayEquals(exp, res); }
	 */
}
