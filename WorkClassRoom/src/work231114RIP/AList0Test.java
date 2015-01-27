package work231114RIP;

import static org.junit.Assert.*;

import org.junit.Test;

public class AList0Test
{
	// ======================================
	// max
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testMax_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getMaxArr();
	}

	@Test(expected = NullPointerException.class)
	public void testMax_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getMaxArr();
	}

	@Test
	public void testMax_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(10, res);
	}

	@Test
	public void testMax_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(20, res);
	}

	@Test
	public void testMax_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMaxArr();
		assertEquals(99, res);
	}

	// ======================================
	// min
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testMin_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getMinArr();
	}

	@Test(expected = NullPointerException.class)
	public void testMin_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getMinArr();
	}

	@Test
	public void testMin_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	@Test
	public void testMin_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	@Test
	public void testMin_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getMinArr();
		assertEquals(10, res);
	}

	// ======================================
	// maxIndex
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testMaxIndex_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getIndexMaxArr();
	}

	@Test(expected = NullPointerException.class)
	public void testMaxIndex_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getIndexMaxArr();
	}

	@Test
	public void testMaxIndex_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(0, res);
	}

	@Test
	public void testMaxIndex_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(1, res);
	}

	@Test
	public void testMaxIndex_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMaxArr();
		assertEquals(5, res);
	}

	// ======================================
	// minIndex
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testMinIndex_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getIndexMinArr();
	}

	@Test(expected = NullPointerException.class)
	public void testMinIndex_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getIndexMinArr();
	}

	@Test
	public void testMinIndex_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_2()
	{
		int[] zz = { 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	@Test
	public void testMinIndex_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		int res = xx.getIndexMinArr();
		assertEquals(0, res);
	}

	// ======================================
	// Revers
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testReversArr_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getReversArr();
	}

	@Test(expected = NullPointerException.class)
	public void testReversArr_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getReversArr();
	}

	@Test
	public void testReversArr_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.getArr();
		assertArrayEquals(zz, res);
	}

	@Test
	public void testReversArr_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20, 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testReversArr_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 32, 99, 24, 11, 77, 20, 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getReversArr();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// Sort
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testSortArr_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getSortBubble();
	}

	@Test(expected = NullPointerException.class)
	public void testSortArr_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getSortBubble();
	}

	@Test
	public void testSortArr_1()
	{
		int[] zz = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.getArr();
		assertArrayEquals(zz, res);
	}

	@Test
	public void testSortArr_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testSortArr_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 11, 20, 24, 32, 77, 99 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.getSortBubble();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// addEnd
	// ======================================
	@Test(expected = IndexOutOfBoundsException.class)
	public void testAddEnd_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addEnd(5);
	}

	@Test
	public void testAddEnd_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = { 10, 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10, 20, 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddEnd_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 99, 32, 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addEnd(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// delEnd
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testDelEnd_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delEnd();
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDelEnd_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delEnd();
	}

	@Test
	public void testDelEnd_1()
	{
		int[] zz = { 10 };
		int[] exp = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelEnd_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 10, 20, 77, 11, 24, 99 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delEnd();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// delStart
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testDelStart_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delStart();
	}

	@Test(expected = NullPointerException.class)
	public void testDelStart_0()
	{
		int[] zz = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delStart();
	}

	@Test
	public void testDelStart_1()
	{
		int[] zz = { 10 };
		int[] exp = {};
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testDelStart_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.delStart();
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// addStart
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testAddStart_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
	}

	@Test
	public void testAddStart_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_1()
	{
		int[] zz = { 10 };
		int[] exp = { 5, 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 5, 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddStart_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.getArr();
		assertArrayEquals(exp, res);
	}

	// ======================================
	// addPos
	// ======================================
	@Test(expected = NullPointerException.class)
	public void testAddPos_null()
	{
		int[] zz = null;
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
	}

	/*@Test
	public void testAddPos_0()
	{
		int[] zz = {};
		int[] exp = { 5 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.addPos();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddPos_1()
	{
		int[] zz = { 10 };
		int[] exp = { 5, 10 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.addPos();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddPos_2()
	{
		int[] zz = { 10, 20 };
		int[] exp = { 5, 10, 20 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.addPos();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testAddPos_many()
	{
		int[] zz = { 10, 20, 77, 11, 24, 99, 32 };
		int[] exp = { 5, 10, 20, 77, 11, 24, 99, 32 };
		AList0 xx = new AList0();
		xx.setArr(zz);
		xx.addStart(5);
		int[] res = xx.addPos();
		assertArrayEquals(exp, res);
	}*/
}
