package testJUnitSeleniumWebCalc;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Suite.class)
@SuiteClasses(
{ FindElementTest.class, PressedElementTest.class,
		MultiPressedElementTest.class, FunctionTest.class })
public class AllTests
{
	public static WebDriver driver;

	@BeforeClass
	public static void b()
	{
		File f = new File("/media/jack_killer/work/MyProgramming/chromedriver");
		// File f = new File(
		// "D:\\Programming\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f.getAbsolutePath());
		driver = new ChromeDriver();
		driver.get("file:///media/jack_killer/work/MyProgramming/HTML/My%20first%20HTML/Calc.html");
		// driver.get("file:///D:/Programming/HTML/My%20first%20HTML/Calc.html");}

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		driver.close();
	}

	public AllTests()
	{
	}
}
