package Task;
//Даны четыре целых числа. Определить сколько из них четных
public class Task4_74
{
	public static int getCount(int[] mass)
	{
		int count = 0;
		for (int i : mass)
		{
			if (i % 2 == 0)
				count++;
		}
		return count;
	}
}
