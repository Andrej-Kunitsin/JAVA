package conditionalStatments2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RatingTest
{
	private ConditionalStatments statments = new ConditionalStatments();

	@Before
	public void setUp()
	{
		statments = new ConditionalStatments();
	}

	@After
	public void tearDown()
	{
		statments = null;
	}

	@Test
	public void testStudents1()
	{
		int a = 1;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "F");
	}

	@Test
	public void testStudents2()
	{
		int a = 15;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "F");
	}

	@Test
	public void testStudents3()
	{
		int a = 19;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "F");
	}

	@Test
	public void testStudentsE1()
	{
		int a = 20;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "E");
	}

	@Test
	public void testStudentsE2()
	{
		int a = 26;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "E");
	}

	@Test
	public void testStudentsE3()
	{
		int a = 39;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "E");
	}

	@Test
	public void testStudentsD1()
	{
		int a = 40;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "D");
	}

	@Test
	public void testStudentsD2()
	{
		// D
		int a = 48;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "D");
	}

	@Test
	public void testStudentsD3()
	{
		int a = 59;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "D");
	}

	@Test
	public void testStudentsC1()
	{
		int a = 60;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "C");
	}

	@Test
	public void testStudentsC2()
	{
		int a = 71;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "C");
	}

	@Test
	public void testStudentsC3()
	{
		int a = 74;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "C");
	}

	@Test
	public void testStudentsB1()
	{
		int a = 75;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "B");
	}

	@Test
	public void testStudentsB2()
	{
		int a = 80;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "B");
	}

	@Test
	public void testStudentsB3()
	{
		int a = 89;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "B");
	}

	@Test
	public void testStudentsA1()
	{
		int a = 90;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "A");
	}

	@Test
	public void testStudentsA2()
	{
		int a = 98;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "A");
	}

	@Test
	public void testStudentsA3()
	{
		int a = 100;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, "A");
	}

	@Test
	public void testStudentsErr()
	{
		int a = 101;
		String rat;
		rat = statments.evolution(a);
		assertEquals(rat, null);
	}
}
