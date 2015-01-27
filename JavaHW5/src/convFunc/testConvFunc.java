package convFunc;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testConvFunc {
	private ConFun conFan;

	@Before
	public void runBeforeEveryTest() {
		conFan = new ConFun();
	}

	@After
	public void runAfterEveryTest() {
		conFan = null;
	}

	@Test
	// преобразования: целого чиста в строку
	public void testIntToString() {
		int testInt = 15;
		String string = conFan.string(testInt);
		assertEquals("15", string);
	}

	@Test
	// преобразования: вещественного числа в строку
	public void testDoubleToString() {
		Double testDouble = 15.6;
		String string = conFan.string(testDouble);
		assertEquals("15.6", string);
	}


	@Test
	// преобразования: строки в целое число
	public void testStringToInt() {
		String stringTest = "15";
		int intager = conFan.intager(stringTest);
		assertEquals(15, intager);
	}
	@Test
	// преобразования: строки в вещественное число
	public void testStringToDouble() {
		String stringTest = "15.5";
		double dd = conFan.dDouble(stringTest);
		assertEquals(dd, 15.5, 0.01);
	}
}
