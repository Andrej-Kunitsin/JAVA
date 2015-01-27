package work231114RIP;

public class AList1
{
	private int[] arr = new int[100];
	private int index = 0;

	public void setArr(int[] arr)
	{
		init(arr);
	}

	public int size()
	{
		return index;
	}

	public void init(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			this.arr[i] = arr[i];
		}
		index = arr.length;
	}

	public int[] toArray()
	{
		int[] temp = new int[index];
		for (int i = 0; i < index; i++)
		{
			temp[i] = arr[i];
		}
		return temp;
	}

	// Найти мaксимальный элемент массива
	public int getMaxArr()
	{
		int chMax = arr[0];
		for (int i = 0; i < index; i++)
		{
			if (arr[i] > chMax)
			{
				chMax = arr[i];
			}
		}
		return chMax;
	}

	// Найти минимальный элемент массива
	public int getMinArr()
	{
		int chMax = arr[0];
		for (int i = 0; i < index; i++)
		{
			if (arr[i] < chMax)
			{
				chMax = arr[i];
			}
		}
		return chMax;
	}

	// Найти индекс максимального элемента массива
	public int getIndexMaxArr()
	{
		int indexRes = 0;
		int chMax = arr[0];
		for (int i = 1; i < index; i++)
		{
			if (arr[i] > chMax)
			{
				chMax = arr[i];
				indexRes = i;
			}
		}
		return indexRes;
	}

	// Найти индекс минимального элемента массива
	public int getIndexMinArr()
	{

		int indexRes = 0;
		int chMin = arr[0];
		for (int i = 1; i < index; i++)
		{
			if (arr[i] < chMin)
			{
				indexRes = i;
				chMin = arr[i];
			}
		}
		return indexRes;
	}

	// Сделать реверс массива (массив в обратном направлении)
	public void getReversArr()
	{
		int[] resArr = new int[index];
		int j = 0;
		for (int i = index - 1; i >= 0; i--)
		{
			resArr[j] = arr[i];
			j++;
		}
		arr = resArr;
	}

	public void getSortBubble()
	{

		for (int i = index - 1; i >= 1; i--)
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
		arr[index++] = val;
	}

	public void delEnd()
	{
		index--;
	}

	public void addStart(int val)
	{
		index++;
		int[] tmp = new int[index];
		for (int i = 1; i < tmp.length; i++)
		{
			tmp[i] = arr[i - 1];
		}
		tmp[0] = val;
		arr = tmp;

	}

	public void delStart()
	{
		index--;
		int[] tmp = new int[index];
		for (int i = 0; i < tmp.length; i++)
		{
			tmp[i] = arr[i + 1];
		}
		arr = tmp;
	}

	public void addPos(int val, int pos)
	{
		index++;
		int[] temp = new int[index];
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
