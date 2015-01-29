package testSeleniumWebCalc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FindElementTest.class, PressedElementTest.class,
		MultiPressedElementTest.class, FunctionTest.class })
public class AllTests {

}
