package work141214;

public class Main
{

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6 };
		printArray(a);
		System.out.println();
		printArrayRec(a);
		System.out.println();
		System.out.println(fact(4));
		System.out.println(factRec(4));
		printString("Привет мир");
		System.out.println();
		printString("Привет мир");
		System.out.println();
		System.out.println(sumNumber(324));
		System.out.println(sumNumberRec(324));
		engRec();

	}

	static void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]);
		}
	}

	static public void printArrayRec(int[] a)
	{
		pa(a, 0);
	}

	static private void pa(int[] a, int i)
	{
		if (i >= a.length)
			return;
		System.out.print(a[i]);
		pa(a, i + 1);
	}

	static void printString(String string)
	{
		for (int i = 0; i < string.length(); i++)
		{
			System.out.print(string.charAt(i));
		}
	}

	static public void printStringRec(String string)
	{
		ps(string, 0);
	}

	static private void ps(String string, int i)
	{
		if (i >= string.length())
			return;
		System.out.println(string.charAt(i));
		ps(string, i + 1);
	}

	static int fact(int n)
	{
		int res = 1;
		for (int i = n; i >= 1; i--)
		{
			res *= i;
		}
		return res;
	}

	static int factRec(int n)
	{
		int res;
		if (n == 1)
		{
			return 1;
		}
		res = factRec(n - 1) * n;
		return res;
	}

	static int sumNumber(int n)
	{
		int sum = 0;
		while (n != 0)
		{
			sum += n % 10;
			n /= 10;
		}
		sum = Math.abs(sum);
		return sum;
	}

	static int sumNumberRec(int n)
	{
		if (n == 0)
			return 0;
		int sum = 0;
		sum = sumNumberRec(n / 10) + n % 10;
		return sum;
	}

	static public void engRec()
	{
		pa(65);
	}

	static private void pa(int i)
	{
		if (i > 90)
		{
			
			if (i+6 >= 123)
			{
				return;
			}
			System.out.print((char) (i+6));
			pa(i + 1);
		} else
		{
			System.out.print((char) i);
			pa(i + 1);
		}
	}
}
