package queryList;

public class QueryList implements QueryInterface
{
	int[] arr;

	@Override
	public void init(int[] array)
	{
		arr = array;
	}

	@Override
	public void add(int val)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		}
		int[] tmp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++)
		{
			tmp[i] = arr[i];
		}
		tmp[tmp.length - 1] = val;
		arr = tmp;
	}

	@Override
	public int del()
	{
		if (arr == null || arr.length == 0)
		{
			throw new NullPointerException();
		}
		int res = arr[0];
		int[] tmp = new int[arr.length - 1];
		for (int i = 0; i < tmp.length; i++)
		{
			tmp[i] = arr[i + 1];
		}
		arr = tmp;
		return res;
	}

	@Override
	public int size()
	{
		return arr.length;
	}

	@Override
	public void clear()
	{
		arr = null;
	}

	@Override
	public int[] toArray()
	{
		return arr;
	}

	int iter = 0;

	public boolean hasNext()
	{
		boolean res = false;
		if (iter < size())
		{
			res = true;
		}
		return res;
	}

	public Object next()
	{
		return arr[iter++];
	}

	public void remove()
	{
		iter = 0;
	}
}
