package queryList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QueryListTest {
	QueryInterface query;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		query = new QueryList();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInit() {
		int[] in = { 1, 2, 3 };
		query.init(in);
		assertArrayEquals(in, query.toArray());
	}

	@Test
	public void testAdd() {
		int[] in = { 1, 2, 3 };
		query.init(in);
		query.add(9);
		int[] exp = { 1, 2, 3, 9 };
		assertArrayEquals(exp, query.toArray());
	}

	@Test
	public void testDel() {
		int[] in = { 1, 2, 3 };
		query.init(in);
	
		assertEquals(1, query.del());
	}

	@Test
	public void testSize() {
		int[] in = { 1, 2, 3 };
		query.init(in);
		assertEquals(3, query.size());
	}

	@Test
	public void testClear() {
		int[] in = { 1, 2, 3 };
		query.init(in);
		query.clear();
		assertEquals(null, query.toArray());
	}

	@Test
	public void testToArray() {
		int[] in = { 1, 2, 3 };
		query.init(in);
		assertEquals(in, query.toArray());
	}

}
