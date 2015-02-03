package testJUnitSeleniumWebCalc;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressedElementTest {
	static WebDriver driver=AllTests.driver;

	
	@Before
	public void setUp() throws Exception {
		driver.navigate().refresh();
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
	public void testPressBack() {
		driver.findElement(By.id("btBack")).click();
		assertEquals("",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}@Test
	public void testPressEquals() {
		driver.findElement(By.id("btEquals")).click();
		assertEquals("",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}
}