package gui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import api.Person;

public class MyModel extends AbstractTableModel
{
	private static final long serialVersionUID = 1L;
	Person p;
	public List<Person> list;

	public MyModel(List<Person> list)
	{
		this.list = list;
	}

	@Override
	public int getColumnCount()
	{
		return 4;
	}

	@Override
	public int getRowCount()
	{
		return list.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		switch (columnIndex)
		{
		case 0:
			return list.get(rowIndex).getId();
		case 1:
			return list.get(rowIndex).getFName();
		case 2:
			return list.get(rowIndex).getLName();
		case 3:
			return list.get(rowIndex).getAge();
		default:
			return null;
		}
	}

	@Override
	public String getColumnName(int c)
	{
		switch (c)
		{
		case 0:
			return "Id";
		case 1:
			return "FName";
		case 2:
			return "LName";
		case 3:
			return "Age";

		default:
			return "";
		}
	}
}
