import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		File f = new File(
				"D:\\Programming\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("file:///D:/Programming/HTML/My%20first%20HTML/Calc.html");
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
		driver.quit();
	}

	@After
	public void afterMetod() {
		driver.findElement(By.id("btBack")).click();
	}

	@Test
	public void testPress1() {
		driver.findElement(By.id("bt1")).click();
		assertEquals("1",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress2() {
		driver.findElement(By.id("bt2")).click();
		assertEquals("2",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress3() {
		driver.findElement(By.id("bt3")).click();
		assertEquals("3",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress4() {
		driver.findElement(By.id("bt4")).click();
		assertEquals("4",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress5() {
		driver.findElement(By.id("bt5")).click();
		assertEquals("5",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress6() {
		driver.findElement(By.id("bt6")).click();
		assertEquals("6",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress7() {
		driver.findElement(By.id("bt7")).click();
		assertEquals("7",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress8() {
		driver.findElement(By.id("bt8")).click();
		assertEquals("8",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress9() {
		driver.findElement(By.id("bt1")).click();
		assertEquals("1",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPress0() {
		driver.findElement(By.id("bt0")).click();
		assertEquals("0",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressPlus() {
		driver.findElement(By.id("btPlus")).click();
		assertEquals("+",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressMinus() {
		driver.findElement(By.id("btMinus")).click();
		assertEquals("-",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressMult() {
		driver.findElement(By.id("btMult")).click();
		assertEquals("*",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressDiv() {
		driver.findElement(By.id("btDiv")).click();
		assertEquals("/",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test2Plus3() {
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btPlus")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEqual")).click();
		assertEquals("5",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test2Minus3() {
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btMinus")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEqual")).click();
		assertEquals("-1",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test2Mult3() {
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btMult")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEqual")).click();
		assertEquals("6",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test6Div3() {
		driver.findElement(By.id("bt6")).click();
		driver.findElement(By.id("btDiv")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEqual")).click();
		assertEquals("2",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}
}
