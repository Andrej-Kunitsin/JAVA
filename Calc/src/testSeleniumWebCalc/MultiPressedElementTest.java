package testSeleniumWebCalc;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiPressedElementTest {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// File f = new
		// File("/media/jack_killer/work/MyProgramming/chromedriver");
		File f = new File(
				"D:\\Programming\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
		driver = new ChromeDriver();
		// driver.get("file:///media/jack_killer/work/MyProgramming/HTML/My%20first%20HTML/Calc.html");
		driver.get("file:///D:/Programming/HTML/My%20first%20HTML/Calc.html");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		driver.navigate().refresh();
	}

	@Test
	public void testPressedAllNum() {
		driver.findElement(By.id("bt1")).click();
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("bt4")).click();
		driver.findElement(By.id("bt5")).click();
		driver.findElement(By.id("bt6")).click();
		driver.findElement(By.id("bt7")).click();
		driver.findElement(By.id("bt8")).click();
		driver.findElement(By.id("bt9")).click();
		driver.findElement(By.id("bt0")).click();
		assertEquals("1234567890", driver.findElement(By.id("textFild"))
				.getAttribute("value"));
	}

	@Test
	public void testPressedDoubleClick() {
		WebElement el = driver.findElement(By.id("bt1"));
		el.click();
		el.click();
		assertEquals("11",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressedNum1OpPlus() {
		driver.findElement(By.id("bt1")).click();
		driver.findElement(By.id("btPlus")).click();
		assertEquals("1+",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressedNum2OpMinus() {
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btMinus")).click();
		assertEquals("2-",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void testPressedPlusPlus() {
		driver.findElement(By.id("btPlus")).click();
		driver.findElement(By.id("btPlus")).click();
		assertEquals("0+",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}
}