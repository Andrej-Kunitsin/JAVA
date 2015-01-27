package Task;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4_28Test
{

	@Test
	public void testTestCondition_100()
	{
		int ch = 100;
		boolean b = Task4_28.testCondition(ch);
		assertFalse(b);
	}

	@Test
	public void testTestCondition_500()
	{
		int ch = 500;
		boolean b = Task4_28.testCondition(ch);
		assertFalse(b);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestCondition_99()
	{
		int ch = 99;
		Task4_28.testCondition(ch);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testTestCondition_1000()
	{
		int ch = 1000;
		Task4_28.testCondition(ch);
	}

}
