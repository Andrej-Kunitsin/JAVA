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
		tree = new BsTree();
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
		int[] inArray = { 5 };
		String ex = "5";
		tree.init(inArray);
		assertEquals(ex, tree.toString());
	}

	@Test
	public final void testToString_2()
	{
		int[] inArray = { 5, 6 };
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
	public final void testCountLeafs_Null()
	{
		int[] inArray = null;
		tree.init(inArray);
		assertEquals(0, tree.countLeafs());
	}

	@Test
	public final void testCountLeafs_0()
	{
		int[] inArray = {};
		tree.init(inArray);
		assertEquals(0, tree.countLeafs());
	}

	@Test
	public final void testCountLeafs_1()
	{
		int[] inArray = { 5 };
		tree.init(inArray);
		assertEquals(1, tree.countLeafs());
	}

	@Test
	public final void testCountLeafs_2l()
	{
		int[] inArray = { 5, 1 };
		tree.init(inArray);
		assertEquals(1, tree.countLeafs());
	}

	@Test
	public final void testCountLeafs_2r()
	{
		int[] inArray = { 1, 5 };
		tree.init(inArray);
		assertEquals(1, tree.countLeafs());
	}

	@Test
	public final void testCountLeafs_Many()
	{
		int[] inArray = { 10, 5, 15, 22, 1, 6 };
		tree.init(inArray);
		assertEquals(3, tree.countLeafs());
	}

	@Test
	public final void testCountNodes_Null()
	{
		int[] inArray = null;
		tree.init(inArray);
		assertEquals(0, tree.countNodes());
	}

	@Test
	public final void testCountNodes_0()
	{
		int[] inArray = {};
		tree.init(inArray);
		assertEquals(0, tree.countNodes());
	}

	@Test
	public final void testCountNodes_1()
	{
		int[] inArray = { 5 };
		tree.init(inArray);
		assertEquals(0, tree.countNodes());
	}

	@Test
	public final void testCountNodes_2l()
	{
		int[] inArray = { 5, 1 };
		tree.init(inArray);
		assertEquals(1, tree.countNodes());
	}

	@Test
	public final void testCountNodes_2r()
	{
		int[] inArray = { 1, 5 };
		tree.init(inArray);
		assertEquals(1, tree.countNodes());
	}

	@Test
	public final void testCountNodes_Many()
	{
		int[] inArray = { 10, 5, 15, 22, 1, 6, 4 };
		tree.init(inArray);
		assertEquals(4, tree.countNodes());
	}

	@Test
	public final void testWidth_Null()
	{
		int[] inArray = null;
		tree.init(inArray);
		assertEquals(0, tree.width());
	}

	@Test
	public final void testWidth_0()
	{
		int[] inArray = {};
		tree.init(inArray);
		assertEquals(0, tree.width());
	}

	@Test
	public final void testWidth_1()
	{
		int[] inArray = {4};
		tree.init(inArray);
		assertEquals(1, tree.width());
	}
	
	@Test
	public final void testWidth_2()
	{
		int[] inArray = {4,7};
		tree.init(inArray);
		assertEquals(2, tree.width());
	}
	@Test
	public final void testWidth_many()
	{
		int[] inArray = { 10, 5, 15, 22, 1, 6, 4 };
		tree.init(inArray);
		assertEquals(3, tree.width());
	}

	@Test
	public final void testHeight()
	{
		fail("Not yet implemented");
	}
@Test
public final void test(){
	int[] inArray = { 10, 5, 15, 22, 1, 6, 4 };
	tree.init(inArray);
	tree.print();
}
}
