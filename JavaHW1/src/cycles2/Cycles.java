package cycles2;

public class Cycles
{
	// Вычислить факториал числа n. n! = 1*2*…*n-1*n;
	 int mFackt(int ch)
	{
		int fack = 1;
		if (ch > 0)
		{
			for (int i = ch; i >= 1; i--)
			{
				fack *= i;
			}
		} else
		{
			fack = -1;
		}
		return fack;
	}

	// Проверить простое ли число?
	 boolean isPrime(int ch)
	{
		boolean test = true;
		if (ch < 2)
		{
			return false;
		}
		for (int i = 2; i * i <= ch; i++)
		{
			if (ch % i == 0)
			{
				test = false;
			}
		}
		return test;
	}

	// Вывести число, которое является зеркальным отображением
	// последовательности цифр заданного числа, например, задано число 123,
	// вывести 321.
	 int getReflex(int ch)
	{
		int ref = 0;
		while (ch != 0)
		{
			ref = ref * 10 + ch % 10;
			ch /= 10;
		}
		ref = Math.abs(ref);
		return ref;
	}

	// Найти корень натурального числа с точностью до целого (рассмотреть
	// вариант последовательного подбора и метод бинарного поиска)
	 int sqrt(int ch)
	{
		int res = 0;
		if (ch != 0)
		{
			do
			{
				res++;
			} while (res * res <= ch);
		}
		return --res;
	}

	// Найти сумму четных чисел и их количество в диапазоне от 1 до 99
	 int[] summCount(int startDiap, int finishDiap)
	{
		int[] count = new int[2];
		for (int i = startDiap; i < finishDiap; i++)
		{
			if (i % 2 == 0)
			{
				count[0] += i;
				count[1]++;
			}
		}
		return count;
	}

	// Посчитать сумму цифр заданного числа
	 int summ(int ch)
	{
		int sum = 0;
		while (ch != 0)
		{
			sum += ch % 10;
			ch /= 10;
		}
		sum = Math.abs(sum);
		return sum;
	}

}
