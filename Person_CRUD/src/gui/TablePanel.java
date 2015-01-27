package gui;

import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;

import api.CRUD;
import api.Person;

public class TablePanel extends JPanel
{
	JScrollPane scrollPane;
	JTable table;
	CRUD crud = new CRUD();
	Person[] persons;

	public TablePanel()
	{
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		try
		{
			persons = crud.readPerson();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		table = new JTable(new MyTableModel());
		scrollPane = new JScrollPane(table);
		//table.setPreferredScrollableViewportSize(new Dimension(500, 130));
		add(scrollPane);
	}

	private class MyTableModel extends AbstractTableModel
	{

		@Override
		public int getRowCount()
		{
			return persons.length;
		}

		@Override
		public int getColumnCount()
		{
			return 4;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex)
		{
			switch (columnIndex)
			{
			case 0:
				return "" + persons[rowIndex].getId();
			case 1:
				return persons[rowIndex].getFName();
			case 2:
				return persons[rowIndex].getLName();
			case 3:
				return "" + persons[rowIndex].getAge();

			default:
				break;
			}
			return null;
		}

	}
}
