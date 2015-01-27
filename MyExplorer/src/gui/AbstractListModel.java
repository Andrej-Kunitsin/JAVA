package gui;

import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

class AbstractListModel implements ListModel<String>
{
	private String[] values;

	public AbstractListModel(List<String> arrlist)
	{
		setVal(arrlist);
	}

	public int getSize()
	{
		return values.length;
	}

	public String getElementAt(int index)
	{
		return values[index];
	}

	public void setVal(List<String> list)
	{
		values = new String[list.size()];
		for (int i = 0; i < list.size(); i++)
		{
			values[i] = list.get(i);
		}
	}

	@Override
	public void addListDataListener(ListDataListener l)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void removeListDataListener(ListDataListener l)
	{
		// TODO Auto-generated method stub

	}
}
