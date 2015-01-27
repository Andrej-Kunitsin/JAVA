package conditionalStatments2;

public class ConditionalStatments
{

	//1.Если а – четное посчитать а*б, иначе а+б
	int vol(int a,int b)
	{
		return a % 2 == 0 ? a * b :  a + b;
	}

	int chetv(int x, int y)
	{
		int res = 0;
		if (x > 0 && y > 0)
		{
			res = 1;
		} else if (x > 0 && y < 0)
		{
			res = 2;
		} else if (x < 0 && y < 0)
		{
			res = 3;
		} else if (x < 0 && y > 0)
		{
			res = 4;
		} else
		{
			throw new IllegalArgumentException();
		}
		return res;
	}

	int max(int a, int b, int c)
	{
		int res;
		if ((a * b * c) >= (a + b + c))
			res = (a * b * c) + 3;
		else
			res = a + b + c + 3;
		return res;
	}
	int summ(int a, int b, int c)
	{
		int sum = 0;
		if (a >= 0)
		{
			sum += a;
		}
		if (b >= 0)
		{
			sum += b;
		}
		if (c >= 0)
		{
			sum += c;
		}
		return sum;
	
	}

	String evolution(int rating)
	{
		String evol = null;
		if (rating >= 0 && rating <= 19)
		{
			evol = "F";
		}
		else if (rating >= 20 && rating <= 39)
		{
			evol = "E";
		}
		else if (rating >= 40 && rating <= 59)
		{
			evol = "D";
		}
		else if (rating >= 60 && rating <= 74)
		{
			evol = "C";
		}
		else if (rating >= 75 && rating <= 89)
		{
			evol = "B";
		}
		else if (rating >= 90 && rating <= 100)
		{
			evol = "A";
		}
		return evol;
	}

}
