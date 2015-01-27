package stringFunc;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testStringFunc
{
	private StringFunc sFunc;

	@Before
	public void runBeforeEveryTest()
	{
		sFunc = new StringFunc();
	}

	@After
	public void runAfterEveryTest()
	{
		sFunc = null;
	}

	// ====================================================
	// serchMinWord
	// ====================================================

	@Test(expected = NullPointerException.class)
	public void testLengthShort_null()
	{
		String string = null;
		sFunc.serchMinWord(string);
	}

	@Test
	public void testLengthShort_0()
	{
		String string = "";
		int i = sFunc.serchMinWord(string);
		assertEquals(i, 0);
	}

	@Test
	public void testLengthShort_1()
	{
		String string = "Привет";
		int i = sFunc.serchMinWord(string);
		assertEquals(6, i);
	}

	@Test
	public void testLengthShort_2()
	{
		String string = "Привет мир";
		int i = sFunc.serchMinWord(string);
		assertEquals(3, i);
	}

	@Test
	public void testLengthShort_many()
	{
		String string = "Привет, Мир, как, дела могли быть";
		int i = sFunc.serchMinWord(string);
		assertEquals(3, i);
	}

	// ====================================================
	// Change3LastSimbol
	// ====================================================

	@Test(expected = NullPointerException.class)
	public void testChange3LastSimbol_null()
	{
		String[] string = null;
		sFunc.change3LastSimbol(string, 5);
	}

	@Test
	public void testChange3LastSimbol_0()
	{
		String[] string = {};
		String[] exp = {};
		String[] returnString = sFunc.change3LastSimbol(string, 5);
		assertArrayEquals(exp, returnString);
	}

	@Test
	public void testChange3LastSimbol_1_true()
	{
		String[] string = { "Привет" };
		String[] exp = { "При$" };
		String[] returnString = sFunc.change3LastSimbol(string, 6);
		assertArrayEquals(exp, returnString);
	}

	@Test
	public void testChange3LastSimbol_1_false()
	{
		String[] string = { "Привет" };
		String[] exp = { "Привет" };
		String[] returnString = sFunc.change3LastSimbol(string, 4);
		assertArrayEquals(exp, returnString);
	}

	@Test
	public void testChange3LastSimbol_2_true()
	{
		String[] string = { "Привет", "Мир" };
		String[] exp = { "При$", "Мир" };
		String[] returnString = sFunc.change3LastSimbol(string, 6);
		assertArrayEquals(exp, returnString);
	}

	@Test
	public void testChange3LastSimbol_2_false()
	{
		String[] string = { "Привет", "Мир" };
		String[] exp = { "Привет", "Мир" };
		String[] returnString = sFunc.change3LastSimbol(string, 4);
		assertArrayEquals(exp, returnString);
	}

	@Test
	public void testChange3LastSimbol_many()
	{
		String[] string = { "Привет", "Мир", "как", "дела", "могли", "быть" };
		String[] returnString = { "Привет", "Мир", "как", "д$", "могли", "б$" };
		String[] i = sFunc.change3LastSimbol(string, 4);
		assertArrayEquals(returnString, i);
	}

	// ====================================================
	// InsertSpace
	// ====================================================

	@Test(expected = NullPointerException.class)
	public void testInsertSpace_Null()
	{
		String string = null;
		sFunc.insertSpace(string);
	}

	@Test
	public void testInsertSpace_0()
	{
		String string = "";
		String exp = "";
		String i = sFunc.insertSpace(string);
		assertEquals(exp, i);
	}

	@Test
	public void testInsertSpace_1()
	{
		String string = "Привет";
		String exp = "Привет";
		String i = sFunc.insertSpace(string);
		assertEquals(exp, i);
	}

	@Test
	public void testInsertSpace_2_true()
	{
		String string = "Привет,мир";
		String exp = "Привет, мир";
		String i = sFunc.insertSpace(string);
		assertEquals(exp, i);
	}

	@Test
	public void testInsertSpace_2_false()
	{
		String string = "Привет, мир";
		String exp = "Привет, мир";
		String i = sFunc.insertSpace(string);
		assertEquals(exp, i);
	}

	@Test
	public void testInsertSpace_many()
	{
		String string = "Привет,мир, как,дела, ла-ла-ла";
		String exp = "Привет, мир, как, дела, ла-ла-ла";
		String i = sFunc.insertSpace(string);
		assertEquals(exp, i);
	}

	// ====================================================
	// oneSimbol
	// ====================================================
	@Test(expected = NullPointerException.class)
	public void testOneSimbol_Null()
	{
		String string = null;
		sFunc.oneSimbol(string);
	}

	@Test
	public void testOneSimbol_0()
	{
		String string = "";
		String exp = "";
		String i = sFunc.oneSimbol(string);
		assertEquals(exp, i);
	}

	@Test
	public void testOneSimbol_1()
	{
		String string = "Приветик";
		String exp = "Приветк";
		String i = sFunc.oneSimbol(string);
		assertEquals(exp, i);
	}

	@Test
	public void testOneSimbol_2_true()
	{
		String string = "Привет,мир";
		String exp = "Привет,м";
		String i = sFunc.oneSimbol(string);
		assertEquals(exp, i);
	}

	@Test
	public void testOneSimbol_many()
	{
		String string = "Привет,мир, как,дела, ла-ла-ла";
		String exp = "Привет,м кадл-";
		String i = sFunc.oneSimbol(string);
		assertEquals(exp, i);
	}

	// ====================================================
	// countWord
	// ====================================================
	@Test(expected = NullPointerException.class)
	public void testCountWord_Null()
	{
		String string = null;
		sFunc.countNumWord(string);
	}

	@Test
	public void testCountWord_0()
	{
		String string = "";
		int exp = 0;
		int i = sFunc.countNumWord(string);
		assertEquals(exp, i);
	}

	@Test
	public void testCountWord_1()
	{
		String string = "Приветик";
		int i = sFunc.countNumWord(string);
		assertEquals(1, i);
	}

	@Test
	public void testCountWord_2_true()
	{
		String string = "Привет,мир";
		int i = sFunc.countNumWord(string);
		assertEquals(2, i);
	}

	@Test
	public void testCountWord_many()
	{
		String string = "Привет,мир, как,дела, ла-ла-ла";
		int i = sFunc.countNumWord(string);
		assertEquals(5, i);
	}

	// ====================================================
	// removePartsString
	// ====================================================
	@Test(expected = NullPointerException.class)
	public void testRemovePartsString_Null()
	{
		String string = null;
		sFunc.removePartsString(string, 5, 4);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemovePartsString_NotArg()
	{
		String string = "Привет";
		sFunc.removePartsString(string, 5, 4);
	}

	@Test
	public void testRemovePartsString_0()
	{
		String string = "";
		String exp = "";
		String i = sFunc.removePartsString(string, 0, 0);
		assertEquals(exp, i);
	}

	@Test
	public void testRemovePartsString_1()
	{
		String string = "Приветик";
		String exp = "Прив";
		String i = sFunc.removePartsString(string, 4, 4);
		assertEquals(exp, i);
	}

	@Test
	public void testRemovePartsString_2()
	{
		String string = "Привет,мир";
		String exp = "Привемир";
		String i = sFunc.removePartsString(string, 5, 2);
		assertEquals(exp, i);
	}

	@Test
	public void testRemovePartsString_many()
	{
		String string = "Привет,мир, как,дела, ла-ла-ла";
		String exp = "Привир, как,дела, ла-ла-ла";
		String i = sFunc.removePartsString(string, 4, 4);
		assertEquals(exp, i);
	}

	// ====================================================
	// reversString
	// ====================================================

	@Test(expected = NullPointerException.class)
	public void testReversString_Null()
	{
		String string = null;
		sFunc.reversString(string);
	}

	@Test
	public void testReversString_0()
	{
		String string = "";
		String exp = "";
		String i = sFunc.reversString(string);
		assertEquals(exp, i);
	}

	@Test
	public void testReversString_1()
	{
		String string = "П";
		String exp = "П";
		String i = sFunc.reversString(string);
		assertEquals(exp, i);
	}

	@Test
	public void testReversString_2_true()
	{
		String string = "Пр";
		String exp = "рП";
		String i = sFunc.reversString(string);
		assertEquals(exp, i);
	}

	@Test
	public void testReversString_many()
	{
		String string = "Привет мир";
		String exp = "рим тевирП";
		String i = sFunc.reversString(string);
		assertEquals(exp, i);
	}

	// ====================================================
	// DelLastWord
	// ====================================================

	@Test(expected = NullPointerException.class)
	public void testDelLastWord_Null()
	{
		String string = null;
		sFunc.deleteLastWord(string);
	}

	@Test
	public void testDelLastWord_0()
	{
		String string = "";
		String exp = "";
		String i = sFunc.deleteLastWord(string);
		assertEquals(exp, i);
	}

	@Test
	public void testDelLastWord_1()
	{
		String string = "Привет";
		String exp = "";
		String i = sFunc.deleteLastWord(string);
		assertEquals(exp, i);
	}

	@Test
	public void testDelLastWord_2()
	{
		String string = "Привет мир";
		String exp = "Привет";
		String i = sFunc.deleteLastWord(string);
		assertEquals(exp, i);
	}

	@Test
	public void testDelLastWord_many()
	{
		String string = "Привет мир как дела";
		String exp = "Привет мир как";
		String i = sFunc.deleteLastWord(string);
		assertEquals(exp, i);
	}
}
