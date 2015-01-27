package function2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringToNumberTest {
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
	// Вводим строку, которая содержит число, написанное прописью (0-999).
    // Получить само число
    
	@Test
    public void testNumber0(){
        //однозначное число
        String string = "ноль";
        int i = function.getNumber(string);
        assertEquals(0,i);
    }

    @Test
    public void testNumber1() {
        //однозначное число
        String string = "один";
        int i = function.getNumber(string);
        assertEquals(1, i);
    }

    @Test
    public void testNumber9() {
        String string = "девять";
        int i = function.getNumber(string);
        assertEquals(9, i);
    }

    @Test
    public void testNumber10() {
        String string = "десять";
        int i = function.getNumber(string);
        assertEquals(10,i);
    }

    @Test
    public void testNumber11() {
        String string = "одинадцать";
        int i = function.getNumber(string);
        assertEquals(11,i);
    }

    @Test
    public void testNumber19() {
        String string = "девятьнадцать";
        int i = function.getNumber(string);
        assertEquals(19,i);
    }
    @Test
    public void testNumber30() {
        String string = "тридцать";
        int i = function.getNumber(string);
        assertEquals(30,i);
    }
    
    @Test
    public void testNumber66() {
        String string = "шестьдесят шесть";
        int i = function.getNumber(string);
        assertEquals(66,i);
    }
    
    @Test
    public void testNumber200() {
        String string = "двести";
        int i = function.getNumber(string);
        assertEquals(200,i);
    }
    @Test
    public void testNumber205() {
        String string = "двести пять";
        int i = function.getNumber(string);
        assertEquals(205,i);
    }
    @Test
    public void testNumber210() {
        String string = "двести десять";
        int i = function.getNumber(string);
        assertEquals(210,i);
    }
    @Test
    public void testNumber211() {
        String string = "двести одинадцать";
        int i = function.getNumber(string);
        assertEquals(211,i);
    }@Test
    public void testNumber230() {
        String string = "двести тридцать";
        int i = function.getNumber(string);
        assertEquals(230,i);
    }
    @Test
    public void testNumber236() {
        String string = "двести тридцать шесть";
        int i = function.getNumber(string);
        assertEquals(236,i);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testNumber1000() {
        function.getNumber("тысяча");
        }
    @Test(expected = IllegalArgumentException.class)
    public void testNumber_1() {
        function.getNumber("минус один");
        }
    
}
