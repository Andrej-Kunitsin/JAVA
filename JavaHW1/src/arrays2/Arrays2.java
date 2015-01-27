package arrays2;


public class Arrays2
{
	// Посчитать количество нечетных элементов массива
	int countNotEven(int[] mass)
	{
		int count = 0;
		if (mass != null)
		{
			for (int i = 0; i < mass.length; i++)
			{
				if (mass[i] % 2 != 0)
				{
					count++;
				}
			}
		}
		return count;
	}

	// Поменять местами первую и вторую половину массива, например, для массива
	// 1 2 3 4, результат 3 4 1 2
	int[] exchangeArr(int[] arr)
	{
		int[] res = {};
		if (arr != null)
		{
			res = new int[arr.length];
			int midle;
			if (arr.length % 2 == 0)
			{
				midle = arr.length / 2;
			} else
			{
				midle = arr.length / 2 + 1;
				res[midle - 1] = arr[midle - 1];
			}
			for (int i = 0, j = midle; j < arr.length; i++, j++)
			{

				res[j] = arr[i];
				res[i] = arr[j];
			}
		}
		return res;
	}

	// Найти индекс максимального элемента массива
	int indexMaxArr(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int index = 0;
		int chMax = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > chMax)
			{
				chMax = arr[i];
				index = i;
			}
		}
		return index;
	}

	// Найти индекс минимального элемента массива
	int indexMinArr(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int index = 0;
		int chMin = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] < chMin)
			{
				index = i;
				chMin = arr[i];
			}
		}
		return index;
	}

	// Найти мaксимальный элемент массива
	int getMaxArr(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int chMax = arr[0];
		for (int i : arr)
		{
			if (i > chMax)
			{
				chMax = i;
			}
		}
		return chMax;
	}

	// Найти минимальный элемент массива
	int getMinArr(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int chMax = arr[0];
		for (int i : arr)
		{
			if (i < chMax)
			{
				chMax = i;
			}
		}
		return chMax;
	}

	// Сделать реверс массива (массив в обратном направлении)
	public int[] getReversArr(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			return new int[0];
		}
		int[] resArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--)
		{
			resArr[j] = arr[i];
			j++;
		}
		return resArr;
	}
public int[] getSortBubble(int[] arr)
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		for (int i = arr.length - 1; i >= 1; i--)
		{
			boolean sorted = true;
			for (int j = 0; j < i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted)
			{
				break;
			}
		}
		return arr;
	}

	
	// Посчитать сумму элементов массива с нечетными индексами
	int getSummElement(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (i % 2 != 0)
			{
				sum += arr[i];
			}
		}
		return sum;
	}

}
