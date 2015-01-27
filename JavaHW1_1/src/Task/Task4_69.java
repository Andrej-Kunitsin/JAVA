package Task;

// Даны 2 числа. Если квадратный корень из второго числа меньше первого, то
// увеличить второе чило в пять раз.

public class Task4_69
{
	static int work(int a, int b)
	{
		double q = Math.sqrt(b);
		if (q < a)
		{
			b *= 5;
		}
		return b;
	}

}
