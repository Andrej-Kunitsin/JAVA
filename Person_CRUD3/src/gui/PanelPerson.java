package gui;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

import api.Person;

import comporators.PersonByAge;
import comporators.PersonByFName;
import comporators.PersonById;
import comporators.PersonByLName;

public class PanelPerson extends JPanel
{
	private static final long serialVersionUID = 1L;
	JTable table;
	JScrollPane scrollPane;
	List<Person> list;

	public PanelPerson()
	{
		list = new ArrayList<Person>();
		list.add(new Person(8, "Aash1", "Solo1", 44));
		list.add(new Person(2, "2Dash1", "Solo1", 22));
		list.add(new Person(3, "3Dash1", "Solo1", 33));
		list.add(new Person(5, "4Dash1", "Solo1", 44));
		list.add(new Person(6, "5Dash1", "Solo1", 55));
		list.add(new Person(7, "6Dash1", "Solo1", 66));
		list.add(new Person(8, "7Dash1", "Solo1", 77));

		MyModel mModel = new MyModel(list);
		table = new JTable(mModel);
		scrollPane = new JScrollPane(table);
		table.setPreferredScrollableViewportSize(new Dimension(600, 400));
		add(scrollPane);
		JTableHeader header = table.getTableHeader();
		header.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent arg0)
			{
				int i = table.columnAtPoint(arg0.getPoint());
				String string = table.getColumnName(i);
				switch (string)
				{
				case "Id":
					Collections.sort(list, new PersonById());
					break;
				case "FName":
					Collections.sort(list, new PersonByFName());
					break;
				case "LName":
					Collections.sort(list, new PersonByLName());
					break;
				case "Age":
					Collections.sort(list, new PersonByAge());
					break;

				default:
					break;
				}
			}

			@Override
			public void mouseReleased(MouseEvent arg0)
			{
			}

			@Override
			public void mousePressed(MouseEvent arg0)
			{
			}

			@Override
			public void mouseExited(MouseEvent arg0)
			{
			}

			@Override
			public void mouseEntered(MouseEvent arg0)
			{
			}
		});
	}
}
