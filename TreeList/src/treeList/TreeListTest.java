package treeList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TreeListTest
{
	TreeInterface tree;

	@Before
	public void setUp() throws Exception
	{
		tree = new TreeList();
	}

	@Test
	public final void testSize_null()
	{
		int[] inArray = null;
		int ex = 0;
		tree.init(inArray);
		assertEquals(ex, tree.size());
	}

	@Test
	public final void testSize_0()
	{
		int[] inArray = {};
		int ex = 0;
		tree.init(inArray);
		assertEquals(ex, tree.size());
	}

	@Test
	public final void testSize_1()
	{
		int[] inArray = { 3 };
		int ex = 1;
		tree.init(inArray);
		assertEquals(ex, tree.size());
	}

	@Test
	public final void testSize_2()
	{
		int[] inArray = { 4, 3 };
		int ex = 2;
		tree.init(inArray);
		assertEquals(ex, tree.size());
	}

	@Test
	public final void testSize_Many()
	{
		int[] inArray = { 5, 7, 4, 3, 7 };
		int ex = 5;
		tree.init(inArray);
		assertEquals(ex, tree.size());
	}

	@Test
	public final void testAdd_null()
	{
		int[] inArray = null;
		int val = 4;
		int[] ex = { 4 };
		tree.init(inArray);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testAdd_0()
	{
		int[] inArray = {};
		int val = 4;
		int[] ex = { 4 };
		tree.init(inArray);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testAdd_1()
	{
		int[] inArray = { 4 };
		int val = 6;
		int[] ex = { 4, 6 };
		tree.init(inArray);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testAdd_2()
	{
		int[] inArray = { 5, 3 };
		int val = 4;
		int[] ex = { 3, 4, 5 };
		tree.init(inArray);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testAdd_Many()
	{
		int[] inArray = { 3, 7, 12, 9, 2 };
		int val = 4;
		int[] ex = { 2, 3, 4, 7, 9, 12 };
		tree.init(inArray);
		tree.add(val);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testInit_Null()
	{
		int[] inArray = null;
		int[] ex = {};
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testInit_0()
	{
		int[] inArray = {};
		int[] ex = {};
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testInit_1()
	{
		int[] inArray = { 5 };
		int[] ex = { 5 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testInit_2()
	{
		int[] inArray = { 4, 3 };
		int[] ex = { 3, 4 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testInit_Many()
	{
		int[] inArray = { 5, 8, 3, 9, 15 };
		int[] ex = { 3, 5, 8, 9, 15 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToArray_Null()
	{
		int[] inArray = null;
		int[] ex = {};
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToArray_0()
	{
		int[] inArray = {};
		int[] ex = {};
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToArray_1()
	{
		int[] inArray = { 5 };
		int[] ex = { 5 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToArray_2()
	{
		int[] inArray = { 4, 3 };
		int[] ex = { 3, 4 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToArray_Many()
	{
		int[] inArray = { 5, 8, 3, 9, 15 };
		int[] ex = { 3, 5, 8, 9, 15 };
		tree.init(inArray);
		assertArrayEquals(ex, tree.toArray());
	}

	@Test
	public final void testToString_Null()
	{
		int[] inArray = null;
		String ex = "";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
	}

	@Test
	public final void testToString_0()
	{
		int[] inArray = {};
		String ex = "";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
	}

	@Test
	public final void testToString_1()
	{
		int[] inArray = {5};
		String ex = "5";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
		}

	@Test
	public final void testToString_2()
	{
		int[] inArray = {5,6};
		String ex = "5, 6";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
	}

	@Test
	public final void testToString_Many()
	{
		int[] inArray = { 5, 8, 3, 9, 15 };
		String ex = "3, 5, 8, 9, 15";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
	}

	
	@Test
	public final void testCountLeafs()
	{
		
	}

	@Test
	public final void testCountNodes()
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testWidth()
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testHeight()
	{
		fail("Not yet implemented");
	}

}
