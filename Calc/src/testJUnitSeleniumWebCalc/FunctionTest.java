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

public class FunctionTest
{
	static WebDriver driver=AllTests.driver;

	@Before
	public void beforMetod()
	{
		driver.navigate().refresh();
	}

	@Test
	public void test2Plus3()
	{
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btPlus")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEquals")).click();
		assertEquals("5",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test2Minus3()
	{
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btMinus")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEquals")).click();
		assertEquals("-1",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test2Mult3()
	{
		driver.findElement(By.id("bt2")).click();
		driver.findElement(By.id("btMult")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEquals")).click();
		assertEquals("6",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}

	@Test
	public void test6Div3()
	{
		driver.findElement(By.id("bt6")).click();
		driver.findElement(By.id("btDiv")).click();
		driver.findElement(By.id("bt3")).click();
		driver.findElement(By.id("btEquals")).click();
		assertEquals("2",
				driver.findElement(By.id("textFild")).getAttribute("value"));
	}
}
