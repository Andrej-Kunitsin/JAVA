package queryList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueryListTest
{
	static QueryInterface query;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		query = new QueryList();
	}

	@Before
	public void setUp() throws Exception
	{
	query = null;	
	}

	
	@Test(expected = NullPointerException.class)
	public void testInit_NULL()
	{
		Integer[] o = null;
		query.init(o);
	}

	@Test
	public void testInit_0()
	{
		Integer[] zz = {};
		Integer[] exp = {};
		query.init(zz);
		Integer[] res = (Integer[]) query.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testInit_1()
	{
		Integer a = new Integer(10);
		Integer[] zz = { a };
		Integer[] exp ={a};
		query.init(zz);
		Integer[] res = (Integer[]) query.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testInit_2()
	{
	Integer[] zz = { 10, 15 };
		Integer[] exp = { 10, 15 };
		query.init(zz);
		Integer[] res = (Integer[]) query.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public void testInit_many()
	{
		Integer[] zz = { 10, 15, 20, 25, 30 };
		Integer[] exp = { 10, 15, 20, 25, 30 };
		query.init(zz);
		Integer[] res = (Integer[]) query.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public final void testAdd()
	{
		Integer[] zz = { 10, 15, 20, 25, 30 };
		Integer[] exp = { 10, 15, 20, 25, 30 };
		query.init(zz);
		Integer[] res = (Integer[]) query.toArray();
		assertArrayEquals(exp, res);
	}

	@Test
	public final void testDel()
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testSize()
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testClear()
	{
		fail("Not yet implemented");
	}

	@Test
	public final void testToArray()
	{
		fail("Not yet implemented");
	}

}
