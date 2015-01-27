package work231114RIP;

public class AList0
{
	private int[] arr = null;

	public void setArr(int[] arr)
	{
		init(arr);
	}

	public void init(int[] arr)
	{
		if (arr != null)
		{
			int[] tmp = new int[arr.length];
			for (int i = 0; i < tmp.length; i++)
			{
				tmp[i] = arr[i];
			}
			this.arr = tmp;
		} else
			this.arr = null;
	}

	public int[] getArr()
	{
		int[] res = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			res[i] = arr[i];
		}
		return res;
	}

	// Найти мaксимальный элемент массива
	public int getMaxArr()
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
	public int getMinArr()
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

	// Найти индекс максимального элемента массива
	public int getIndexMaxArr()
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
	public int getIndexMinArr()
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

	// Сделать реверс массива (массив в обратном направлении)
	public void getReversArr()
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int[] resArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--)
		{
			resArr[j] = arr[i];
			j++;
		}
		arr = resArr;
	}

	public void getSortBubble()
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
	}

	public void addEnd(int val)
	{
		if (arr == null)
		{
			throw new IndexOutOfBoundsException();
		}
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = val;
		arr = newArr;
	}

	public void delEnd()
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int[] newArr = new int[arr.length - 1];
		for (int i = 0; i < newArr.length; i++)
		{
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void addStart(int val)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		}
		int[] tmp = new int[arr.length + 1];
		for (int i = 1; i < tmp.length; i++)
		{
			tmp[i] = arr[i - 1];
		}
		tmp[0] = val;
		arr = tmp;
	}

	public void delStart()
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int[] tmp = new int[arr.length - 1];
		for (int i = 0; i < tmp.length; i++)
		{
			tmp[i] = arr[i + 1];
		}
		arr = tmp;
	}

	public void addPos(int val, int pos)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		} else if (pos > arr.length)
		{
			throw new IllegalArgumentException();
		}
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < pos; i++)
		{
			temp[i] = arr[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i < temp.length; i++)
		{
			temp[i] = arr[i];
		}
		arr = temp;
	}
}
