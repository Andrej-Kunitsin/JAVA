package testJUnitSeleniumWebCalc;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementTest {
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
	public void testButton1() {
		assertFalse(driver.findElements(By.id("bt1")).isEmpty());
	}

	@Test
	public void testButton2() {
		assertFalse(driver.findElements(By.id("bt2")).isEmpty());
	}

	@Test
	public void testButton3() {
		assertFalse(driver.findElements(By.id("bt3")).isEmpty());
	}

	@Test
	public void testButton4() {
		assertFalse(driver.findElements(By.id("bt4")).isEmpty());
	}

	@Test
	public void testButton5() {
		assertFalse(driver.findElements(By.id("bt5")).isEmpty());
	}

	@Test
	public void testButton6() {
		assertFalse(driver.findElements(By.id("bt6")).isEmpty());
	}

	@Test
	public void testButton7() {
		assertFalse(driver.findElements(By.id("bt7")).isEmpty());
	}

	@Test
	public void testButton8() {
		assertFalse(driver.findElements(By.id("bt8")).isEmpty());
	}

	@Test
	public void testButton9() {
		assertFalse(driver.findElements(By.id("bt9")).isEmpty());
	}

	@Test
	public void testButton0() {
		assertFalse(driver.findElements(By.id("bt0")).isEmpty());
	}

	@Test
	public void testButtonPlus() {
		assertFalse(driver.findElements(By.id("btPlus")).isEmpty());
	}

	@Test
	public void testButtonMinus() {
		assertFalse(driver.findElements(By.id("btMinus")).isEmpty());
	}

	@Test
	public void testButtonMult() {
		assertFalse(driver.findElements(By.id("btMult")).isEmpty());
	}

	@Test
	public void testButtonDev() {
		assertFalse(driver.findElements(By.id("btDiv")).isEmpty());
	}

	@Test
	public void testButtonEquals() {
		assertFalse(driver.findElements(By.id("btEquals")).isEmpty());
	}

	@Test
	public void testButtonBack() {
		assertFalse(driver.findElements(By.id("btBack")).isEmpty());
	}

	@Test
	public void testButtonDisplay() {
		assertFalse(driver.findElements(By.id("textFild")).isEmpty());
	}
}
