package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import api.CRUD;
import api.Person;

public class PanelPerson extends JPanel
{
	JButton btLoad;
	JButton btNew;
	JButton btEdit;
	JButton btDelete;
	JTable table;
	JScrollPane scrollPane;
	MyDataModel dataModel;

	public PanelPerson()
	{
		setLayout(null);
		dataModel = new MyDataModel();
		table = new JTable(dataModel);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		//table.setAutoCreateRowSorter( true );
		TableRowSorter<TableModel>rowSorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(rowSorter);
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(5, 5, 600, 150);

		btLoad = new JButton("Load");
		btLoad.setBounds(610, 5, 100, 30);
		btNew = new JButton("New");
		btNew.setBounds(610, 40, 100, 30);
		btEdit = new JButton("Edit");
		btEdit.setBounds(610, 75, 100, 30);
		btDelete = new JButton("Delete");
		btDelete.setBounds(610, 110, 100, 30);

		add(scrollPane);
		add(btLoad);
		add(btNew);
		add(btEdit);
		add(btDelete);

		btLoad.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				setTable();
			}
		});
		btNew.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JDialog dialog = new PersonDialog(e.getActionCommand());
				dialog.setVisible(true);
				setTable();
			}
		});
		btEdit.addActionListener(new ActionListener()
		{
			JDialog dialog;

			@Override
			public void actionPerformed(ActionEvent e)
			{
				int indexSelectRow = table.getSelectedRow();
				if (indexSelectRow == -1)
				{
					dialog = new PersonDialog(e.getActionCommand());
				} else
				{
					Person p = new Person();
					p.setId((Integer) dataModel.getValueAt(indexSelectRow, 0));
					p.setFName(dataModel.getValueAt(indexSelectRow, 1)
							.toString());
					p.setLName(dataModel.getValueAt(indexSelectRow, 2)
							.toString());
					p.setAge((Integer) dataModel.getValueAt(indexSelectRow, 3));
					dialog = new PersonDialog(e.getActionCommand(), p);
				}
				dialog.setVisible(true);
				setTable();
			}
		});
		btDelete.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				CRUD crud = new CRUD();
				int s;
				int indexSelectRow = table.getSelectedRow();
				if (indexSelectRow == -1)
				{
					s = Integer.parseInt(JOptionPane
							.showInputDialog("ID для удаления"));

				} else
				{
					s = (Integer) dataModel.getValueAt(indexSelectRow, 0);
					int yn = JOptionPane.showConfirmDialog(null,
							"Вы уверены в удалении Person c ID - " + s + " ?",
							null, JOptionPane.YES_NO_OPTION);
					if (yn == 1)
						return;
				}

				try
				{
					crud.deletePerson(s);
				} catch (NumberFormatException e1)
				{
					e1.printStackTrace();
				} catch (SQLException e1)
				{
					e1.printStackTrace();
				}

				setTable();
			}
		});
		setTable();
	}

	private void setTable()
	{
		CRUD crud = new CRUD();
		ResultSet resultSet;
		try
		{
			resultSet = crud.getSt().executeQuery("Select * From PERSON");
			dataModel.setDataSource(resultSet);
			resultSet.close();

		} catch (SQLException e1)
		{
			e1.printStackTrace();
		} catch (Exception e1)
		{
			e1.printStackTrace();
		} finally
		{
			crud.closeConnection();
		}
	}
}
