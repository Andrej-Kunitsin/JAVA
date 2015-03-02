package queryList;

import java.util.Iterator;

public class QueryList implements QueryInterface, Iterator<Object>
{
	Object[] object;

	@Override
	public void init(Object[] arr)
	{
		if (arr == null)
		{
			throw new NullPointerException();
		}
		clear();
		for (int i = 0; i < arr.length; i++)
		{
			object[i] = arr[i];
		}
	}

	@Override
	public void add(Object o)
	{
		Object[] newArr = new Object[object.length + 1];
		for (int i = 0; i < object.length; i++)
		{
			newArr[i] = object[i];
		}
		newArr[newArr.length - 1] = o;
		object = newArr;
	}

	@Override
	public void del()
	{
		Object[] tmp = new Object[size() - 1];
		for (int i = 1; i < object.length; i++)
		{
			tmp[i] = object[i];
			object = tmp;
		}
	}

	@Override
	public int size()
	{
		return object.length;
	}

	@Override
	public void clear()
	{
		object = null;
	}

	@Override
	public Object[] toArray()
	{
		return object;
	}

	int iter = 0;

	@Override
	public boolean hasNext()
	{
		boolean res = false;
		if (iter < size())
		{
			res = true;
		}
		return res;
	}

	@Override
	public Object next()
	{
		return object[iter++];
	}

	@Override
	public void remove()
	{
		iter = 0;
	}
}
