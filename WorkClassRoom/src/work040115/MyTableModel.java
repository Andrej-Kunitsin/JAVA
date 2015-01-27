package work040115;

import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class MyTableModel extends AbstractTableModel
{
	ArrayList<Person> pp = new ArrayList<Person>();

	public MyTableModel()
	{
		pp.add(new Person(1, "qwe", "asd", 22));
		pp.add(new Person(2, "qwe2", "asd2", 222));
		pp.add(new Person(3, "qwe3", "asd3", 33));
		pp.add(new Person(4, "qwe4", "asd4", 44));
		pp.add(new Person(5, "qwe5", "asd5", 55));
		pp.add(new Person(6, "qwe6", "asd6", 6));
		}

	@Override
	public int getRowCount()
	{
		return pp.size();
	}

	@Override
	public int getColumnCount()
	{
		return 4;
	}

	@Override
	public String getColumnName(int column)
	{
		String[] nameColum =
		{ "Id", "FName", "LName", "Age" };
		return nameColum[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex)
	{
		Object res = null;
		Person p = pp.get(rowIndex);
		switch (columnIndex)
		{
		case 0:
			res = p.getId();
			break;
		case 1:
			res = p.getFName();
			break;
		case 2:
			res = p.getLName();
			break;
		case 3:
			res = p.getAge();
			break;

		default:

			break;
		}
		return res;
	}

}
